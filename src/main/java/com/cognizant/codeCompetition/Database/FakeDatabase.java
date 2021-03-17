package com.cognizant.codeCompetition.Database;

import com.cognizant.codeCompetition.Model.HighScoreModel;
import com.cognizant.codeCompetition.Model.ScoreModel;
import com.cognizant.codeCompetition.challenges.Challenge;
import com.cognizant.codeCompetition.challenges.Discount;
import com.cognizant.codeCompetition.challenges.HelloWorld;
import com.cognizant.codeCompetition.challenges.IsPrime;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Component
public class FakeDatabase {
    private HashMap<String, HighScoreModel> highScores = new HashMap<>();
    public FakeDatabase(){
        for(Challenge c : getChallenges()){
            highScores.put(String.valueOf(c.getId()),new HighScoreModel());
        }
    }
    public static List<Challenge> getChallenges(){
        List<Challenge> challenges = new ArrayList<>();
        challenges.add(new HelloWorld());
        challenges.add(new IsPrime());
        challenges.add(new Discount());
        return challenges;
    }
    public HighScoreModel getHighScore(String id){
        return highScores.get(id);
    }
    public void SaveHighScore(String id, ScoreModel score){
        highScores.computeIfAbsent(id,s -> highScores.put(id,new HighScoreModel())).insertScore(score);
    }
}
