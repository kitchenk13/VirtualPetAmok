import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;



public class VirtualPetShelterApp {

    static Timer timer;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> options = new ArrayList<>();
        LinkedList<String> dogs = new LinkedList<String>();
        LinkedList<String> cats = new LinkedList<String>();
        Map<String, String> roboPets = new HashMap<String, String>();
        // deleted map. maybe use a LinkedList?
        Timer timer = new Timer();
        TimerTask tick = new TimerTask() {
            @Override
            public void run() {
                System.out.println(); // put a table displaying petsNames and Status)
            }
        };
        timer.schedule(tick, 0, 600000);

        System.out.println(
                "Welcome, to the towns local shelter! We have dogs and cats as well as robotic cats and robotic dogs!");

        // VirtualPet pet = new VirtualPet("Jax", 5, 5, 5);
        for (int hours = 24; hours < 25; hours++) {
            System.out.println("Enter 1 to see a list of options");
            int optionsList = 1;
            optionsList = input.nextInt();

            options.add("I want to see all the animals.");
            options.add("I want to clean all the dog cages"); // Cleanliness goes up when cleaned
            options.add("I want to clean all the litter boxes"); // Cleanliness goes up when cleaned
            options.add("I dont need any help, I'm going to head out!"); // system.exit?
            options.add("I want to oil the robotic pets");
            options.add("I want to adopt a pet!"); // hide a pet
            options.add("I want to admit a pet!"); // add a pet

            if (optionsList == 1) {
                System.out.println(options);

            }

            dogs.add("Simba");
            dogs.add("Debo");
            dogs.add("Jax");

            cats.add("Mittens");
            cats.add("Trixie");
            cats.add("Fluffy");

            roboPets.put("RD123", "Chico");
            roboPets.put("RC123", "Orangey");

            String dogList = "0";
            dogList = input.nextLine();
            if (dogList == "I want to see all the animals") {
                System.out.println("The dogs we have are " + dogs);
                System.out.println("The cats we have are " + cats);
                System.out.println("The robotic pets we have are " + roboPets);
            }

            if (dogList == "I want to cleann the cages") {
                System.out.println(
                        dogs + "all share a cage that need to be cleaned! Depending on the level it may be quick.");
                System.out.println("Enter F to see the filth level");
                int cageFilth = (int) (Math.random() * 10 + 1);
                int incrementAmount = input.nextInt();
                System.out.println(cageFilth);
                System.out.println("Clean the cage, take the level down to zero");
                System.out.println(incrementAmount - cageFilth);

            }

            if (dogList == "I want to clean the litter boxes!") {
                System.out.println(cats + "all share a litter box!");
            }

            if (dogList == "I dont need any help, Thanks") {
                System.exit(0);
            }

            if (dogList == "oil") {
                System.out.println("Im going to oil the robotic pets joint! Theyre creaking very loudly");
            }

            if (dogList == "I want to adopt a pet") {
                System.out.println("What type of pet would you like to adopt? Dog, Cat, Robotic Pet?");
            }

            String status = input.nextLine();
            status = "yes";

            if (status == "yes") {
                System.out.println("The dogs we have are " + dogs);
                if (status != "yes")
                    System.exit(0);
            }

            System.out.println("To see the status levels of all the pets in the shelter enter 0!");
            int status2 = 0;
            status2 = input.nextInt();
            int thirstLevel = (int) (Math.random() * 10 + 1);
            int energyLevel = (int) (Math.random() * 10 + 1);
            int boredomLevel = (int) (Math.random() * 10 + 1);
            int thirstLevel2 = (int) (Math.random() * 10 + 1);
            int energyLevel2 = (int) (Math.random() * 10 + 1);
            int boredomLevel2 = (int) (Math.random() * 10 + 1);
            int thirstLevel3 = (int) (Math.random() * 10 + 1);
            int energyLevel3 = (int) (Math.random() * 10 + 1);
            int boredomLevel3 = (int) (Math.random() * 10 + 1);
            int thirstLevel4 = (int) (Math.random() * 10 + 1);
            int energyLevel4 = (int) (Math.random() * 10 + 1);
            int boredomLevel4 = (int) (Math.random() * 10 + 1);
            int cleanliness = (int) (Math.random() * 10 + 1);
            int cleanliness2 = (int) (Math.random() * 10 + 1);
            int cleanliness3 = (int) (Math.random() * 10 + 1);
            int cleanliness4 = (int) (Math.random() * 10 + 1);

            if (status2 == 0) {
                System.out.println("The status of Simba's thirst is " + thirstLevel);
                System.out.println("The status of Simba's energy is " + energyLevel);
                System.out.println("The status of Simba's boredom is " + boredomLevel);
                System.out.println("The status of Simba's cleanliness is " + cleanliness);
                System.out.println("The status of Debo's thirst is " + thirstLevel2);
                System.out.println("The status of Debo's energy is " + energyLevel2);
                System.out.println("The status of Debo's boredom is " + boredomLevel2);
                System.out.println("The status of Debo's cleanliness is" + cleanliness2);
                System.out.println("The status of Jax's thirst is " + thirstLevel3);
                System.out.println("The status of Jax's energy is " + energyLevel3);
                System.out.println("The status of Jax's boredom is " + boredomLevel3);
                System.out.println("The status of Jax's cleanliness is " + cleanliness3);
                System.out.println("The status of Melo's thirst is " + thirstLevel4);
                System.out.println("The status of Melo's energy is " + energyLevel4);
                System.out.println("The status of Melo's boredom is " + boredomLevel4);
                System.out.println("The status of Melo's cleanliness is" + cleanliness4);
            }

            System.out.println(
                    "Now you can see the levels of the pets, you should fill all the levels up to 10, besides boredom, take that to zero!");

            int incrementAmount = input.nextInt();

            System.out.println(incrementAmount + thirstLevel + "Simba's thirst needs are met!");
            System.out.println(incrementAmount + energyLevel + "Simba's energy has been refilled!");
            System.out.println(incrementAmount - boredomLevel + "Simba's boredom has been decreased!");
            System.out.println(incrementAmount + thirstLevel2 + "Debo's thirst needs are met!");
            System.out.println(incrementAmount + energyLevel2 + "Debo's energy has been refilled!");
            System.out.println(incrementAmount - boredomLevel2 + "Debos boredom is going down!");
            System.out.println(incrementAmount + thirstLevel3 + "Jax's thirst needs are met!");
            System.out.println(incrementAmount + energyLevel3 + "Jax's energy has been replenished!");
            System.out.println(incrementAmount - boredomLevel3 + "Jax's boredom is decreasing!");
            System.out.println(incrementAmount + thirstLevel4 + "Melo's thirst levels are good now!");
            System.out.println(incrementAmount + energyLevel4 + "Melo's energy level is also good now");
            System.out.println(incrementAmount - boredomLevel4 + "Melo's boreedom has gone all the way down!");

            System.out.println("Now that youre done with that portion would you like to move on to the Robotic pets? Enter yes/no");

            String roboAnswer = "yes";
            if (roboAnswer == "yes") {
                System.out.println("Cool lets go! Enter 5 to see the robotic pets names");
            }

            int roboAnswer2 = 5;
            if (roboAnswer2 == 5) {

                System.out.println("The pets names are " + roboPets);
                System.out.println("Enter 3 to see the oil status of the robotic pets");

            }

            int roboCatOil = (int) (Math.random() * 10 + 1);
            int roboDogOil = (int) (Math.random() * 10 + 1);
            System.out.println("The status of Chico's oil is " + roboDogOil);
            System.out.println("The status of Orangey's oil is " + roboCatOil);

            System.out.println("If the levels are less than 10, fill them up to 10 please");

            int newRoboCatOil = input.nextInt();
            int newRoboDogOil = input.nextInt();

            System.out.println("The new updated oil levels for Orangey are " + newRoboCatOil);
            System.out.println("The new updated oil levels for Chico are " + newRoboDogOil);

            System.out.println("Thanks for youre help, youre free to go!");

            int exit = 0;

            if (exit == 0) {

                System.exit(exit);

            }

        }

    }

}

