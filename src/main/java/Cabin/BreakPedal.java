package Cabin;

public class BreakPedal {

    private int amount;

    public BreakPedal(){

    }

    public void StepOnBrake(int amount){
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}
