package humanPack;

import java.sql.Connection;
import java.sql.SQLException;

public class HumanMgr {
    private HumanDA humanDA = new HumanDA();

    //sending connection to data access
    public HumanMgr(Connection connection) {
        humanDA.setCon(connection);
    }

    //Human add mgr
    public void addHuman(Human human) {
        try {
            humanDA.addPeople(human);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //delete Human
    public void deleteHuman(String fName, String sName) {
        try {
            humanDA.deleteHuman(fName, sName);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

