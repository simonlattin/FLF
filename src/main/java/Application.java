import Controls.CentralUnit;

public class Application {

    public static void main(String... args){
//        Tank tank = new Tank(Tankart.WASSER);
//        System.out.println(tank.getAvailableUnits());
//        tank.takeOut(2000);
//        System.out.println(tank.getAvailableUnits());
//        tank.fill(1000);
//        System.out.println(tank.getAvailableUnits());
        CentralUnit unit = new CentralUnit();
        for(int i = 1; i < 7; i++) {
            unit.flipLever(i, true);
            unit.flipLever(i, false);
        }
    }

}
