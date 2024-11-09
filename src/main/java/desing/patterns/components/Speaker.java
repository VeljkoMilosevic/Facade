package desing.patterns.components;

public class Speaker {

    public void turnOff() {
        System.out.println("Turning off speaker!");
    }

    public void turnOn(final String music) {
        System.out.println(String.format("Playing %s music!",music));
    }
}
