package Lights;

import Actors.Subscriber;
import Controls.BlueLightEvent;
import com.google.common.eventbus.Subscribe;

public class BlueLight extends Subscriber {

    private LED led01;
    private LED led02;
    private LED led03;
    private LED led04;
    private final Position position;
    private boolean isOn;

    public BlueLight(Size size, Position position){

        this.position = position;

        switch (size) {
            case BIG -> {
                this.led01 = new LED();
                this.led02 = new LED();
                this.led03 = new LED();
                this.led04 = new LED();
            }
            case MEDIUM -> {
                this.led01 = new LED();
                this.led02 = new LED();
            }
            case SMALL -> this.led01 = new LED();
        }
    }

    public void On(){
        this.isOn = true;
        led01.On();
        if(led02 != null) {
            led02.On();
        }
        if(led03 != null) {
            led03.On();
            led04.On();
        }
    }

    public void Off(){
        this.isOn = false;
        led01.Off();
        if(led02 != null) {
            led02.Off();
        }
        if(led03 != null) {
            led03.Off();
            led04.Off();
        }
    }

    public boolean isOn() {
        return isOn;
    }

    @Subscribe
    public void recieve(BlueLightEvent motorEvent){
        isOn = !isOn;
        if (isOn){
            On();
        } else {
            Off();
        }
    }
}
