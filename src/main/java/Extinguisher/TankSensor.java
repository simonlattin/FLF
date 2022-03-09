package Extinguisher;

public class TankSensor implements ITankSensor{
    private Tank tank;

    public TankSensor(Tank tank){
        this.tank = tank;
    }

    public int checkContents(){
        double j = 100.00;
        if(getTankKind() == TankKind.WATER) {
            j = (double) tank.getAvailableUnits() / 101250 * 100;
        }
        if(getTankKind() == TankKind.FOAM){
            j = (double) tank.getAvailableUnits() / 33750 * 100;
        }
        if(j > 50){
            return 1;
        } else if(j > 25){
            return 2;
        } else if(j > 10){
            return 3;
        } else {
            return 4;
        }
    }

    public TankKind getTankKind(){
        return tank.getTankKind();
    }
}
