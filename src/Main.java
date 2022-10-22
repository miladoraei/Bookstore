import bookPack.Book;
import bookPack.BookMgr;
import humanPack.Human;
import humanPack.HumanMgr;
import lend.LendTable;
import lend.LendTableDA;
import lend.LendTableMgr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Connection conn;
        try {
            //tarife object ha
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/testnew", "root", "88130007");
            HumanMgr humanMgr = new HumanMgr(conn);
            BookMgr bookMgr = new BookMgr(conn);
            Human milad = new Human("milad", "oraei", "1", "0912xxx", "Tehran");
            Book ghesse = new Book("fairytale", "1991", "001");
            LendTable lendTable = new LendTable("001", 1, "2022-7-15");
            LendTableMgr lendTableMgr = new LendTableMgr(conn);
            //delete kardane dade ghabli ha
            humanMgr.deleteHuman("milad", "oraei");
            bookMgr.deleteBook("fairytale");
            lendTableMgr.deletelend(1);
            //add kardane dade jadida
            humanMgr.addHuman(milad);
            bookMgr.addBook(ghesse);
            lendTableMgr.addLend(lendTable);
            //khundane dadehaye nayahi
            List<Human> humanList = humanMgr.humanList();
            for (Human p : humanList) {
                p.print();
            }
            List<Book> bookList = bookMgr.bookList();
            for (Book q : bookList) {
                q.print();
            }
            List<LendTable> lendTables = lendTableMgr.LendTableReader();
            for (LendTable z : lendTables) {
                z.Print();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}