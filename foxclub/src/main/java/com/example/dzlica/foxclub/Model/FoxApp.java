package com.example.dzlica.foxclub.Model;

public class FoxApp {
    String name;
    String tricks;
    String food;
    String drink;


    public FoxApp() {
        this.name = FoxEns.getARandomName();
        this.tricks = FoxEns.getARandomTrick();
        this.food = FoxEns.getARandomFood();
        this.drink = FoxEns.getARandomDrink();
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getTricks() {
        return tricks;
    }


    public void setTricks(String tricks) {
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
}

