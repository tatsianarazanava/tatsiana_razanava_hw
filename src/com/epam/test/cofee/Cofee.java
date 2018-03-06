package com.epam.test.cofee;

import com.epam.test.hotDrinks.HotDrinks;

public class Cofee extends HotDrinks{
    //constructor
    public Cofee(String name, int price, double volume, double cookingtime) {
        super(name, price, volume, cookingtime);

        System.out.println("Cofee " + getName() + " costs " + getPrice() + " USD");
    }


}
