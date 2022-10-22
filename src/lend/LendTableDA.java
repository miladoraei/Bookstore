package lend;

import bookPack.Book;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class LendTableDA {
    private Connection conn;

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    protected void addLend(LendTable lendTable) throws SQLException, ParseException {
        Date data = Date.valueOf(lendTable.getStartDate());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        cal.setTime(sdf.parse(lendTable.getStartDate()));
        cal.add(Calendar.DAY_OF_MONTH, 14);
        lendTable.setFinishDate(sdf.format(cal.getTime()));
        PreparedStatement preparedStatement = conn.prepareStatement("insert into lendtable (bookCode , id, startDate , finishDate ) values (?,?,?,?)   ");
        preparedStatement.setString(1, lendTable.getBookcode());
        preparedStatement.setInt(2, lendTable.getId());
        preparedStatement.setString(3, lendTable.getStartDate());
        preparedStatement.setString(4, lendTable.getFinishDate());
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }

    protected void deleteLend(int ID) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("delete from lendtable where id=? ");
        preparedStatement.setInt(1, ID);
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }

    protected List<LendTable> lendTableReader() throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("select * from lendtable ");
        ResultSet resultSet = preparedStatement.executeQuery();
        List<LendTable> tableReader = new ArrayList<>();
        while (resultSet.next()) {
            LendTable lendTable = new LendTable(resultSet.getString("bookCode"), resultSet.getInt("id"), resultSet.getString("startDate"), resultSet.getString("finishDate"));
            tableReader.add(lendTable);
        }
        return tableReader;
    }
}
