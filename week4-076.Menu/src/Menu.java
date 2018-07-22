
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }

    // add the methods here
    public void addMeal(String meal) {
        if (!meals.contains(meal)) {
            meals.add(meal);
        }
    }
    
    public void printMeals() {
        for (String thing : meals) {
            System.out.println(thing);
        }
    }
    
    public void clearMenu() {
        meals.clear();
    }
}
