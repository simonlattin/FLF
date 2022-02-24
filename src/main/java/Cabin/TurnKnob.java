package Cabin;

public class TurnKnob {

    private char state;
    private int amount;
    private final TurnKnobFunction turnKnobFunction;

    public TurnKnob(TurnKnobFunction turnKnobFunction){
        this.turnKnobFunction = turnKnobFunction;
    }

    public void turn(char state){
        this.state = state;
        if (this.turnKnobFunction == TurnKnobFunction.ROOFEXTINGUISHER){
            switch (state) {
                case 'A' -> {
                    this.amount = 500;
                }
                case 'B' -> {
                    this.amount = 1000;
                }
                case 'C' -> {
                    this.amount = 2500;
                }
            }
        }
        if (this.turnKnobFunction == TurnKnobFunction.FRONTEXTINGUISHER){
            switch (state) {
                case '1' -> {
                    this.amount = 500;
                }
                case '2' -> {
                    this.amount = 1000;
                }
                case '3' -> {
                    this.amount = 1500;
                }
                case '4' -> {
                    this.amount = 2000;
                }
                case '5' -> {
                    this.amount = 2500;
                }
                case '6' -> {
                    this.amount = 3000;
                }
                case '7' -> {
                    this.amount = 3500;
                }
            }
        }
    }

    public TurnKnobFunction getDrehknopfFunktion() {
        return turnKnobFunction;
    }

    public char getState() {
        return state;
    }

    public int getAmount() {
        return amount;
    }
}
