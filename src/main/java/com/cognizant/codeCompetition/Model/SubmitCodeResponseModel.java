package com.cognizant.codeCompetition.Model;

public class SubmitCodeResponseModel {
    private double score;

    public double getScore() {
        return score;
    }

    public static final class Builder {
        private double score;

        public Builder withScore(double score) {
            this.score = score;
            return this;
        }

        public SubmitCodeResponseModel build() {
            SubmitCodeResponseModel submitCodeResponseModel = new SubmitCodeResponseModel();
            submitCodeResponseModel.score = this.score;
            return submitCodeResponseModel;
        }
    }
}
