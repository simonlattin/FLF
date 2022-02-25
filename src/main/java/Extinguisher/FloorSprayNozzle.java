package Extinguisher;

public class FloorSprayNozzle {

    private final int maxCapacity;
    private int outputAmount;
    private final Tank waterTank;

    public FloorSprayNozzle(Tank waterTank){
        this.maxCapacity = 100;
        this.waterTank = waterTank;
    }

    public void setOutputAmount(int outputAmount) {
        this.outputAmount = outputAmount;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int getOutputAmount() {
        return outputAmount;
    }

    public void spray(){
        this.waterTank.takeOut(100);
    }
}
