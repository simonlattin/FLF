package Lights;

public class BreakLight {

    private final Position position;
    private final LED led;

    public BreakLight(Position position){
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
