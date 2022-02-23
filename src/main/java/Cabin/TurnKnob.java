package Cabin;

public class TurnKnob {

    private char stufe;
    private int stufe1;
    private final TurnKnobFunction turnKnobFunction;

    public TurnKnob(TurnKnobFunction turnKnobFunction){
        this.turnKnobFunction = turnKnobFunction;
    }

    public int turn(char stufe){
        if (this.turnKnobFunction == TurnKnobFunction.DACHLOESCHARM){
            switch (stufe) {
                case 'A' -> {
                    this.stufe1 = 1;
                    break;
                }
                case 'B' -> {
                    this.stufe1 = 2;
                    break;
                }
                case 'C' -> {
                    this.stufe1 = 3;
                    break;
                }
            }
        }
        if (this.turnKnobFunction == TurnKnobFunction.FRONTWERFER){
            switch (stufe) {
                case '1' -> {
                    this.stufe1 = 1;
                    break;
                }
                case '2' -> {
                    this.stufe1 = 2;
                    break;
                }
                case '3' -> {
                    this.stufe1 = 3;
                    break;
                }
                case '4' -> {
                    this.stufe1 = 4;
                    break;
                }
                case '5' -> {
                    this.stufe1 = 5;
                    break;
                }
                case '6' -> {
                    this.stufe1 = 6;
                    break;
                }
                case '7' -> {
                    this.stufe1 = 7;
                    break;
                }
            }
        }
        return stufe1;
    }

    public TurnKnobFunction getDrehknopfFunktion() {
        return turnKnobFunction;
    }
}
