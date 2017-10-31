package com.example.dzlica.foxclub.Model;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.String.valueOf;

public class FoxMaker {
    String name;
    ArrayList<String> tricks;
    String food;
    String drink;


    public FoxMaker() {
        this.name = "Mr. Joe";
        this.tricks = new ArrayList<String>();
        this.food = food;
        this.drink = drink;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public ArrayList<String> getTricks() {
        return tricks;
    }

    public void setTricks(ArrayList<String> tricks) {
        this.tricks = tricks;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }


    public void setDrink(String drink) {
        this.drink = drink;
    }

    @Override
    public String toString() {
        return food;
    }
}

