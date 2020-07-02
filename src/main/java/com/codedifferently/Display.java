package com.codedifferently;

public class Display {
    private double currentValue;
    
    public Double getDisplayValue(){
        return currentValue;
    }

    public void setDisplayValue(Double dv){
        currentValue = dv;
    }

    public void clearDisplayValue(){
        currentValue = 0.0;
    }
    
}