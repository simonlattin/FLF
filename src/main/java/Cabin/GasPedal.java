package Cabin;

public class GasPedal {

    private int amount;

    public GasPedal(){

    }

    public void StepOnGas(int amount){
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}
