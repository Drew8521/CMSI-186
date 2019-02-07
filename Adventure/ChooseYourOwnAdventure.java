import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ChooseYourOwnAdventure {
    private static BufferedReader input = new BufferedReader( new InputStreamReader( System.in ) );

    private static void chooseWater() {
        System.out.println("You have chosen water");
        System.out.println("Please type in the name of the river, the type of vessel you want to use, and the number of people with you.");
        System.out.println("The first two can be any strings, the last one can be any number >= 0. Please separate your choices with commas.");
        System.out.println("For example, you could type: Amazon River, kayak, 3");

        try {
            String inputLine = input.readLine();
            String[] choices = inputLine.split(",");
            String name = choices[0].trim();
            String vessel = choices[1].trim();
            int companions = Integer.parseInt(choices[2].trim());

            Water bodyOfWater = new Water(name, vessel, companions);
            bodyOfWater.getLocationStatus();

            System.out.println("Choose a number: 1, 2, or 3?");
            inputLine = input.readLine();
            int randomNum = Integer.parseInt(inputLine);
            bodyOfWater.getRandomEvent(randomNum);
        }
        catch( IOException ioe ) {
            System.out.println( "Caught IOException -- something bogus happened, dude..." );
        }
    }

    private static void chooseAir() {
        System.out.println("You have chosen air");
        System.out.println("Please type in the name of any geographical region, the type of aircraft you want to use, and the number of people with you.");
        System.out.println("The first two can be any strings, the last one can be any number >= 0. Please separate your choices with commas.");
        System.out.println("For example, you could type: Colorado, plane, 4");

        try {
            String inputLine = input.readLine();
            String[] choices = inputLine.split(",");
            String name = choices[0].trim();
            String vessel = choices[1].trim();
            int companions = Integer.parseInt(choices[2].trim());

            Sky sky = new Sky(name, vessel, companions);
            sky.getLocationStatus();
            
            System.out.println("Choose a number: 1, 2, or 3?");
            inputLine = input.readLine();
            int randomNum = Integer.parseInt(inputLine);
            sky.getRandomEvent(randomNum);
        }
        catch( IOException ioe ) {
            System.out.println( "Caught IOException -- something bogus happened, dude..." );
        }
    }

    private static void chooseLand() {
        System.out.println("You have chosen land");
        System.out.println("Please type in the name of any geographical region, the type of transportation you want to use, and the number of people with you.");
        System.out.println("The first two can be any strings, the last one can be any number >= 0. Please separate your choices with commas.");
        System.out.println("For example, you could type: France, truck, 2");

        try {
            String inputLine = input.readLine();
            String[] choices = inputLine.split(",");
            String name = choices[0].trim();
            String vessel = choices[1].trim();
            int companions = Integer.parseInt(choices[2].trim());

            Land land = new Land(name, vessel, companions);
            land.getLocationStatus();

            System.out.println("Choose a number: 1, 2, or 3?");
            inputLine = input.readLine();
            int randomNum = Integer.parseInt(inputLine);
            land.getRandomEvent(randomNum);
        }
        catch( IOException ioe ) {
            System.out.println( "Caught IOException -- something bogus happened, dude..." );
        }
    }

    public static void main(String[] args) {
        String inputLine = null;
        boolean hasChosenPath = false;

        ChooseYourOwnAdventure currGame = new ChooseYourOwnAdventure();

        System.out.println("------ CHOOSE YOUR OWN ADVENTURE ------");
        System.out.println("Do you wish to travel by water, air, or land?");

        while(!hasChosenPath) {
            System.out.println("Please type in your selection.");
            try {
                inputLine = input.readLine();
                if(inputLine.length() == 0) {
                   continue;
                } else if (inputLine.toUpperCase().equals("WATER")) {
                    hasChosenPath = true;
                    currGame.chooseWater();
                } else if (inputLine.toUpperCase().equals("AIR")) {
                    hasChosenPath = true;
                    currGame.chooseAir();
                } else if (inputLine.toUpperCase().equals("LAND")) {
                    hasChosenPath = true;
                    currGame.chooseLand();
                }
            }
            catch( IOException ioe ) {
                System.out.println( "Caught IOException -- something bogus happened, dude..." );
            }
        }
    }
}



