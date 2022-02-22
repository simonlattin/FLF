package Loescharme;

public class FloorSprayNozzle {

    private final int maxCapacity;
    private int outputAmount;

    public FloorSprayNozzle(){
        this.maxCapacity = 100;
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
}
