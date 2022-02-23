package Antrieb;

import Batterie.Batteriemanagement;
import Kabine.Tacho;

public class Elektromotor {
    private boolean isOn;
    private final Tacho tacho;

    public Elektromotor(Tacho tacho){
        isOn = false;
        this.tacho = tacho;
    }

    public void turnOn(){
        isOn = true;
    }

    public void turnOff(){
        isOn = false;
    }

    public void drive(){
        int speed = tacho.getSpeed();
        int energy = speed * 25 / 2;
        Batteriemanagement.instance.takeOut(energy);
    }
}
