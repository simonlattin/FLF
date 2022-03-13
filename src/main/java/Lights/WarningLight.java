package Lights;

import Actors.Subscriber;
import com.google.common.eventbus.Subscribe;
import Controls.WarningLightEvent;

public class WarningLight extends Subscriber {

    private final LED led;
    private final Color color;
    private boolean isOn;
    private int eventsHandled;


    public WarningLight(){
        this.color = Color.ORANGE;
        this.led = new LED();
        this.isOn = false;
    }

    public void On(){
        this.led.On();
        this.isOn = true;
    }

    public void Off(){
        this.led.Off();
        this.isOn = false;
    }

    public LED getLed() {
        return led;
    }

    public boolean isOn() {
        return isOn;
    }

    @Subscribe
    public void recieve(WarningLightEvent motorEvent){
        isOn = !isOn;
        eventsHandled++;
    }

    public int getEventsHandled() {
        return eventsHandled;
    }
}
