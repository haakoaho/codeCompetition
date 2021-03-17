package com.cognizant.codeCompetition.challenges;

import com.cognizant.codeCompetition.Model.HighScoreModel;
import com.cognizant.codeCompetition.Model.Stats;
import com.fasterxml.jackson.annotation.JsonIgnore;

public interface Challenge {
     String getDescription();
     double getScore(String input, String output, Stats stats);
     int getId();
     @JsonIgnore
     String getInput();
     @JsonIgnore
     String getCompilerArgs();
}
