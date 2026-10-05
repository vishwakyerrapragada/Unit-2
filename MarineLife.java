public class MarineLife {
    public static void main(String[] args) {
        int dolphins = 11;
        int octopus = 8;
        int otters = 4;
        int mantaRay = 2;

        dolphins += 2;
        mantaRay--;
        octopus -= 4;
        int total = dolphins + mantaRay + otters + octopus;

        System.out.println(dolphins > octopus);
        System.out.println("Number of animals: " + total);

    }
}
