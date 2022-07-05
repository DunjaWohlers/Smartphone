package model;

public class Friend extends Contact{
    private String telefonNr;




    public Friend(String firstName, String lastName, String telefonNR) {
        super(firstName, lastName);
        this.telefonNr=telefonNR;
    }


    @Override
    public String toString(){
        return "" + lastName + ", " + firstName + " - " + telefonNr;
    }


}
