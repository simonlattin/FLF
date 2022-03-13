package Lights;

import Actors.Subscriber;
import Controls.SideLightEvent;
import com.google.common.eventbus.Subscribe;


public class SideLight extends Subscriber {
    private final LED led;
    private final Position position;
    private boolean isOn;
    private int eventsHandled;

    public SideLight(Position position){
        this.position = position;
        led = new LED();
        this.isOn = false;
    }

    public void On(){
        led.On();
        this.isOn = true;
    }

    public void Off(){
        led.Off();
        this.isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }

    @Subscribe
    public void recieve(SideLightEvent motorEvent){
        isOn = !isOn;
        eventsHandled++;
        if (isOn) {
            On();
        } else {
            Off();
        }
    }

    public int getEventsHandled() {
        return eventsHandled;
    }
}
