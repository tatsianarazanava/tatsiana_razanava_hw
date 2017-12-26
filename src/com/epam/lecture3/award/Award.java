package com.epam.lecture3.award;

public class Award {

    private String title;
    private int value;
    private double soli;


    public Award(String titleParam, int valueParam, double soliParam) {
        this.title = titleParam;
        this.value = valueParam;
        this.soli = soliParam;

    }



    public int getValue() { return value; }

    public double getSoli() {return soli;}



}

