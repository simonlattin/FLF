package Lichter;

public class Fahrtrichtungsanzeiger {

    private final Position position;
    private final LED led;

    public Fahrtrichtungsanzeiger(Position position){
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
