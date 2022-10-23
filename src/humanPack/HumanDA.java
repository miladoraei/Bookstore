package humanPack;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
        PreparedStatement preparedStatement = con.prepareStatement("insert into human (firstName , secondName, idNum , telephone , addres) values (?,?,?, ? ,? ) ");
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
        PreparedStatement preparedStatement = con.prepareStatement("delete from human where firstName=? and secondName=? ");
        preparedStatement.setString(1, fName);
        preparedStatement.setString(2, sName);
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }
    //reader
    protected List<Human> HumanReader() throws SQLException {
        PreparedStatement preparedStatement = con.prepareStatement("select * from human");
        ResultSet resultset = preparedStatement.executeQuery();
        List<Human> humanList = new ArrayList<>();
        while (resultset.next()) {
            Human human = new Human(resultset.getInt("id"),resultset.getString("firstName"), resultset.getString("secondName"), resultset.getString("idNum"), resultset.getString("telephone"), resultset.getString("addres"));
            humanList.add(human);
        }
        return humanList;
    }
}
