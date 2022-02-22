import Achsen.Achse;
import Achsen.Position;
import Kabine.*;

public class CentralUnit {
    private Bedienpanel panel;
    private Lenkrad steeringWheel;
    private Bremspedal breakPedal;
    private Gaspedal gasPedal;
    private Tacho tacho;
    private Achse frontAxis;
    private Schalter lever1;
    private Schalter lever2;
    private Schalter lever3;
    private Schalter lever4;
    private Schalter lever5;
    private Schalter lever6;
    private Drehknopf knob1;
    private  Drehknopf knob2;

    public CentralUnit(){
        panel = new Bedienpanel();
        steeringWheel = new Lenkrad();
        breakPedal = new Bremspedal();
        gasPedal = new Gaspedal();
        tacho = new Tacho();
        frontAxis = new Achse(Position.VORNE);
    }

    public void brake(int amount){
        for(int i = 0; i < amount; i++){
            tacho.lowerSpeed();
        }
        System.out.println("The speed is now " + tacho.getSpeed() + " km/h.");
    }

    public void speedUp(int amount){
        for(int i = 0; i < amount; i++){
            tacho.speedUp();
        }
        System.out.println("The speed is now " + tacho.getSpeed() + " km/h.");
    }

    public void turn(int winkel){
        frontAxis.turn(winkel);
        System.out.println("The steering degree is " + frontAxis.getLenkWinkel() + "°.");
    }
}
