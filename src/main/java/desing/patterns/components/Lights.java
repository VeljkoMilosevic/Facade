package desing.patterns.components;

public class Lights {

    public void turnOn() {
        System.out.println("Turning on lights!");
    }

    public void dim(int level) {
        System.out.println(String.format("Lights dimmed to %s!",level));
    }

    public void turnOff() {
        System.out.println("Turning off lights!");
    }
}
