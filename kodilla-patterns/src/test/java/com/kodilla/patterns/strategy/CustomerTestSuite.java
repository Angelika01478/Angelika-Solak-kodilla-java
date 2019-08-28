package com.kodilla.patterns.strategy;

import com.kodilla.patterns.strategy.predictors.BalancedPredictor;
import org.junit.Assert;
import org.junit.Test;

public class CustomerTestSuite {
    @Test
    public void testDefaultInvestingStrategies(){
        //Given
        Customer customer1 = new IndividualCustomer("Angela Solak");
        Customer customer2 = new CorporateCustomer("CompanySS");
        Customer customer3 = new IndividualYoungCustomer("Steaven Salv");

        //When
        String angieShouldBuy = customer1.predict();
        System.out.println("Angela Solak shoud : " + angieShouldBuy);
        //Then
        Assert.assertEquals("[Aggressive predictor] Buy stock of XYZ", angieShouldBuy);
    }


    @Test
    public void testIndividualInvestingStrategy(){
        //Given
        Customer customer1 = new IndividualCustomer("Angela Solak");
        //When
        String angieShouldBuy = customer1.predict();
        System.out.println("Angela Solak shoud : " + angieShouldBuy);
        customer1.setBuyingStrategy(new BalancedPredictor());
        String angieChose =customer1.predict();
        System.out.println("Angela Solak changed strategy " + angieChose);

        Assert.assertEquals("[Balanced predictor] Buy shared units of Fund XYZ", angieChose);

    }
}
