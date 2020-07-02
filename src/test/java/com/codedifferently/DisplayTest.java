package com.codedifferently;

import org.junit.Test;

import org.junit.*;

public class DisplayTest {

    @Test

    public void getDisplayValueTest(){

        // Given
        Display dv = new Display();
        Double expected = 1.0;
        // When
        Double actual = dv.getDisplayValue(); 
        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void setDisplayValueTest(){

        // Given
        Display dv = new Display();
        Double expected = 2.0;
        // When
        dv.setDisplayValue(2.0);
        Double actual = dv.getDisplayValue();
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test

    public void clearDisplayValueTest(){

        // Given
        Display dv = new Display();
        Double expected = 0.0;
        // When
        dv.clearDisplayValue();
        Double actual = dv.getDisplayValue();
        // Then
        Assert.assertEquals(expected, actual);
    }
}