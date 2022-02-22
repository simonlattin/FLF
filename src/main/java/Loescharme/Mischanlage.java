package Loescharme;

public class Mischanlage{

    private String extinguishingAgent;
    private String water;
    private double waterAmount;
    private String foamPowder;
    private double foamPowderAmount;
    private final Tank watertank;
    private final Tank foamtank;

    public Mischanlage(Tank waterTank, Tank foamTank){
        this.watertank = waterTank;
        this.foamtank = foamTank;
    }

    public void mix(int ratio, int amount){

        this.foamPowderAmount = (double) amount * ((double) ratio / 100);
        this.waterAmount = amount - this.foamPowderAmount;
        watertank.takeOut((int) waterAmount);
        foamtank.takeOut((int) foamPowderAmount);

    }

    public double getFoamPowderAmount() {
        return foamPowderAmount;
    }

    public double getWaterAmount() {
        return waterAmount;
    }


}
