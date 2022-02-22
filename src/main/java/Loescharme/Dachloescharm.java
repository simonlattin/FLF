package Loescharme;

public class Dachloescharm {

    private final int maxCapacity;
    private double extendLength;
    private final int maxExtendLength;
    private int outputAmount;
    private final Mischanlage mischanlage;
    private final Segment segment1;
    private final Segment segment2;
    private int mixingRatio;

    public Dachloescharm(Mischanlage mischanlage) {
        this.maxCapacity = 10000;
        this.extendLength = 0;
        this.maxExtendLength = 17;
        this.mischanlage = mischanlage;
        this.segment1 = new Segment(0,true,false);
        this.segment2 = new Segment(17,false,true);
    }

    public void setOutputAmount(int outputAmount) {
        this.outputAmount = outputAmount;
    }

    public void setExtendLength(double extendLength) {
        this.extendLength = extendLength;
    }

    public void extendFirstSegment(){
        this.segment1.setAngle(90);
        this.segment1.extend();
    }

    public void extendSecondSegment(){
        this.segment2.extend();
    }

    public void retractFirstSegment(){
        this.segment1.setAngle(0);
        this.segment1.retract();
    }

    public void retractSecondSegment(){
        this.segment1.retract();
    }

    public void setMixingRatio(int ratio){
        this.mischanlage.setMixingRatio(ratio);
        this.mixingRatio = ratio;
    }

    public int getMixingRatio() {
        return mixingRatio;
    }

    public int getOutputAmount() {
        return outputAmount;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public double getExtendLength() {
        return extendLength;
    }

    public int getMaxExtendLength() {
        return maxExtendLength;
    }

    public Segment getSegment1() {
        return segment1;
    }

    public Segment getSegment2() {
        return segment2;
    }
}
