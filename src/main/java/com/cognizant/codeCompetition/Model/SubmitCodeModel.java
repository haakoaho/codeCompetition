package com.cognizant.codeCompetition.Model;

public class SubmitCodeModel {
    private int taskId;
    private String languageId;
    private String input;
    private String name;

    public String getName() {
        return name;
    }

    public int getTaskId() {
        return taskId;
    }

    public String getLanguageId() {
        return languageId;
    }

    public String getInput() {
        return input;
    }
}
