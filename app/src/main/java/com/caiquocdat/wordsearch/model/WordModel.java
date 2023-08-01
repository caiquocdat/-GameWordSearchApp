package com.caiquocdat.wordsearch.model;

public class WordModel {
    private int wordID;
    private String wordText;
    private int questionID;

    public WordModel(int wordID, String wordText, int questionID) {
        this.wordID = wordID;
        this.wordText = wordText;
        this.questionID = questionID;
    }

    // getter and setter methods

    public int getWordID() {
        return wordID;
    }

    public void setWordID(int wordID) {
        this.wordID = wordID;
    }

    public String getWordText() {
        return wordText;
    }

    public void setWordText(String wordText) {
        this.wordText = wordText;
    }

    public int getQuestionID() {
        return questionID;
    }

    public void setQuestionID(int questionID) {
        this.questionID = questionID;
    }
}
