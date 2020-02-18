package CoffeeHung;


//Create a class called 'Coffee' that has three properties of name,
//roast, and id. Give it the correct property type i.e. String.
public class Coffee {
    public String name;
    public String roast;
    public int id;

    //Create a constructor that sets all the initial values
    public Coffee(String name, String roast, int id) {
        this.name = name;
        this.roast = roast;
        this.id = id;
    }
//Create getters and setters for each property.
// Hint: You will need 3 setters and 3 getters.

    //-----GETTERS-----//
    public String getName() {
        return name;
    }

    public String getRoast() {
        return roast;
    }

    public int getId() {
        return id;
    }

    //-----SETTERS-----//
    public void setName(String name) {
        this.name = name;
    }

    public void setRoast(String roast) {
        this.roast = roast;
    }

    public void setId(int id) {
        this.id = id;
    }


}
