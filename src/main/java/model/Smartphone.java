package model;

import java.util.Arrays;

public class Smartphone implements Radio, GPS{
    private String model;
    private String manufactorer;
    private Contact[] contacts;
    boolean radioActive=false;


    public Smartphone(){
    }

    public Smartphone(String model, String manufactorer, Contact[] contacts) {
        this.model = model;
        this.manufactorer = manufactorer;
        this.contacts = contacts;
    }

    public void addContact(Contact contact){
        Contact[] ar= new Contact[this.contacts.length+1];
        ar[ar.length-1]=contact;
        for(int i=0;i<ar.length-1;i++){
            ar[i]=this.contacts[i];
        }
        this.contacts=ar;

    }
    public void deleteContact(String contactFirstName){
        boolean error=true;
        Contact[] ar= new Contact[this.contacts.length-1];
        int counter=0;
        for(int i=0;i<this.contacts.length;i++){
            if(this.contacts[i].getFirstName()!=contactFirstName){
                ar[counter]=this.contacts[i];
                counter++;
            }else{
                error=false;
            }
        }
        //Wenn keine Name übereinstimmt ist das ARray trotzdem kürzer, darf dann nich übernommen werden.
        if(!error){
            this.contacts=ar;
        }
    }

    public Contact getContact(int index){
        return this.contacts[index];
    }


    public String getRadioStatus(){
        if(this.radioActive){
            return "Das Radio läuft!";
        }else {
            return "Das Radio ist leise!";
        }
    }
    @Override
    public boolean startRadio() {
        System.out.println("Das Radio macht merkwürdige Geräusche.");
        radioActive=true;
        return true;
    }

    @Override
    public boolean stopRadio() {
        radioActive=false;
        System.out.println("Das Radio hört auf zu spielen.");
        return false;
    }

    @Override
    public String getPosition() {
        return "Du bist HIER!";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufactorer() {
        return manufactorer;
    }

    public void setManufactorer(String manufactorer) {
        this.manufactorer = manufactorer;
    }

    public Contact[] getContacts() {
        return contacts;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "" + model + ' ' + manufactorer + ' ' + ", Kontakte: " + Arrays.toString(contacts);
    }
}
