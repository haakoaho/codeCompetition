package com.cognizant.codeCompetition.Controller;

import com.cognizant.codeCompetition.Service.GetChallengeService;
import com.cognizant.codeCompetition.challenges.Challenge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("challenge")
public class GetChallengeController {
    @Autowired
    GetChallengeService getChallengeService;
    @GetMapping
    public List<Challenge> getChallenges(){
        return getChallengeService.getChallenges();
    }
}
