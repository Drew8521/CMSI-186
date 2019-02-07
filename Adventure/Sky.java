public class Sky {
    private String name;
    private String vessel;
    private int companions;

    public Sky(String name, String vessel, int companions) {
        this.name = name;
        this.vessel = vessel;
        this.companions = companions;
    }

    public void getLocationStatus() {
        System.out.println("We are now flying above " + this.name + " in a " + this.vessel + " with " + this.companions + " people!");
    }

    public void getRandomEvent(int randomNumber) {
        if (randomNumber == 1) {
            if (this.companions > 0) {
                this.companions -= 1;
                System.out.println("One of your companions has died of dysentery. You now have " + this.companions + " companion(s) left.");
            } else {
                System.out.println("You almost died of dysentery! You really lucked out this time.");
            }
        } else if (randomNumber == 2) {
            this.companions += 2;
            System.out.println("One of your companions decided to adopt twins in the middle of this adventure! You now have " + this.companions  + " companions.");
        } else if (randomNumber == 3) {
            this.companions *= 2;
            System.out.println("You saw another " + this.vessel + " on the horizon and asked the people on it to join you. You now have " + this.companions  + " companions.");
        }
    }
}
