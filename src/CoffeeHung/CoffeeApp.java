package CoffeeHung;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CoffeeApp {


//Create a property of ArrayList<Coffee> coffeeList.
// The property should be public.
    public ArrayList<Coffee> coffeeList;

//Create a constructor that initiates the coffeeList
// (creates a new instance of the coffeeList).
    public CoffeeApp() {
        coffeeList = new ArrayList<>(); //This is the new instance
    }

//Create methods 'addCoffee' to add a coffee to the coffeeList
//Should take in one parameter of type Coffee.
//(no return stated so it'll be void)

    public void addCoffee(Coffee newCoffee) {
        this.coffeeList.add(newCoffee);
    }


//Create methods 'removeCoffee' to remove from the coffeeList
//Should take in one parameter of type Coffee.

    public void removeCoffee(Coffee oldCoffee){
        this.coffeeList.remove(oldCoffee);
    }

//Create an overloaded method called 'addCoffee'
//that allows the user to add a coffee into a specific index of the list.

    public void addCoffee(Coffee newCoffee, int index) {
        this.coffeeList.add(index, newCoffee);
    }

//Create an overloaded method called 'removeCoffee'
//that allows the user to remove a coffee into a specific index of the list.

    public void removeCoffee(int index){
        this.coffeeList.remove(index);
    }
//random add on from hung//
    public static List<String> readFromFile(Path file) throws IOException {
        List<String> readLines = new ArrayList<>();
        readLines = Files.readAllLines(file);
        return readLines;
    }
//Create a 'main' method that tests
//all of your setters, getters, adding, and removing coffee methods.
    public static void main(String[] args) {
        CoffeeApp coffeeApp = new CoffeeApp(); //creating an instance of the coffee app
        //adding//
        coffeeApp.addCoffee(new Coffee("Honey Toast", "Medium", 1));

        //removing//
        coffeeApp.removeCoffee(0);

        try {
            Path coffeeFile = Paths.get("src", "CoffeeHung/coffees.txt");
            CoffeeApp.readFromFile(coffeeFile);
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
    }

}
