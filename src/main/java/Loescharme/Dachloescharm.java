package Loescharme;

public class Dachloescharm {

    private final int maxCapacity;
    private double extendLength;
    private final int maxExtendLength;
    private int outputAmount;

    public Dachloescharm() {
        this.maxCapacity = 10000;
        this.extendLength = 0;
        this.maxExtendLength = 17;
    }

    public void setOutputAmount(int outputAmount) {
        this.outputAmount = outputAmount;
    }

    public void setExtendLength(double extendLength) {
        this.extendLength = extendLength;
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
}
