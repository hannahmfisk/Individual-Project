import java.util.ArrayList;

import java.util.Scanner;



public class Adoption 

{

static ArrayList<Dog>	availableDogs;

static boolean	adopt	= false;

static String pron;

static int doggie;



public static void main(String[] args)

{

addDogs();

displayWelcome();

makeASelection();








}

public static void endAdoption()

{

System.out.println("Your new dog has already been spayed/neutered as is our center's policy.");

System.out.println("The cost of all dogs at our shelter is $250.");

System.out.println("Thank you for giving " + availableDogs.get(doggie).getName() + " a forever home!");

}



public static void addDogs()

{

availableDogs = new ArrayList<Dog>();

availableDogs.add(new Dog(0,"Molly", "Female", 3, "German Shepard"));

availableDogs.add(new Dog(1, "Spot", "Male", 7, "Dalmation"));

availableDogs.add(new Dog(2, "Koda", "Male", 1, "Huskey"));

availableDogs.add(new Dog(3, "Rufus", "Male", 8, "Labrador mix"));

availableDogs.add(new Dog(4, "Keiki", "Female", 2, "Pug"));

availableDogs.add(new Dog(5, "Dorris", "Female", 5, "Beagle"));

}



public static void displayWelcome()

{

System.out.println("Welcome to Denver Dog Adoption Center!");

System.out.println();

Scanner userInput = new Scanner(System.in);

System.out.println("Would you like to see the available animals?");

String answer = userInput.nextLine();

if (answer.equals("Yes") || answer.equals("yes"))

{

System.out.println("Alrighty! Let's see if we have your new best friend!");

System.out.println("Here are the furry friends I have available:");

System.out.println();

displayDogs();

} 

else

{

System.out.println(

"I know it is a big decision. Hopefully I can help you some time soon though!");

}

}





public static void displayDogs()

{

System.out.println(String.format("%-15s%-15s%-15s%-15s%-15s", "ID", "Name", "Gender", "Age", "Breed"));

System.out.println();

for (Dog p : availableDogs)

{

System.out.println(String.format("%-15s%-15s%-15s%-15s%-15s", p. idNumber, p.name, p.gender, p.age, p.breed));

}

}

public static void makeASelection()

{



while(adopt == false)

{

Scanner userInput = new Scanner(System.in);

System.out.println("Which dog would you like to see? Plese refer to it by it's ID number");

doggie = userInput.nextInt();


if(availableDogs.get(doggie).getAge() >= 7)

{

String nm = availableDogs.get(doggie).getName();

String gen = availableDogs.get(doggie).getGender();

if(gen.equals("Male"))

{

pron = "he";

}

else

{

pron = "she";

}

System.out.println(nm +" might be old but " + pron + " acts like a puppy!"); 

}

else if(availableDogs.get(doggie).getAge()  >3 )

{

String nm = availableDogs.get(doggie).getName();

String gen = availableDogs.get(doggie).getGender();

if(gen.equals("Male"))

{

pron = "he";

}

else

{

pron = "she";

}

System.out.println(nm +" is the perfect age because " + pron + " is already trained!"); 

}

else

{

String nm = availableDogs.get(doggie).getName();

String gen = availableDogs.get(doggie).getGender();

if(gen.equals("Male"))

{

pron = "he";

}

else

{

pron = "she";

}

System.out.println(nm +" is a puppy and " + pron + " loves to play!"); 

}

Scanner userInput1 = new Scanner(System.in);

System.out.println("Would you like to adopt this dog?");

String decision = userInput1.nextLine();


if(decision.equals("Yes") || decision.equals("yes"))

{

adopt = true;

endAdoption();

}

else

{

adopt = false;


}

System.out.println();


}


}


}
