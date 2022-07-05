import model.Contact;
import model.Smartphone;
import data.ContactsDB;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        ContactsDB contactsDB = new ContactsDB();
        Contact[] friends = contactsDB.getFriends();
        System.out.println(Arrays.toString(friends));



        Smartphone smart1=new Smartphone();
        smart1.setManufactorer("LEGO");
        smart1.setModel("SimpleEdition");
        smart1.startRadio();
        smart1.setContacts(friends);

        System.out.println(smart1);
        System.out.println(smart1.getRadioStatus());

    }
}
