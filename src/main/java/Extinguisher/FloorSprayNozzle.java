package Extinguisher;

import Controls.IFunctionVisitor;

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

    public boolean acceptVisitor(IFunctionVisitor visitor){
        return testFunctionality();
    }

    public boolean testFunctionality(){
        int j = getOutputAmount();
        setOutputAmount(50);
        if(getOutputAmount() == 50){
            setOutputAmount(j);
            return true;
        }
        setOutputAmount(j);
        return false;
    }
}
