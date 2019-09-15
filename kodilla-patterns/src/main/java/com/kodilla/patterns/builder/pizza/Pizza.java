package com.kodilla.patterns.builder.pizza;

import java.util.ArrayList;
import java.util.List;

public final class Pizza {

    private final String bottom;
    private final String sauce;
    private final List<String> ingridients ;


    public static class PizzaBuilder{

        private String bottom;
        private String sauce;
        private final List<String> ingridients = new ArrayList<>();

        public PizzaBuilder bottom(String bottom){
            this.bottom= bottom;
            return this;
        }

        public PizzaBuilder sauce (String souce){
            this.sauce=souce;
            return this;
        }

        public PizzaBuilder ingridient(String ingridient){
            this.ingridients.add(ingridient);
            return this;
        }

        public Pizza build(){
            return new Pizza(bottom, sauce, ingridients);
        }



    }


    private Pizza(final String bottom,final String sauce, final List<String> ingridients) {
        this.bottom = bottom;
        this.sauce = sauce;
        this.ingridients=new ArrayList<>(ingridients);
    }


    public String getBottom() {
        return bottom;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngridients() {
        return ingridients;
    }


    @Override
    public String toString() {
        return "Pizza{" +
                "bottom='" + bottom + '\'' +
                ", sauce='" + sauce + '\'' +
                ", ingridients=" + ingridients +
                '}';
    }
}
