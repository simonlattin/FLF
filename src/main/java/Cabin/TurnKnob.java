package Cabin;

import Actors.Function;

public class TurnKnob {

    private char state;
    private int amount;
    private final TurnKnobFunction turnKnobFunction;

    public TurnKnob(TurnKnobFunction turnKnobFunction){
        this.turnKnobFunction = turnKnobFunction;
        if(turnKnobFunction == TurnKnobFunction.ROOFEXTINGUISHER){
            state = 'A';
        } else if(turnKnobFunction == TurnKnobFunction.FRONTEXTINGUISHER){
            state = '1';
        }
        amount = 500;
    }

    public void turn(char state){
        this.state = state;
        if (this.turnKnobFunction == TurnKnobFunction.ROOFEXTINGUISHER){
            switch (state) {
                case 'A' -> {
                    this.amount = 500;
                    this.state = 'B';
                }
                case 'B' -> {
                    this.amount = 1000;
                    this.state = 'C';
                }
                case 'C' -> {
                    this.amount = 2500;
                    this.state = 'A';
                }
            }
        }
        if (this.turnKnobFunction == TurnKnobFunction.FRONTEXTINGUISHER){
            switch (state) {
                case '1' -> {
                    this.amount = 500;
                    this.state = '2';
                }
                case '2' -> {
                    this.amount = 1000;
                    this.state = '3';
                }
                case '3' -> {
                    this.amount = 1500;
                    this.state = '4';
                }
                case '4' -> {
                    this.amount = 2000;
                    this.state = '5';
                }
                case '5' -> {
                    this.amount = 2500;
                    this.state = '6';
                }
                case '6' -> {
                    this.amount = 3000;
                    this.state = '7';
                }
                case '7' -> {
                    this.amount = 3500;
                    this.state = '1';
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
