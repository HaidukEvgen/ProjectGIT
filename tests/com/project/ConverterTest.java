package com.project;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {
    @Test
    public void testConvertCurrency(){
        int choice = 1;
        int output = 2;
        double input = 1;
        boolean expected = true;
        boolean actual;
        actual = Converter.convertCurrency(choice, output, input);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testConvertLength(){
        int choice = 1;
        int output = 2;
        double input = 1;

        boolean expected = true;
        boolean actual;
        actual = Converter.convertLength(choice, output, input);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testConvertTime(){
        int choice = 1;
        int output = 2;
        double input = 1;
        boolean expected = true;
        boolean actual;
        actual = Converter.convertTime(choice, output, input);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testConvertSquare(){
        int choice = 1;
        int output = 2;
        double input = 1;
        boolean expected = true;
        boolean actual;
        actual = Converter.convertSquare(choice, output, input);
        Assert.assertEquals(expected, actual);
    }
    //    @Test
//    public void testConvertVolume(){
//        int choice = 1;
//        int output = 2;
//        double rate = 100;
//        double input = 1;
//        double result = 0;
//        boolean expected = true;
//        boolean actual;
//        actual = main.com.company.Converter.convertSquare(choice, output, rate, input, result);
//        Assert.assertEquals(expected, actual);
//    }
    @Test
    public void testConvertSpeed(){
        int choice = 1;
        int output = 2;
        double input = 1;
        boolean expected = true;
        boolean actual;
        actual = Converter.convertSpeed(choice, output, input);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testConvertTemperature(){
        int choice = 1;
        int output = 2;
        double input = 1;
        boolean expected = true;
        boolean actual;
        actual = Converter.convertTemperature(choice, output, input);
        Assert.assertEquals(expected, actual);
    }
//    @Test
//    public void testConvertWeight(){
//        int choice = 1;
//        int output = 2;
//        char grad = 176;
//        double input = 1;
//        double result = 0;
//        boolean expected = true;
//        boolean actual;
//        actual = main.com.company.Converter.convertWeight(choice, output, input, result, grad);
//        Assert.assertEquals(expected, actual);
//    }

}
