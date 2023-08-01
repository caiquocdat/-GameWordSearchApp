package com.caiquocdat.wordsearch.model;

import java.util.List;

public class QuestionModel {
    private int questionID;
    private String questionText;
    private List<String> answer;
    private String typeQuestion;
    private List<WordModel> words;

    public QuestionModel(int questionID, String questionText, List<String> answer, String typeQuestion, List<WordModel> words) {
        this.questionID = questionID;
        this.questionText = questionText;
        this.answer = answer;
        this.typeQuestion = typeQuestion;
        this.words = words;
    }

    public String getTypeQuestion() {
        return typeQuestion;
    }

    public void setTypeQuestion(String typeQuestion) {
        this.typeQuestion = typeQuestion;
    }

    public List<WordModel> getWords() {
        return words;
    }

    public void setWords(List<WordModel> words) {
        this.words = words;
    }
    // getter and setter methods

    public int getQuestionID() {
        return questionID;
    }

    public void setQuestionID(int questionID) {
        this.questionID = questionID;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public List<String> getAnswer() {
        return answer;
    }

    public void setAnswer(List<String> answer) {
        this.answer = answer;
    }
}

