package com.cognizant.codeCompetition.Model;

import java.time.LocalDateTime;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Stats {
    //only need the run time for now
    private double runTimeSeconds;
    public Stats(String s){
        Pattern pattern = Pattern.compile("[\\d\\.]+");
        Matcher matcher = pattern.matcher(s);
        matcher.find();
        String myMatch = matcher.group(0);
        runTimeSeconds = Double.valueOf(matcher.group(0));
    }

    public double getRunTimeSeconds() {
        return runTimeSeconds;
    }
}
