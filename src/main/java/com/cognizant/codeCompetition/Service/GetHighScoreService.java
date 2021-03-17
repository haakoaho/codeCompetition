package com.cognizant.codeCompetition.Service;

import com.cognizant.codeCompetition.Database.FakeDatabase;
import com.cognizant.codeCompetition.Model.HighScoreModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetHighScoreService {
    @Autowired
    FakeDatabase fakeDatabase;
    public HighScoreModel getHighScore(String id){
        return fakeDatabase.getHighScore(id);
    }
}
