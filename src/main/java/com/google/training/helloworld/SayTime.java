package com.google.training.helloworld;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class SayTime {
    public String time = "";
    
    public SayTime () {
    	DateFormat df = DateFormat.getDateTimeInstance (DateFormat.MEDIUM, DateFormat.MEDIUM, new Locale ("en", "EN"));
        this.time = df.format (new Date ());
    }
    
    public String getTime() {
        return time;
    }
}
