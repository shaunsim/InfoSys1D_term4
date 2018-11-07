package sutd.shaun.a1dinfosys_canteen;

public class ShoppingCart {
    ArrayList<Food> currentChoice;
    void Checkout(){
        Bill anotherBill = new Bill(currentChoice);
        Orderque.orderque.add(anotherBill);
        currentChoice = new ArrayList<Food>();
    }
    void AddFood(Food food){
        currentChoice.add(food);
    }
    void RemoveFood(Food food){
        if (currentChoice.indexOf(food)>=0){
            currentChoice.remove(food);
        }
    }
}
