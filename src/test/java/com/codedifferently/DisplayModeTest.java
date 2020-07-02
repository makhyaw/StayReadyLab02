package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class DisplayModeTest {
   
    @Test
    public void switchDisplayModeTest(){
        //Given 
        DisplayMode dm = new DisplayMode();
        dm.switchDisplayMode();
        String expected = "binary";
        //When
        String actual = dm.getMode();
        //Then 
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getModeTest(){
        //Given 
        DisplayMode dm = new DisplayMode();
        String expected = "decimal";
        //When
        String actual = dm.getMode();
        //Then 
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setModeTest(){
        //Given 
        DisplayMode dm = new DisplayMode();
        dm.setMode("binary");
        String expected = "binary";
        //When
        String actual = dm.getMode();
        //Then 
        Assert.assertEquals(expected, actual);
    }
    



}