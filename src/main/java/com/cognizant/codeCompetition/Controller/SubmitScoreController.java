package com.cognizant.codeCompetition.Controller;

import com.cognizant.codeCompetition.Model.SubmitCodeModel;
import com.cognizant.codeCompetition.Model.SubmitCodeResponseModel;
import com.cognizant.codeCompetition.Service.SubmitCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("challenge")
public class SubmitScoreController {
    @Autowired
    SubmitCodeService submitCodeService;
    @PostMapping(value = "/submitTask")
    public SubmitCodeResponseModel submitCode(@RequestBody SubmitCodeModel model){
        return  submitCodeService.submitCode(model);
    }
}
