package com.epam.lecture2.award;

public class Award {

    private String title;
    private final int value;
    private boolean isCash;

    public Award(String titleParam, int valueParam, boolean isCashParam) {
        this.title = titleParam;
        this.value = valueParam;
        this.isCash = isCashParam;

    }

    static {
        System.out.println("Award initialized");
    }

    public int getValue() { return value; }


}

