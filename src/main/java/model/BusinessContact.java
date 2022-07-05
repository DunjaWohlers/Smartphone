package model;

public class BusinessContact extends Contact {

    String companyName;

    public BusinessContact(String firstName, String lastName, String company) {
        super(firstName, lastName);
        this.companyName = company;
    }

    @Override
    public String toString() {
        return  lastName + ", " + firstName + "(" + companyName + ")";
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
