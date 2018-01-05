package com.epam.lecture3.award;

public class Award {

    private String title;
    private int value;
    private Double soli;

    public Award(String titleParam, int valueParam, Double soliParam) {
        this.title = titleParam;
        this.value = valueParam;
        this.soli = soliParam;
    }

    public Award(String titleParam, int valueParam){
        this.title = titleParam;
        this.value = valueParam;
    }

    public int getValue() { return value; }

    public Double getSoli() { return soli; }

    public void setSoli(Double soli) {
        this.soli = soli;
    }

}

