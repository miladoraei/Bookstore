package humanPack;

public class Human {
    private String firstName;
    private String secondName;
    private String idNum;
    private String telephone;
    private String addres;

    public Human(String firstName, String secondName, String idNum, String telephone, String addres) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.idNum = idNum;
        this.telephone = telephone;
        this.addres = addres;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }
    public void print()
    {
        System.out.println(String.format("name: %s %s IDNumber: %s, Telephone no: %s and address is %s",firstName,secondName,idNum,telephone,addres));
    }

}

