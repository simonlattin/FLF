import Batterie.Batterie;
import Loescharme.Tank;
import Loescharme.Tankart;

import java.util.Arrays;

public class Application {

    public static void main(String... args){
        Tank tank = new Tank(Tankart.WASSER);
        System.out.println(tank.getAvailableUnits());
        tank.takeOut(2000);
        System.out.println(tank.getAvailableUnits());
        tank.fill(1000);
        System.out.println(tank.getAvailableUnits());
        }

}
