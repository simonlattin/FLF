package Lights;

import Actors.Subscriber;

public class Indicator extends Subscriber {

    private final Position position;
    private final LED led;

    public Indicator(Position position){
        this.position = position;
        led = new LED();
    }

    public Position getPosition() {
        return position;
    }

    public void On(){
        led.On();
    }

    public void Off(){
        led.Off();
    }
}
