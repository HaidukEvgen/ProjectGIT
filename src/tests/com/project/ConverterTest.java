package com.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ConverterTest {
    @Test
    void testConvertCurrency(){
        int choice = 1;
        int output = 2;
        double input = 1;
        boolean expected = true;
        boolean actual;
        actual = Converter.convertCurrency(choice, output, input);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void testConvertLength(){
        int choice = 1;
        int output = 2;
        double input = 1;

        boolean expected = true;
        boolean actual;
        actual = Converter.convertLength(choice, output, input);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void testConvertTime(){
        int choice = 1;
        int output = 2;
        double input = 1;
        boolean expected = true;
        boolean actual;
        actual = Converter.convertTime(choice, output, input);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void testConvertSquare(){
        int choice = 1;
        int output = 2;
        double input = 1;
        boolean expected = true;
        boolean actual;
        actual = Converter.convertSquare(choice, output, input);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void testConvertVolume(){
        int choice = 1;
        int output = 2;
        double rate = 100;
        double input = 1;
        double result = 0;
        boolean expected = true;
        boolean actual;
        actual = Converter.convertSquare(choice, output, input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testConvertSpeed(){
        int choice = 1;
        int output = 2;
        double input = 1;
        boolean expected = true;
        boolean actual;
        actual = Converter.convertSpeed(choice, output, input);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void testConvertTemperature(){
        int choice = 1;
        int output = 2;
        double input = 1;
        boolean expected = true;
        boolean actual;
        actual = Converter.convertTemperature(choice, output, input);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void testConvertWeight(){
        int choice = 1;
        int output = 2;
        double input = 1;
        boolean expected = true;
        boolean actual;
        actual = Converter.convertWeight(choice, output, input);
        Assertions.assertEquals(expected, actual);
    }

}