package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int toppings;


    boolean isExtraCheese;
    boolean isExtraToppings;
    boolean forTakeaway;
    boolean isBillGenerated;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price = 300;
            this.toppings = 70;
        }else {
            this.price = 400;
            this.toppings = 120;
        }
        this.bill = "Base Price Of The Pizza: " + this.price +"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isExtraCheese){
            this.price += 80;
            this.isExtraCheese = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if (!isExtraToppings){
            this.price += this.toppings;
            this.isExtraToppings = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!forTakeaway){
            this.price += 20;
            forTakeaway = true;
        }
    }

    public String getBill() {
        // your code goes here
        if (!isBillGenerated) {
            if (isExtraCheese) {
                this.bill += "Extra Cheese Added: 80" + "\n";
            }
            if (isExtraToppings) {
                this.bill += "Extra Toppings Added: " + this.toppings + "\n";
            }
            if (forTakeaway) {
                this.bill += "Paperbag Added: 20" + "\n";
            }
            this.bill += "Total Price: " + this.price;
            return this.bill;
        }
        return "";
    }
}
