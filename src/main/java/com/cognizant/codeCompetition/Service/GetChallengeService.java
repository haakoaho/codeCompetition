package com.cognizant.codeCompetition.Service;

import com.cognizant.codeCompetition.Database.FakeDatabase;
import com.cognizant.codeCompetition.challenges.Challenge;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetChallengeService {
    public List<Challenge> getChallenges(){
        return FakeDatabase.getChallenges();
    }
}
