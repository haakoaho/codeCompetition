package com.cognizant.codeCompetition.FeignClient;

import com.cognizant.codeCompetition.Model.RexterResponseModel;
import com.cognizant.codeCompetition.config.ClientConfig;
import org.apache.http.Header;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name= "rextester", url = "https://rextester.com",configuration = ClientConfig.class)
public interface RextesterClient {
    @RequestMapping(method = RequestMethod.POST, value = "/rundotnet/api" )
    public RexterResponseModel compileCode(@RequestParam String LanguageChoice, @RequestParam String Program,
                                           @RequestParam String Input, @RequestParam String CompilerArgs);
}
