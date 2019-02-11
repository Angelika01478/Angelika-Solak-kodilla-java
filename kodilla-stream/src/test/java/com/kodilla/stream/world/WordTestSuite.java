package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;
import stream.world.Continent;
import stream.world.Country;
import stream.world.World;

import java.math.BigDecimal;

public class WordTestSuite {

    @Test
    public void testGetPeopleQuantity(){

        //Given

        //Europe
        Country Russia = new Country("Russia", new BigDecimal("140123456"));
        Country Germany = new Country("Germany", new BigDecimal("84123456"));
        Country France = new Country("France", new BigDecimal("60123456"));
        Country UnitedKingdom = new Country("United Kingdom", new BigDecimal("65123456"));

        //Asia
        Country China = new Country("China", new BigDecimal("1123456789"));
        Country India = new Country("India", new BigDecimal("1000456789"));
        Country Pakistan = new Country("Pakistan", new BigDecimal("200123456"));
        Country Japan = new Country("Japan", new BigDecimal("123456789"));

        //Africa
        Country Nigeria = new Country("China", new BigDecimal("200000000"));
        Country Egypt = new Country("Egypt", new BigDecimal("100000000"));


        Continent Europa = new Continent();
        Continent Asia = new Continent();
        Continent Africa = new Continent();

        Europa.addCountry(Russia);
        Europa.addCountry(Germany);
        Europa.addCountry(France);
        Europa.addCountry(UnitedKingdom);

        Asia.addCountry(China);
        Asia.addCountry(India);
        Asia.addCountry(Pakistan);
        Asia.addCountry(Japan);

        Africa.addCountry(Nigeria);
        Africa.addCountry(Egypt);

        World world = new World();
        world.addConinent(Europa);
        world.addConinent(Asia);
        world.addConinent(Africa);

        //when
       BigDecimal populationOfTheWorld= world.getPeopleQuantity();
       BigDecimal expectedPopulationOfTheWord = new BigDecimal("3096987647");

        //Then
        Assert.assertEquals(expectedPopulationOfTheWord, populationOfTheWorld);
    }

}
