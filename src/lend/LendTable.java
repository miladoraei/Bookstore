package lend;

import java.util.Calendar;
import java.sql.Date;

public class LendTable {
    private String bookcode;
    private int id;
    private String startDate;

    public void setFinishDate(String finishDate) {
        this.finishDate = finishDate;
    }

    public String getFinishDate() {
        return finishDate;
    }


    private String finishDate;


    public LendTable(String bookcode, int id, String startDate) {
        this.bookcode = bookcode;
        this.id = id;
        this.startDate = startDate;
    }
    public LendTable(String bookcode, int id, String startDate, String finishDate) {
        this.bookcode = bookcode;
        this.id = id;
        this.startDate = startDate;
        this.finishDate = finishDate;
    }

    public String getBookcode() {
        return bookcode;
    }

    public void setBookcode(String bookcode) {
        this.bookcode = bookcode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void Print() {
        System.out.println(String.format("the user id is %d and the book id is %s and the start date is %s and should taken back before %s",id, bookcode,startDate, finishDate ));
    }
}

