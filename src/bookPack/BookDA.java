package bookPack;

import humanPack.Human;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDA {
    private Connection con;

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    //addbook
    protected void addBooks(Book book  ) throws SQLException {
        PreparedStatement preparedStatement= con.prepareStatement("insert into book (name , pYear, bookCode) values (?,?,?) ");
        preparedStatement.setString(1, book.getName());
        preparedStatement.setString(2, book.getpYear());
        preparedStatement.setString(3, book.getBookCode());
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }
    //deletebook
    protected void deleteBooks(String name) throws SQLException {
        PreparedStatement preparedStatement= con.prepareStatement("delete from book where name=? ");
        preparedStatement.setString(1, name);
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }
    //reader
    protected List<Book> Bookreader() throws SQLException {
        PreparedStatement preparedStatement = con.prepareStatement("select * from book");
        ResultSet resultset = preparedStatement.executeQuery();
        List<Book> bookList = new ArrayList<>();
        while (resultset.next()) {
            Book book = new Book(resultset.getString("name"), resultset.getString("pYear"), resultset.getString("bookcode"));
            bookList.add(book);
        }
        return bookList;
    }
}
