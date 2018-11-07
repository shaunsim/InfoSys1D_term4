package sutd.shaun.a1dinfosys_canteen;

import java.sql.Time;

public class Bill {
    Double price = 0.0;
    Long timeOrdered;
    String id;
    ArrayList<Food> order;
    Bill(ArrayList<Food> fromShoppingCart){
        this.timeOrdered = System.nanoTime();
        this.id = this.timeOrdered+"10010";
        this.order = fromShoppingCart;
        for (Food food: order){
            this.price += food.getPrice();
        }
    }
}
