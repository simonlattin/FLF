package Extinguisher;

public class TankSensor implements ITankSensor{
    private Tank tank;

    public TankSensor(Tank tank){
        this.tank = tank;
    }

    public int checkContents(){
        if(tank.getPercentageFull() > 50){
            return 1;
        } else if(tank.getPercentageFull() > 25){
            return 2;
        } else if(tank.getPercentageFull() > 10){
            return 3;
        } else {
            return 4;
        }
    }

    public TankKind getTankKind(){
        return tank.getTankKind();
    }
}
