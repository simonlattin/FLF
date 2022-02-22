package Loescharme;

public class Frontwerfer {

    private final int maxCapacity;
    private int turnAngle;
    private int outputAmount;

    public Frontwerfer(){
        this.maxCapacity = 3500;
        this.turnAngle = 0;
    }

    public void setTurnAngle(int turnAngle) {
        this.turnAngle = turnAngle;
    }

    public void setOutputAmount(int outputAmount) {
        this.outputAmount = outputAmount;
    }

    public int getTurnAngle() {
        return turnAngle;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int getOutputAmount() {
        return outputAmount;
    }
}
