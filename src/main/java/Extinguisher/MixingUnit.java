package Extinguisher;

public class MixingUnit {

    private String extinguishingAgent;
    private String water;
    private double waterAmount;
    private String foamPowder;
    private double foamPowderAmount;
    private final Tank watertank;
    private final Tank foamtank;
    private int mixingRatio;

    public MixingUnit(Tank waterTank, Tank foamTank){
        this.watertank = waterTank;
        this.foamtank = foamTank;
        this.mixingRatio = 0;
    }

    public void mix(int amount){

        this.foamPowderAmount = (double) amount * ((double) mixingRatio / 100);
        this.waterAmount = amount - this.foamPowderAmount;
        watertank.takeOut((int) waterAmount);
        foamtank.takeOut((int) foamPowderAmount);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < waterAmount; i++){
            sb.append('w');
        }
        for (int j = 0; j < foamPowderAmount; j++){
            sb.append('s');
        }
        this.extinguishingAgent = sb.toString();
    }

    public double getFoamPowderAmount() {
        return foamPowderAmount;
    }

    public double getWaterAmount() {
        return waterAmount;
    }

    public void setMixingRatio(int mixingRatio) {
        this.mixingRatio = mixingRatio;
    }

    public int getMixingRatio() {
        return mixingRatio;
    }

    public String getExtinguishingAgent() {
        return extinguishingAgent;
    }
}
