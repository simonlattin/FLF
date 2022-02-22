package Loescharme;

public class Frontwerfer {

    private final int maxCapacity;
    private int turnAngle;
    private int outputAmount;
    private final Mischanlage mischanlage;
    private int mixingRatio;

    public Frontwerfer(Mischanlage mischanlage){
        this.maxCapacity = 3500;
        this.turnAngle = 0;
        this.mischanlage = mischanlage;
        this.mixingRatio = 0;
    }

    public void setTurnAngle(int turnAngle) {
        this.turnAngle = turnAngle;
    }

    public void setOutputAmount(int outputAmount) {
        this.outputAmount = outputAmount;
    }

    public void setMixingRatio(int ratio){
        this.mischanlage.setMixingRatio(ratio);
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
