package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {

    @Test
    void startRadio() {
        Smartphone smart1=new Smartphone();
        boolean actual = smart1.startRadio();
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void stopRadio() {
        Smartphone smart1=new Smartphone();
        boolean actual = smart1.stopRadio();
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testToString() {

    }
}