package com.epam.test;

import com.epam.test.hotDrinks.HotDrinks;
import com.epam.test.cofee.Cofee;
import com.epam.test.tea.Tea;
import com.epam.test.cacao.Cacao;


public class Main {
    public static void main(String[] args){

        Cofee cofee = new Cofee("Espresso", 10, 50, 0.5);
        Cofee cofee1 = new Cofee("Americano", 15, 100, 1);
        Cofee cofee2 = new Cofee("Latte", 20, 100, 1.5);

        Tea tea = new Tea("Black", 2, 150, 1);
        Tea tea1 = new Tea("Green", 3, 150, 1);
        Tea tea2 = new Tea("Herbal", 4, 150, 1);

        Cacao cacao = new Cacao("Cacao", 13, 200, 1.5);

    }

}
