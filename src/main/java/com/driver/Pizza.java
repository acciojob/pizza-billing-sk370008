package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;


    boolean isExtraCheese;
    boolean isExtraToppings;
    boolean forTakeaway;
    boolean isBillGenerated;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price += 300;
        }else {
            this.price += 400;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isExtraCheese){
            this.price += 80;
            isExtraCheese = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if (!isExtraToppings){
            if(isVeg){
                this.price += 70;
            }else {
                this.price += 120;
            }
            isExtraToppings = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!forTakeaway){
            price += 20;
            forTakeaway = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isVeg){
            System.out.println("Base Price Of The Pizza: 300\n");
            if(isExtraCheese) System.out.println("Extra Cheese Added: 80\n");
            if (isExtraToppings) System.out.println("Extra Toppings Added: 70\n");
            if (forTakeaway) System.out.println("Paperbag Added: 20\n");
            if (!isBillGenerated){
                isBillGenerated = true;
                return "Total Price: " + String.valueOf(getPrice()) +"\n";
            }
        }else{
            System.out.println("Base Price Of The Pizza: 400\n");
            if(isExtraCheese) System.out.println("Extra Cheese Added: 80\n");
            if (isExtraToppings) System.out.println("Extra Toppings Added: 120\n");
            if (forTakeaway) System.out.println("Paperbag Added: 20\n");
            if (!isBillGenerated){
                isBillGenerated = true;
                return "Total Price: " + String.valueOf(getPrice()) + "\n";
            }
        }
        return "";
    }
}
