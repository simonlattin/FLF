import Batterie.Batterie;
import Controls.CentralUnit;
import Loescharme.Tank;
import Loescharme.Tankart;

import java.util.Arrays;

public class Application {

    public static void main(String... args){
        CentralUnit unit = new CentralUnit();
        unit.speedUp(6);
        unit.speedUp(3);
        unit.brake(5);
        unit.turn(30);
        unit.turn(0);
        unit.turn(-30);
    }

}
