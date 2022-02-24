package Actors;

import Cabin.Seat;

public abstract class Firefighter {

    protected Function function;

    public void setFunction(Function function) {
        this.function = function;
    }

    public Function getFunction() {
        return function;
    }
}
