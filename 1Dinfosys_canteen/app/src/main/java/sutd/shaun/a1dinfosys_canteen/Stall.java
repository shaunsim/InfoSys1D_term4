package sutd.shaun.a1dinfosys_canteen;

public class Stall {
    private String name;

    private Menu stall_menu;




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Stall needs a default empty menu that is filled?
    // order queue?
    //

    private void remove_food(Food food){
        this.stall_menu.remove(food);
    }
    private void add_food(Food food){
        this.stall_menu.add(food);
    }

    private boolean check_food_availability(Food food){
        return this.stall_menu.food.availability;
    }



}
