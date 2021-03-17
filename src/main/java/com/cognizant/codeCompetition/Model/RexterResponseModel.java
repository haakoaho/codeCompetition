package com.cognizant.codeCompetition.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RexterResponseModel {
    @JsonProperty
    private String Warnings;
    @JsonProperty
    private String Errors;
    @JsonProperty
    private String Result;
    @JsonProperty
    private String Stats;
    @JsonProperty
    private String Files;
    @JsonProperty
    private boolean NotLoggedIn;

    public void setWarnings(String warnings) {
        Warnings = warnings;
    }

    public void setErrors(String errors) {
        Errors = errors;
    }

    public void setResult(String result) {
        Result = result;
    }

    public void setStats(String stats) {
        Stats = stats;
    }

    public void setFiles(String files) {
        Files = files;
    }

    public void setNotLoggedIn(boolean notLoggedIn) {
        NotLoggedIn = notLoggedIn;
    }

    public String getWarnings() {
        return Warnings;
    }

    public String getErrors() {
        return Errors;
    }

    public String getResult() {
        return Result;
    }

    public String getStats() {
        return Stats;
    }

    public String getFiles() {
        return Files;
    }

    public boolean isNotLoggedIn() {
        return NotLoggedIn;
    }
}
