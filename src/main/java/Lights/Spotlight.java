package Lights;

public class Spotlight {

    private final Position position;
    private final LED led;


    public Spotlight(Position position){
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
