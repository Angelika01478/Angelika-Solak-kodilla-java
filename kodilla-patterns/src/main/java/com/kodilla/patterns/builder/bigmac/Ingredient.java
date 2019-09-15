package com.kodilla.patterns.builder.bigmac;

public class Ingredient {

    public static final String LETTUCE = "LETTUCE";
    public static final String ONION = "ONION";
    public static final String BACON = "BACON";
    public static final String CUCUMBER = "CUCUMBER";
    public static final String CHILI_PEPPERS = "CHILI_PEPPERS";
    public static final String MUSHROOMS = "MUSHROOMS";
    public static final String SHRIMP = "SHRIMP";
    public static final String CHEESE = "CHEESE";
    final private String ingredientName;

    public Ingredient(String ingredientName){

        if(ingredientName.equals(LETTUCE)
        || ingredientName.equals(ONION)
        || ingredientName.equals(BACON)
        || ingredientName.equals(CUCUMBER)
        || ingredientName.equals(CHILI_PEPPERS)
        || ingredientName.equals(MUSHROOMS)
        || ingredientName.equals(SHRIMP)
        || ingredientName.equals(CHEESE)){
            this.ingredientName=ingredientName;
        }else {
            throw  new IllegalStateException("We do not have such ingredient");
        }



    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "ingredientName='" + ingredientName + '\'' +
                '}';
    }
}
