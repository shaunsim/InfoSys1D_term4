package hlcs;
import java.util.ArrayList;

public class Food {
	public String id;
	public double price;
	public int PreparationTime;
	public boolean availability = true;
	public String image; //use 64based string image converter?
	public ArrayList<Food> customization;
	
	
	Food(){
		
	}
	
	Food(String id){
		this.id = id;
	}
	
	Food(double price){
		this.price = price;
	}
	
	Food(int PreparationTime){
		this.PreparationTime = PreparationTime;
	}
	
	Food(boolean availability){
		this.availability = true;
	}
	
	/*Food(String image){
		this.image = image;
	}*/
	
	Food(ArrayList<Food> customization){
		this.customization = customization;
	}
	
	
		
	
	

		
	

}
