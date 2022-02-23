package Cabin;

public class SpeedDisplay {
    private int speed;

    public int getSpeed(){
        return speed;
    }

    public void lowerSpeed(){
        if(speed > 0){
            speed = speed - 4;
        } else {
            System.out.println("The Speed can't be lower than zero!");
        }
    }

    public void speedUp(){
        speed = speed + 4;
    }
}
