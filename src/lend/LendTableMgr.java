package lend;

import humanPack.Human;
import humanPack.HumanDA;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

public class LendTableMgr {
    private LendTableDA lendTableDA = new LendTableDA();

    //sending connection to data access
    public LendTableMgr(Connection connection) {
        lendTableDA.setConn(connection);
    }

    //Human add mgr
    public void addLend(LendTable lendTable) {
        try {
            try {
                lendTableDA.addLend(lendTable);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void deletelend(int id)
    {
        try {
            lendTableDA.deleteLend(id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public List<LendTable> LendTableReader()
    {
        try {
            return lendTableDA.lendTableReader();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
