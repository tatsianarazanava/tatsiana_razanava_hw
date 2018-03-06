package com.epam.test.tea;

import com.epam.test.hotDrinks.HotDrinks;

public class Tea extends HotDrinks{
    //constructor
    public Tea (String name, int price, double volume, double cookingtime) {
        super(name, price, volume, cookingtime);

        System.out.println(getName() + " Tea costs " + getPrice() + " USD");
    }


}