package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;

public class Basket {

    private ArrayList<BasketPosition> basketList = new ArrayList();

    public int showBasketSize(){
        return basketList.size();
    }

    public boolean addProduct(BasketPosition basketPosition){
        if(basketPosition.getQuantity()>0){
            basketList.add(basketPosition);
            System.out.println("\n"+basketPosition.getProduct().toString() + "\nadded to basket, quantity: " + basketPosition.getQuantity());
            return true;
        }
        System.out.println(basketPosition.getProduct().toString() + "\nwas not add to basket, try again!");
        return false;
    }

    public boolean removeFromBasket(BasketPosition basketPosition){
       return basketList.remove(basketPosition);
    }

    public void showBasket(){
        int i=0;
        for (BasketPosition position : basketList){
            i++;
            System.out.println("[" + i + "] " + position.getProduct().getType() + ", " + position.getProduct().getProductName() + " amount : " + position.getProduct().getPrice()*position.getQuantity());
        }

       System.out.println("[summary] total amount : " +
               basketList.stream()
                .map(basketPosition -> basketPosition.getProduct().getPrice()*basketPosition.getQuantity())
                .mapToDouble(k->k).sum());

    }

}
