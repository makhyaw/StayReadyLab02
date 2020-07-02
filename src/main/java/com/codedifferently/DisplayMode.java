package com.codedifferently;

public class DisplayMode {
    int i = 0;
    String[] DisplayModeList = {"decimal", "binary", "octal", "hexadecimal"};
    private String whichMode = DisplayModeList[i];


    public void switchDisplayMode(){
        i++;
        if (i == 4){i = 0;}
        this.setMode(DisplayModeList[i]);
        
    }

    public String getMode(){
        return whichMode;
    }
    public void setMode(String mode)
    {
        this.whichMode = mode;
    }
}