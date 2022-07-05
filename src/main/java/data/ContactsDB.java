package data;

import model.BusinessContact;
import model.Contact;
import model.Friend;

public class ContactsDB {
    Contact[] friends ;


    public ContactsDB(){
        Contact friend1 = new Friend("Hallo", "Echo", "011/777");
        Contact friend2 = new Friend ("Moin", "Otto", "XXX/TTT");
        Contact friend3 = new Friend ("Paul", "Brot", "$$$/???");
        Contact friend4 = new Friend ("Bob", "Bert", "123/888");
        Contact contact1 = new BusinessContact("Bob", "Bert", "XCompany");
        Contact[] ar = {friend1,friend2,friend3,friend4,contact1};
        this.friends = new Contact[ar.length];
        for(int i=0;i<ar.length;i++){
            this.friends[i]= ar[i];
        }

    }

    public Contact[] getFriends() {
        return friends;
    }

    public void setFriends(Friend[] friends) {
        this.friends = friends;
    }

}
