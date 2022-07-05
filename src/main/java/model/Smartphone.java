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
