package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {

    private final boolean bun;
    private final int burgers;
    private final Sauce sauce;
    private final List<Ingredient> ingredients ;


    public static class BigMacBuilder{

        private boolean bun;
        private int burgers;
        private Sauce sauce;
        private List<Ingredient> ingredients = new ArrayList<>();

        public BigMacBuilder bun (boolean bun){
            this.bun=bun;
            return this;
        }

        public BigMacBuilder burgers(int burgers){
            this.burgers=burgers;
            return this;
        }

        public BigMacBuilder sauce (String sauce ){
            this.sauce=new Sauce(sauce);
            return this;
        }

        public BigMacBuilder ingredients (String ingredient){
            this.ingredients.add(new Ingredient(ingredient));
            return this;
        }

        public Bigmac build(){
            return new Bigmac(bun, burgers, sauce, ingredients);
        }

    }

    private Bigmac(final boolean bun, final int burgers,  final Sauce sauce, List<Ingredient> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public boolean isBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun=" + bun +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}