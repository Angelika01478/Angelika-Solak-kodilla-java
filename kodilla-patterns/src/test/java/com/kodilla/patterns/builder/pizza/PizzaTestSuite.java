package com.kodilla.patterns.builder.pizza;

import org.junit.Assert;
import org.junit.Test;

public class PizzaTestSuite {
    @Test
    public void testPizzaNew(){

        //given
        Pizza pizza = new Pizza.PizzaBuilder()
                .ingridient("Onion")
                .ingridient("mushrooms")
                .ingridient("becon")
                .ingridient("cheese")
                .ingridient("oregano")
                .sauce("spicy")
                .bottom("thin")
                .build();

        System.out.println(pizza);
        //when
        int howManyIngridents = pizza.getIngridients().size();
        //then
        Assert.assertEquals(5, howManyIngridents);
    }

}
