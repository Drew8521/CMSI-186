class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World! " + args[0] + " " + args[1]); // Display the string.
        System.out.println(Hello.getTwelve());
    }

    public static int getTwelve() {
        return 12;
    }
}
