package com.example.dzlica.foxclub.Model;

public class FoxEns {
    public enum foxName {JOE, BOB, JACK, JANE, KATE, SUSAN}
    public enum foxFood {PIZZA, BURGER, CHIPS, APPLE}
    public enum foxTricks {CODE_IN_JAVA, WRITE_HTML, DEMO}
    public enum foxDrink {COKE, TEA, COFFEE}

    public static String getARandomName() {
        return foxName.values()[(int)(Math.random() * (foxName.values().length))].toString();
    }

    public static String getARandomTrick() {
        return foxTricks.values()[(int)(Math.random() * (foxTricks.values().length))].toString();
    }

    public static String getARandomFood() {
        return foxFood.values()[(int)(Math.random() * (foxFood.values().length))].toString();
    }

    public static String getARandomDrink() {
        return foxDrink.values()[(int)(Math.random() * (foxDrink.values().length))].toString();
    }
}

