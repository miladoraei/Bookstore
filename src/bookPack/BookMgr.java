package bookPack;

import java.sql.Connection;
import java.sql.SQLException;

public class BookMgr {
    private BookDA bookDA = new BookDA();

    //sending connection to data access
    public BookMgr(Connection connection) {
        bookDA.setCon(connection);
    }

    //Book add mgr
    public void addBook(Book book) {
        try {
            bookDA.addBooks(book);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //delete books
    public void deleteBook(String name) {
        try {
            bookDA.deleteBooks(name);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
