package hlcs;
import java.util.ArrayList;

public class Menu{

	public ArrayList<Food> AvailableFood;
	public ArrayList<Food> Toppings;
	Food food = new Food();
	
	Menu(ArrayList<Food> Toppings){
		this.Toppings = Toppings;
	}
	

	
	public ArrayList<Food> add(Food id) {
		if(this.food.availability == false){
		//return False;
		} else {
		this.AvailableFood.add(id);
		
		
	}
		return AvailableFood;
	}
	
	public ArrayList<Food> remove(Food id) {
		this.AvailableFood.remove(id);
		return AvailableFood;
	}
}
