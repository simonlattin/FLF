package Cabin;

public class TurnKnob {

    private char state;
    private int amount;
    private final TurnKnobFunction turnKnobFunction;

    public TurnKnob(TurnKnobFunction turnKnobFunction){
        this.turnKnobFunction = turnKnobFunction;
    }

    public int turn(char state){
        if (this.turnKnobFunction == TurnKnobFunction.ROOFEXTINGUISHER){
            switch (state) {
                case 'A' -> {
                    this.amount = 500;
                    break;
                }
                case 'B' -> {
                    this.amount = 1000;
                    break;
                }
                case 'C' -> {
                    this.amount = 2500;
                    break;
                }
            }
        }
        if (this.turnKnobFunction == TurnKnobFunction.FRONTEXTINGUISHER){
            switch (state) {
                case '1' -> {
                    this.amount = 500;
                    break;
                }
                case '2' -> {
                    this.amount = 1000;
                    break;
                }
                case '3' -> {
                    this.amount = 1500;
                    break;
                }
                case '4' -> {
                    this.amount = 2000;
                    break;
                }
                case '5' -> {
                    this.amount = 2500;
                    break;
                }
                case '6' -> {
                    this.amount = 3000;
                    break;
                }
                case '7' -> {
                    this.amount = 3500;
                    break;
                }
            }
        }
        return amount;
    }

    public TurnKnobFunction getDrehknopfFunktion() {
        return turnKnobFunction;
    }
}
