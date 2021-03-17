package com.cognizant.codeCompetition.challenges;

import com.cognizant.codeCompetition.Model.Stats;

public class Discount implements Challenge {
    @Override
    public String getDescription() {
        return "You are implementing a discount solution for your client." +
                " She sells products A, B and C. A costs 5, B costs 10, C costs 15." +
                "If the consumer buys 3 As, they get one of them for free(3 for 2). " +
                "For every C they buy beyond the first, they get 5 discount. input is a list" +
                "of products separated by space. You should return the sum of all the products. " +
                "Sample input: 'ABBAAC', output for this would be: 45. You will be scored based on your running time!";
    }

    @Override
    public double getScore(String input, String output, Stats stats) {
        if(Double.parseDouble(output) != 180d){
            return 0;
        }
        return 100 - stats.getRunTimeSeconds() * 10;
    }

    @Override
    public int getId() {
        return 3;
    }

    @Override
    public String getInput() {
        return "A A B A A C A B C A A C A A B A C B A A B C C C A B";
    }

    @Override
    public String getCompilerArgs() {
        return null;
    }
}
