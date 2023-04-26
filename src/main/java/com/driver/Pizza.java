package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int vegBasePrice=300;
    private int nonVegBasePrice=400;
    private int cheesePrice=80;
    private int basePrice;
    private Boolean isCheeseAdded;//create new cheeseimpl
    private Boolean isExtraToppings;
    private int vegToppingPrice=70;//create new toppingsimpl
    private int nonVegToppingPrice=120;
    private int toppingPrice;
    private Boolean isTakeAway;
    private int takeAwayPrice=20;
    private BillGenerator billGenerator;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        basePrice=getBasePrice();
        price=basePrice;
        isCheeseAdded=false;
        isExtraToppings=false;
        isTakeAway=false;
        this.billGenerator=new BillGenratorImpl();
        // your code goes here
    }
    public Pizza(Boolean isVeg,BillGenerator billGenerator){
        this.isVeg = isVeg;
        basePrice=getBasePrice();
        price=basePrice;
        isCheeseAdded=false;
        isExtraToppings=false;
        isTakeAway=false;
        this.billGenerator=billGenerator;
        // your code goes here
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Boolean getVeg() {
        return isVeg;
    }

    public void setVeg(Boolean veg) {
        isVeg = veg;
    }

    public void setBill(String bill) {
        this.bill = bill;
    }

    public int getVegBasePrice() {
        return vegBasePrice;
    }

    public void setVegBasePrice(int vegBasePrice) {
        this.vegBasePrice = vegBasePrice;
    }

    public int getNonVegBasePrice() {
        return nonVegBasePrice;
    }

    public void setNonVegBasePrice(int nonVegBasePrice) {
        this.nonVegBasePrice = nonVegBasePrice;
    }

    public int getCheesePrice() {
        return cheesePrice;
    }

    public void setCheesePrice(int cheesePrice) {
        this.cheesePrice = cheesePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public Boolean getCheeseAdded() {
        return isCheeseAdded;
    }

    public void setCheeseAdded(Boolean cheeseAdded) {
        isCheeseAdded = cheeseAdded;
    }

    public Boolean getExtraToppings() {
        return isExtraToppings;
    }

    public void setExtraToppings(Boolean extraToppings) {
        isExtraToppings = extraToppings;
    }

    public int getVegToppingPrice() {
        return vegToppingPrice;
    }

    public void setVegToppingPrice(int vegToppingPrice) {
        this.vegToppingPrice = vegToppingPrice;
    }

    public int getNonVegToppingPrice() {
        return nonVegToppingPrice;
    }

    public void setNonVegToppingPrice(int nonVegToppingPrice) {
        this.nonVegToppingPrice = nonVegToppingPrice;
    }

    public int getToppingPrice() {
        return toppingPrice;
    }

    public void setToppingPrice(int toppingPrice) {
        this.toppingPrice = toppingPrice;
    }

    public Boolean getTakeAway() {
        return isTakeAway;
    }

    public void setTakeAway(Boolean takeAway) {
        isTakeAway = takeAway;
    }

    public int getTakeAwayPrice() {
        return takeAwayPrice;
    }

    public void setTakeAwayPrice(int takeAwayPrice) {
        this.takeAwayPrice = takeAwayPrice;
    }

    public int getBasePrice(){
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
       String bill=billGenerator.getBill(this);
       this.bill=bill;
        return this.bill;
    }
}
