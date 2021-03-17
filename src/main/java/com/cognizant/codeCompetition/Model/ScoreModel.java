package com.cognizant.codeCompetition.Model;

public class ScoreModel implements Comparable<ScoreModel> {
    private String name;
    private double score;

    public ScoreModel(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    @Override
    public int compareTo(ScoreModel o) {
        return  (int)(o.getScore() - getScore());
    }

}
