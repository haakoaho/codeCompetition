package com.cognizant.codeCompetition;

import com.cognizant.codeCompetition.config.ClientConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableFeignClients(defaultConfiguration = ClientConfig.class)
@SpringBootApplication
public class CodeCompetitionApplication {
	public static void main(String[] args) {
		SpringApplication.run(CodeCompetitionApplication.class, args);
	}

}
