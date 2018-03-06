package com.epam.test.hotDrinks;

public abstract class HotDrinks {

    private String name;
    private int price;
    private double volume;
    private double cookingtime;

    public HotDrinks(String name, int price, double volume, double cookingtime){
        this.name = name;
        this.price = price;
        this.volume = volume;
        this.cookingtime = cookingtime;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public double getVolume() {
        return volume;
    }

    public double getCookingtime(){
        return cookingtime;
    }

}
