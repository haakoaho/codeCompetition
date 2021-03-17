package com.cognizant.codeCompetition.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.LinkedList;
import java.util.List;

public class HighScoreModel {
    LinkedList<ScoreModel> scoreModels = new LinkedList<>();
    public void insertScore(ScoreModel score){
        scoreModels.add(score);
        scoreModels.sort(ScoreModel::compareTo);
        if(scoreModels.size() > 5){
            scoreModels.removeLast();
        }
    }
    @JsonProperty("scores")
    public List<ScoreModel> getScoreModels(){
        return scoreModels;
    }
}
