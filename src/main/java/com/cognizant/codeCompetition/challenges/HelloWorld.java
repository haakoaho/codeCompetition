package com.cognizant.codeCompetition.challenges;

import com.cognizant.codeCompetition.Model.Stats;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld implements Challenge {
    @Override
    public String getDescription() {
        return "your task is to create a program that prints the text 'hello world' " +
                "you will be scored only based on your output. Good luck 😉'";
    }

    @Override
    public double getScore(String input, String output, Stats stats) {
        output.toLowerCase();
        if(output.contains("hello world")){
            return 100;
        };
        return 0;
    }

    @Override
    public int getId() {
        return 1;
    }

    @Override
    public String getInput() {
        return "";
    }

    @Override
    public String getCompilerArgs() {
        return "";
    }
}
