package Actors;

public abstract class Firefighter {

    private Function function;

    public Firefighter(){

    }

    public void setFunction(Function function) {
        this.function = function;
    }

    public Function getFunction() {
        return function;
    }
}
