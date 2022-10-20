package humanPack;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class HumanDA {
    private Connection con;

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    //addhuman
    protected void addPeople(Human human) throws SQLException {
        PreparedStatement preparedStatement = con.prepareStatement("insert into human (firstName , secondName, idNum , telephone , address) values (?,?,?, ? ,? ) ");
        preparedStatement.setString(1, human.getFirstName());
        preparedStatement.setString(2, human.getSecondName());
        preparedStatement.setString(3, human.getIdNum());
        preparedStatement.setString(4, human.getTelephone());
        preparedStatement.setString(5, human.getAddres());
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }

    //delete human
    protected void deleteHuman(String fName, String sName) throws SQLException {
        PreparedStatement preparedStatement = con.prepareStatement("delete from human where firstName=? , SecondName=?");
        preparedStatement.setString(1, fName);
        preparedStatement.setString(1, sName);
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }
}
