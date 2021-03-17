package com.cognizant.codeCompetition.Controller;

import com.cognizant.codeCompetition.Model.HighScoreModel;
import com.cognizant.codeCompetition.Service.GetHighScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("challenge")
public class GetScoreController {
    @Autowired
    GetHighScoreService getHighScoreService;
    @GetMapping(value ="/highScore")
    public HighScoreModel getHighScore(@RequestParam String id){
        return getHighScoreService.getHighScore(id);
    }

}
