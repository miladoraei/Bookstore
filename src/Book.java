public class Book {
    String name;
    String pYear;
    String bookCode;

    public Book(String name, String pYear, String bookCode) {
        this.name = name;
        this.pYear = pYear;
        this.bookCode = bookCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getpYear() {
        return pYear;
    }

    public void setpYear(String pYear) {
        this.pYear = pYear;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public void print()
    {
        System.out.println(String.format("This is %s book, the publish year is %s and the code book is %s", name, pYear, bookCode));

    }
}
