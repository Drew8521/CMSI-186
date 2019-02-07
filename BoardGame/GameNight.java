public class GameNight {

    public static void main(String[] args) {
        System.out.println("It's board game night! Let's play clue.");

        int round1Location = (int)Math.ceil(Math.random() * 8);
        int round1Weapon = (int)Math.ceil(Math.random() * 6);
        int round1Perp = (int)Math.ceil(Math.random() * 6);

        Clue round1 = new Clue(round1Location, round1Weapon, round1Perp);
        System.out.println(round1.getWhoDunnit());

        System.out.println("That was fun. Let's play a new round of Clue.");

        int round2Location = (int)Math.ceil(Math.random() * 8);
        int round2Weapon = (int)Math.ceil(Math.random() * 6);
        int round2Perp = (int)Math.ceil(Math.random() * 6);

        Clue round2 = new Clue(round2Location, round2Weapon, round2Perp);
        System.out.println(round2.getWhoDunnit());

        System.out.println("Wait - was that the same configuration as the first time? Who did it in the first round?");
        System.out.println(round1.getWhoDunnit());

        System.out.println("Thanks for clearing that up!");
    }
}

