package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class TrigUnitsTest {
    @Test
    public void switchUnitsModeTest(){
        //Given 
        TrigUnits tu = new TrigUnits();
        int now = 1;
        tu.switchUnitsMode(now);
        String expected = "Radians";
        //When
        String actual = tu.getMode();
        //Then 
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void switcUnitsModeTest(){
        //Given 
        TrigUnits tu = new TrigUnits();
        tu.switcUnitsMode("Radians");
        String expected = "Radians";
        //When
        String actual = tu.getMode();
        //Then 
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getModeTest(){
        //Given 
        TrigUnits tu = new TrigUnits();
        String expected = "Degrees";
        //When
        String actual = tu.getMode();
        //Then 
        Assert.assertEquals(expected, actual);
    }
    
    
}