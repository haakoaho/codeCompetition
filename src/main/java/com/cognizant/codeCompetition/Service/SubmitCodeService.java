package com.cognizant.codeCompetition.Service;

import com.cognizant.codeCompetition.Database.FakeDatabase;
import com.cognizant.codeCompetition.FeignClient.RextesterClient;
import com.cognizant.codeCompetition.Model.*;
import com.cognizant.codeCompetition.challenges.Challenge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubmitCodeService {
    @Autowired
    RextesterClient rextesterClient;
    @Autowired
    FakeDatabase fakeDatabase;
    public SubmitCodeResponseModel submitCode(SubmitCodeModel model){
        Challenge challenge = FakeDatabase.getChallenges().stream().filter
                (challenge1 -> challenge1.getId() == model.getTaskId()).findAny().orElseThrow();
        RexterResponseModel rexterResponseModel = rextesterClient.compileCode(model.getLanguageId(), model.getInput(),
                challenge.getInput(),challenge.getCompilerArgs());
        Stats stats = new Stats(rexterResponseModel.getStats());
        double score = challenge.getScore(model.getInput(), rexterResponseModel.getResult(),stats);
        fakeDatabase.SaveHighScore(String.valueOf(challenge.getId()),new ScoreModel(model.getName(),score));
        return new SubmitCodeResponseModel.Builder().withScore(score).build();
    }
}
