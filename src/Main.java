import bookPack.Book;
import bookPack.BookMgr;
import humanPack.Human;
import humanPack.HumanMgr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Connection conn;
        try {
            conn= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/testnew", "root" , "88130007");
            if (conn!=null)
            {
                System.out.println("Connected");
            }
            Human human = new Human("milad", "oraei", "0013801376" , "0912", "Tehran");
            Book book = new Book("ghesse" , "1991", "31");
            HumanMgr humanMgr= new HumanMgr(conn);
            BookMgr bookMgr= new BookMgr(conn);
            humanMgr.addHuman(human);
            bookMgr.addBook(book);
            human.setFirstName("Haniye");
            human.setSecondName("Fathollahi");
            human.setAddres("Tehran");
            human.setIdNum("XXX");
            human.setTelephone("0919");
            humanMgr.addHuman(human);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}