public class Clue {
    private String location;
    private String weapon;
    private String perp;

    public Clue(int randomLocation, int randomWeapon, int randomPerson) {
        System.out.println("Who killed Mr Boddy?");

        // Get the location
        if (randomLocation == 1) {
            this.location = "billiard room";
        } else if (randomLocation == 2) {
            this.location = "kitchen";
        } else if (randomLocation == 3) {
            this.location = "hall";
        } else if (randomLocation == 4) {
            this.location = "study";
        } else if (randomLocation == 5) {
            this.location = "lounge";
        } else if (randomLocation == 6) {
            this.location = "dining room";
        } else if (randomLocation == 7) {
            this.location = "ballroom";
        } else if (randomLocation == 8) {
            this.location = "conservatory";
        } else if (randomLocation == 9) {
            this.location = "library";
        }

        // Get the weapon
        if (randomWeapon == 1) {
            this.weapon = "candlestick";
        } else if (randomWeapon == 2) {
            this.weapon = "dagger";
        } else if (randomWeapon == 3) {
            this.weapon = "lead pipe";
        } else if (randomWeapon == 4) {
            this.weapon = "revolver";
        } else if (randomWeapon == 5) {
            this.weapon = "rope";
        } else if (randomWeapon == 6) {
            this.weapon = "monkey wrench";
        }

        // Get the perp
        if (randomPerson == 1) {
            this.perp = "Miss Scarlet";
        } else if (randomPerson == 2) {
            this.perp = "Professor Plum";
        } else if (randomPerson == 3) {
            this.perp = "Mr. Green";
        } else if (randomPerson == 4) {
            this.perp = "Colonel Mustard";
        } else if (randomPerson == 5) {
            this.perp = "Mrs. White";
        } else if (randomPerson == 6) {
            this.perp = "Mrs. Peacock";
        }
    }

    public String getWhoDunnit() {
        return "It was " + this.perp + " in the " + this.location + " with the " + weapon + "!";
    }
}