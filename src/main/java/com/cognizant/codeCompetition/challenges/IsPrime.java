package com.cognizant.codeCompetition.challenges;

import com.cognizant.codeCompetition.Model.Stats;

public class IsPrime implements Challenge{
    @Override
    public String getDescription() {
        return "You will receive a list of numbers separated by spaces" +
                "concatenate a string with 1 if it is prime and 0 if it is not." +
                "input is between 2 and 1000. Sample input: 2 3 4 5  output: 1101." +
                "In this challenge you will be scored based on number of characters" +
                "in your program, code golf! 🏌️‍♀️.";
    }

    @Override
    public double getScore(String input, String output, Stats stats) {
        if(!output.equals("10110\n")){
            return 0;
        }
        if(input.length() < 200){
            return 100;
        }
        if(input.length() > 1100){
            return 10;
        }
        return 120 - input.length()/10;
    }

    @Override
    public int getId() {
        return 2;
    }

    @Override
    public String getInput() {
        return "2;8;7;997;1000";
    }

    @Override
    public String getCompilerArgs() {
        return null;
    }
}
