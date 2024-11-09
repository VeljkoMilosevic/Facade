package desing.patterns.facade;

import desing.patterns.components.AirConditioner;
import desing.patterns.components.Blinds;
import desing.patterns.components.Camera;
import desing.patterns.components.Lights;
import desing.patterns.components.Speaker;

public class SmartHome {

    private final Lights lights;
    private final Blinds blinds;
    private final AirConditioner airConditioner;
    private final Camera camera;

    private final Speaker speaker;

    public SmartHome(final Lights lights, final Blinds blinds,
              final AirConditioner airConditioner,
              final Camera camera,final Speaker speaker) {
        this.airConditioner = airConditioner;
        this.blinds = blinds;
        this.camera = camera;
        this.lights = lights;
        this.speaker = speaker;
    }

   public void leaveHome() {
        System.out.println("Leaving the home...");
        airConditioner.turnOff();
        lights.turnOff();
        camera.turnOn();
        blinds.lower();
        speaker.turnOff();
        System.out.println("All components setup up!");
    }

    public void enterHome() {
        System.out.println("Enter into the home...");
        airConditioner.turnOn();
        lights.turnOn();
        camera.turnOff();
        speaker.turnOn("relaxing");
        blinds.raise();
        System.out.println("All components setup up!");
    }

    public void activateNightMode() {
        System.out.println("Activating night mode...");
        airConditioner.turnOn();
        airConditioner.setTemperature(20);
        lights.turnOff();
        camera.turnOn();
        speaker.turnOff();
        blinds.lower();
        System.out.println("All components setup up!");
    }

    public void activateMorningMode() {
        System.out.println("Activating morning mode...");
        airConditioner.turnOn();
        airConditioner.setTemperature(23);
        lights.turnOn();
        camera.turnOff();
        speaker.turnOn("motivational");
        blinds.raise();
        System.out.println("All components setup up!");
    }

}


