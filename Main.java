package assignment_codefr;


public class Main {
    public static void main(String[] args) {
        // Create a dog object
        Pet dog = new Pet("Buddy", "Golden", "Male", 10, true);

        // Use dog's methods
        dog.call("Woof");
        dog.eat("Bones");
        dog.sleep();

        System.out.println();  // Line break

        // Create a cat object
        Pet cat = new Pet("Bobby", "Siamese", "Male", 12, true);

        // Use cat's methods
        cat.call("Meow");
        cat.eat("Fish");
        cat.sleep();
    }

}





//why do we put in capsule->it controls who can access it in my class
//Drink drink. drink acts as a parameter that takes the value of Drink.COKE and it uses the 
//switch statement to determine which drink is being requested and returns the corresponding price('cokePrice')
// The switch statement essentially allows the method to take different actions based on the value of the drink parameter. It checks the value of drink and executes the corresponding case block, returning the appropriate price for that particular drink.
//To summarize, the drink parameter in the getPrice method is used to specify which drink's price you want to retrieve from the vending machine, and it should be one of the constants defined in the Drink enum.


