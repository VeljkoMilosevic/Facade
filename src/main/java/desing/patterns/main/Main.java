package desing.patterns.main;

import desing.patterns.components.AirConditioner;
import desing.patterns.components.Blinds;
import desing.patterns.components.Camera;
import desing.patterns.components.Lights;
import desing.patterns.components.Speaker;
import desing.patterns.facade.SmartHome;

public class Main {

    public static void main(String[] args) {
        final Lights lights = new Lights();
        final Blinds blinds = new Blinds();
        final AirConditioner airConditioner = new AirConditioner();
        final Camera camera = new Camera();
        final Speaker speaker = new Speaker();
        SmartHome smartHome = new SmartHome(lights,blinds, airConditioner,camera,speaker);
        smartHome.leaveHome();
        smartHome.enterHome();
        smartHome.activateNightMode();
        smartHome.activateMorningMode();
    }

}