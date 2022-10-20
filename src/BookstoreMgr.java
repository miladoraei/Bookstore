import java.sql.Connection;
import java.sql.SQLException;

public class BookstoreMgr {
    private BookstoreDA bookstoreDA= new BookstoreDA();
    //sending connection to data access
    public BookstoreMgr(Connection connection) {
        connection= bookstoreDA.getCon();
    }
    //Book add mgr
    public void addBook(Book book)
    {
        try {
            bookstoreDA.addBooks(book);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //Human add mgr
    public void addHuman(Human human)
    {
        try {
            bookstoreDA.addPeople(human);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //delete books
    public void deleteBook(String name)
    {
        try {
            bookstoreDA.deleteBooks(name);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //delete Human
    public void deleteHuman(String fName, String sName)
    {
        try {
            bookstoreDA.deleteHuman(fName,sName);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }



}
