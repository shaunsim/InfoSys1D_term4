package e.zddd.lib;

import java.util.ArrayList;

public class Customer {
    private String id;
    private ArrayList<Bill> history;
    private double EWallet;
    private ArrayList<Food> shoppingCart;
    private boolean alert = false;

    Customer(){
    }
    Customer(String id){
        this.id = id;
    }
    Customer(ArrayList<Bill> history){
        this.history = history;
    }
    Customer(double EWallet){
        this.EWallet = EWallet;
    }
    Customer(ArrayList<Food> shoppingCart){
        this.shoppingCart = shoppingCart;
    }
    Customer(boolean alert){
        this.alert = alert;
    }

    public void receiveNotification(String id){
        if(this.id==id){
            this.alert = true;
        }

    }

    public void sendOrder(ArrayList<Food> shoppingCart){
        //TO DO:
        //push the shopping cart info to the server

    }

    public String pay(){
        //TO DO: calculate $$ to be paid (double total)
        double total = 0.0;
        this.EWallet-=total;
        //TO DO: generate an encrypted string to verify that payment is successful
        String encryptedCode =  "";
        return encryptedCode;
    }

    public ArrayList<Food> addFood(Food food){
        if(this.shoppingCart.contains(food)){
            //food.quantity+=1;
        }else{
            this.shoppingCart.add(food);
        }
        return this.shoppingCart;


    }

    public ArrayList<Food> removeFood(Food food){
        if(this.shoppingCart.contains(food)){
            this.shoppingCart.remove(food);
        }
        return this.shoppingCart;
    }

    public void viewMenu(ArrayList<Food> menu){
        //TO DO: display menu on the app
    }

    public void sendAlert(boolean alert){
        if(this.alert==true){
            //TO DO: alert user on the app
        }
    }
}
