package com.driver;

public class BillGenratorImpl implements BillGenerator{
    @Override
            public String getBill(Pizza pizza){
        String temp="";
        temp+="Base Price Of The Pizza: "+pizza.getBasePrice()+"\n";
        if(pizza.getCheeseAdded()){
            temp+="Extra Cheese Added: "+pizza.getCheesePrice()+"\n";
        }
        if(pizza.getExtraToppings()){
            temp+="Extra Toppings Added: "+pizza.getToppingPrice()+"\n";
        }
        if(pizza.getTakeAway()){
            temp+="Paperbag Added: "+pizza.getTakeAwayPrice()+"\n";
        }
        temp+="Total Price: "+pizza.getPrice()+"\n";

        return temp;
    }

}
