package data;

import model.Contact;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactsDBTest {

    @Test
    void getFriends() {
        ContactsDB db= new ContactsDB();
        Contact[] actual=db.getFriends();

    }
}