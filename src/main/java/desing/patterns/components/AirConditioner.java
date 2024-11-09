package desing.patterns.components;

public class AirConditioner {

    public void turnOn() {
        System.out.println("Turning on air conditioner!");
    }

    public void setTemperature(final int temperature) {
        System.out.println(String.format("Temperate on air conditioner " +
                "set up on " +
                "%s degrees Celsius!",temperature));
    }

    public void turnOff() {
        System.out.println("Turning off air conditioner!");
    }
}
