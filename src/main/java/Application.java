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
        int f = 0;
//        for (int i = 0; i < 50; i++) {
//            for (int j = 0; j < 25; j++) {
//                for (int k = 0; k < 10; k++) {
//                    f++;
//                    System.out.println(Integer.toString(f) + tank.getCapacity()[i][j][k]);
//                    }
//                }
//            }
        }

}
