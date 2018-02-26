package com.epam.lecture3.award;

import java.util.Objects;

public class Award {

    private String title;
    private int value;
    private Double soli;
    private String type;
    private Integer id;

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

    //constructor for Award (3):
    public Award(String titleParam, int valueParam, Double soliParam, String typeParam, Integer idParam) {
        this(titleParam, valueParam, soliParam);
        this.type = typeParam;
        this.id = idParam;
    }

    //Getters & Setters:

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String toString() {
        return "soli: " + soli;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, value, soli, type, id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Award award = (Award) o;
        return getValue() == award.getValue() &&
                Objects.equals(getTitle(), award.getTitle()) &&
                Objects.equals(getSoli(), award.getSoli()) &&
                Objects.equals(getType(), award.getType()) &&
                Objects.equals(getId(), award.getId());
    }
}