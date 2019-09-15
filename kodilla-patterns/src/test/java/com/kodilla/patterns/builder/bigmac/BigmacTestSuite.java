package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testBigMac(){
        //Given
        Bigmac bigmac = new Bigmac.BigMacBuilder()
                .bun(true)
                .burgers(2)
                .ingredients(Ingredient.CHEESE)
                .ingredients(Ingredient.CHILI_PEPPERS)
                .ingredients(Ingredient.ONION)
                .sauce(Sauce.BARBECUE)
                .build();

        //when
        System.out.println(bigmac);

        //then
        Assert.assertEquals(3, bigmac.getIngredients().size());
        Assert.assertTrue( bigmac.isBun());
        Assert.assertEquals(2, bigmac.getBurgers());
    }

}
