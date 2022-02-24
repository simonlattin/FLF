package Lights;

public class Spotlight {

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
}
