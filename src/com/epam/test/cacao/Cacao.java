package com.epam.test.cacao;

import com.epam.test.hotDrinks.HotDrinks;

public class Cacao extends HotDrinks{
    //constructor
    public Cacao (String name, int price, double volume, double cookingtime) {
        super(name, price, volume, cookingtime);

        System.out.println(getName() + " costs " + getPrice() + " USD");
    }


}