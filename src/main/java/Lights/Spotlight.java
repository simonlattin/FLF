package Lights;

import Actors.Subscriber;
import Controls.FrontLightEvent;
import Controls.RoofLightEvent;
import com.google.common.eventbus.Subscribe;

public class Spotlight extends Subscriber {

    private final Position position;
    private final LED led;
    private boolean isOn;


    public Spotlight(Position position){
        this.position = position;
        led = new LED();
        this.isOn = false;
    }

    public Position getPosition() {
        return position;
    }

    public void On(){
        led.On();
        this.isOn = true;
    }

    public void Off(){
        led.Off();
        this.isOn = false;
    }

    public boolean isOn(){
        return isOn;
    }

    @Subscribe
    public void recieve(FrontLightEvent motorEvent){
        if (position == Position.FRONTLEFT || position == Position.FRONTRIGHT) {
            isOn = !isOn;
        }
    }

    @Subscribe
    public void recieve(RoofLightEvent motorEvent){
        if (position == Position.ROOF) {
            isOn = !isOn;
        }
    }
}
