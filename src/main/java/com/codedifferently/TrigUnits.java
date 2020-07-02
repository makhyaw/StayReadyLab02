package com.codedifferently;

public class TrigUnits {
    int i = 0;
    String[] TrigUnitsList = {"Degrees", "Radians"};
    private String setMode = TrigUnitsList[i];
        
    public void switchUnitsMode(int number){
        i = number;
        this.setMode(i);
    }

    private void setMode(int number){
        setMode = TrigUnitsList[number];
    }

    public String switcUnitsMode(String mode) {
        this.setMode = mode;
        return setMode;
    }

    public String getMode(){
        return this.setMode;
    }
    
}