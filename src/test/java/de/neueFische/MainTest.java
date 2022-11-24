package de.neueFische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void stringLongerThenTwenty() {
    }

    @Test
    void stringFancy() {
    }

    @Test
    void WennIch5und10Gebe_soll_15Rauskommen() {
        int actual= Main.addieren(20,10);
        assertEquals(30,actual);

    }

    @Test
    void groeßerAls100() {
        boolean actual = Main.groeßerAls100(50);
        assertEquals(false,actual);
    }
    @Test
    void kleinerAls100() {
        boolean actual = Main.groeßerAls100(150);
        assertEquals(true,actual);
    }
    @Test
    void wennDieZahlDurch3TeilbarIstDannFizz(){
        int Fizz = 3;
        String actual= Main.Fizzbuzz(3);
        assertEquals("fizz", actual);

    }
    @Test
    void wennDieZahlDurch5TeilbaristDannBuzz(){
        int buzz = 5;
        String actual = Main.Fizzbuzz(5);
        assertEquals("buzz", actual);
    }

    @Test
    void testSchleife() {

    }
}