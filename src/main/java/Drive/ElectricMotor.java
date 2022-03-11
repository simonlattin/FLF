package Drive;

import Actors.Subscriber;
import Battery.BatteryManagement;
import Cabin.SpeedDisplay;
import Controls.MotorEvent;
import com.google.common.eventbus.Subscribe;

public class ElectricMotor extends Subscriber {
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
        if(isOn) {
            int speed = speedDisplay.getSpeed();
            int energy = speed * 25 / 2;
            BatteryManagement.instance.takeOut(energy);
        } else {
            System.out.println("The motor is switched off");
        }
    }

    public boolean isOn() {
        return isOn;
    }

    @Subscribe
    public void recieve(MotorEvent motorEvent){
        isOn = !isOn;
    }
}
