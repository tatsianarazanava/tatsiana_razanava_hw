package com.epam.lecture3.award;

public class Award {

    private String title;
    private int value;
    private Double soli;

    //constructor for Award (1):
    public Award(String titleParam, int valueParam, Double soliParam) {
        this.title = titleParam;
        this.value = valueParam;
        this.soli = soliParam;
    }

    //constructor for Award (2):
    public Award(String titleParam, int valueParam) {
        this.title = titleParam;
        this.value = valueParam;
    }

    //Getters & Setters:

    public int getValue() {
        return value;
    }

    public Double getSoli() {
        return soli;
    }

    public String getTitle() {
        return title;
    }

    public void setSoli(Double soli) {
        this.soli = soli;
    }

}