package Extinguisher;

public class FrontExtinguisher {

    private final int maxCapacity;
    private int turnAngle;
    private int outputAmount;
    private MixingUnit mixingUnit;
    private int mixingRatio;
    private String extinguishingAgent;
    private boolean isActive;

    public FrontExtinguisher(){
        this.maxCapacity = 3500;
        this.turnAngle = 0;
        this.mixingRatio = 0;
        this.isActive = false;
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

    public void activate() {
        isActive = true;
    }

    public void deactivate() {
        isActive = false;
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

    public String getExtinguishingAgent() {
        return extinguishingAgent;
    }

    public boolean isActive() {
        return isActive;
    }

    public void extiguish(){
        mixingUnit.mix(this.outputAmount);
        this.extinguishingAgent = mixingUnit.getExtinguishingAgent();
    }

    public void setMixingUnit(MixingUnit mixingUnit) {
        this.mixingUnit = mixingUnit;
    }
}
