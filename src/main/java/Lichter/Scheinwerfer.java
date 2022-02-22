package Lichter;

public class Scheinwerfer {

    private Position position;
    private LED led;


    public Scheinwerfer(Position position){
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
