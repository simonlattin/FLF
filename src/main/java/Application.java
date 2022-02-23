import Controls.CentralUnit;

public class Application {

    public static void main(String... args){
        CentralUnit unit = new CentralUnit();
        unit.speedUp(6);
        unit.drive();
        unit.speedUp(3);
        unit.drive();
        unit.brake(5);
        unit.drive();
        unit.turn(30);
        unit.drive();
        unit.turn(0);
        unit.drive();
        unit.turn(-30);
        unit.drive();
    }

}
