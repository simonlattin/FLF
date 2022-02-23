package Extinguisher;

public class FrontExtinguisher {

    private final int maxCapacity;
    private int turnAngle;
    private int outputAmount;
    private final MixingUnit mixingUnit;
    private int mixingRatio;

    public FrontExtinguisher(MixingUnit mixingUnit){
        this.maxCapacity = 3500;
        this.turnAngle = 0;
        this.mixingUnit = mixingUnit;
        this.mixingRatio = 0;
    }

    public void setTurnAngle(int turnAngle) {
        this.turnAngle = turnAngle;
    }

    public void setOutputAmount(int outputAmount) {
        this.outputAmount = outputAmount;
    }

    public void setMixingRatio(int ratio){
        this.mixingUnit.setMixingRatio(ratio);
        this.mixingRatio = ratio;
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

    public int getMixingRatio() {
        return mixingRatio;
    }
}
