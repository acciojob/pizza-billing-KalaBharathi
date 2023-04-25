package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int vegBasePrice=300;
    private int nonVegBasePrice=400;
    private int cheesePrice=80;
    private int basePrice;
    private Boolean isCheeseAdded;
    private Boolean isExtraToppings;
    private int vegToppingPrice=70;
    private int nonVegToppingPrice=120;
    private int toppingPrice;
    private boolean isTakeAway;
    private int takeAwayPrice=20;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        basePrice=getBasePrice();
        price=basePrice;
        isCheeseAdded=false;
        isExtraToppings=false;
        isTakeAway=false;
        // your code goes here
    }
    private int getBasePrice(){
        return isVeg?vegBasePrice:nonVegBasePrice;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isCheeseAdded){
            isCheeseAdded=true;
            price+=cheesePrice;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isExtraToppings){
            isExtraToppings=true;
            if(isVeg) {
                price+=vegToppingPrice;
                toppingPrice=vegToppingPrice;
            }
            else {
                price+=nonVegToppingPrice;
                toppingPrice=nonVegToppingPrice;
            }
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAway){
            isTakeAway=true;
            price+=takeAwayPrice;
        }
    }

    public String getBill(){
        // your code goes here
        String temp="";
        temp+="Base Price Of The Pizza: "+basePrice+"\n";
        if(isCheeseAdded){
            temp+="Extra Cheese Added: "+cheesePrice+"\n";
        }
        if(isExtraToppings){
            temp+="Extra Toppings Added: "+toppingPrice+"\n";
        }
        if(isTakeAway){
            temp+="Paperbag Added: "+takeAwayPrice+"\n";
        }
        temp+="Total Price: "+price+"\n";
        this.bill=temp;
        return this.bill;
    }
}
