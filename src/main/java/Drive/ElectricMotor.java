package Drive;

import Battery.BatteryManagement;
import Cabin.SpeedDisplay;

public class ElectricMotor {
    private boolean isOn;
    private final SpeedDisplay speedDisplay;

    public ElectricMotor(SpeedDisplay speedDisplay){
        isOn = false;
        this.speedDisplay = speedDisplay;
    }

    public void turnOn(){
        isOn = true;
    }

    public void turnOff(){
        isOn = false;
    }

    public void drive(){
        int speed = speedDisplay.getSpeed();
        int energy = speed * 25 / 2;
        BatteryManagement.instance.takeOut(energy);
    }
}