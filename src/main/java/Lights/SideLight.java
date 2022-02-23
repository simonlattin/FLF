package Lights;

public class SideLight {
    private final LED led;
    private final Position position;

    public SideLight(Position position){
        this.position = position;
        led = new LED();
    }

    public void On(){
        led.On();
    }

    public void Off(){
        led.Off();
    }
}
