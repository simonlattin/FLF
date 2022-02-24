package Actors;

import Cabin.Seat;

public abstract class Firefighter {

    private Function function;
    private Seat seat;

    public Firefighter(){

    }

    public void setFunction(Function function) {
        this.function = function;
    }

    public Function getFunction() {
        return function;
    }

    public void takeSeat(Seat seat){
        seat.setFirefighter(this);
        this.seat = seat;
    }

    public void dismount(){
        this.seat = null;
    }

    public Seat getSeat() {
        return seat;
    }
}
