public class Human {
    String firstName;
    String secondName;
    String idNum;
    String telephone;
    String addres;

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
}

