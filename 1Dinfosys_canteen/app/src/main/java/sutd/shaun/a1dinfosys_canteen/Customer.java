package sutd.shaun.a1dinfosys_canteen;

import java.util.ArrayList;

public class Customer {
    private String id;
    private ArrayList<Bill> history;
    private double EWallet;
    private ArrayList<Food> shoppingCart;
    private boolean alert = false;

    //constructor
    Customer(){
    }

    public String getId(){
        return this.id;
    }
    public void setId(String id){
        this.id = id;
    }


    public ArrayList<Bill> getHistory(){
        return this.history;
    }
    public void setHistory(ArrayList<Bill>){
        this.history = history;
    }


    public double getEWallet(){
        return this.EWallet;
    }
    public void setEWallet(double EWallet){
        this.EWallet = EWallet;
    }


    public ArrayList<Food> getShoppingCart(){
        this.shoppingCart = shoppingCart;
    }
    public void setShoppingCart(ArrayList<Food> shoppingCart){
        this.shoppingCart = shoppingCart;
    }


    public boolean getAlert(){
        return this.alert;
    }
    public void setAlert(boolean alert){
        this.alert = alert;
    }


    //methods:
    public void receiveNotification(String id){
        //TO DO: observer/subscriber, if status changes for a food item,
        //set alert to be true (to activate food buzzer in the app)
        setAlert(boolean True);
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
        }else{
            //TO DO: print an error message that the food cannot be removed as
            //it is not in the shopping cart
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
