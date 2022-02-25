package Controls;

import Axes.Axis;
import Axes.Position;
import Drive.ElectricMotor;
import Cabin.*;
import FLF.FLF;
import Lights.*;

public class CentralUnit {

    private FLF flf;

    public CentralUnit(){

    }

    public void setFLF(FLF flf){
        this.flf = flf;
    }

    public void brake(){
        flf.getBreakLight01().On();
        flf.getBreakLight02().On();
        flf.getCabin().getSpeedDisplay().lowerSpeed();

        flf.getBreakLight01().Off();
        flf.getBreakLight02().Off();
        System.out.println("The speed is now " + flf.getCabin().getSpeedDisplay().getSpeed() + " km/h.");
    }

    public void speedUp(){
        flf.getCabin().getSpeedDisplay().speedUp();
        System.out.println("The speed is now " + flf.getCabin().getSpeedDisplay().getSpeed() + " km/h.");
    }

    public void drive(){
        System.out.println("Driving one iteration");
        flf.getMotor01().drive();
        flf.getMotor02().drive();
    }

    public void turn(int winkel){
        flf.getAxis01().turn(winkel);
        flf.getAxis02().turn(winkel);
        System.out.println("w"+winkel);
        if(winkel < 0){
            flf.getIndicator01().On();
            flf.getIndicator03().On();
            flf.getIndicator02().Off();
            flf.getIndicator04().Off();
        } else if(winkel > 0){
            flf.getIndicator01().Off();
            flf.getIndicator03().Off();
            flf.getIndicator02().On();
            flf.getIndicator04().On();
        } else {
            flf.getIndicator01().Off();
            flf.getIndicator03().Off();
            flf.getIndicator02().Off();
            flf.getIndicator04().Off();
        }
        System.out.println("The steering degree is " + flf.getAxis02().getSteeringDegree() + "°.");
    }

    public void flipLever(int leverId, boolean state){
        switch(leverId){
            case 1:
                if(state){
                    flf.getMotor01().turnOff();
                    flf.getMotor02().turnOff();
                } else {
                    flf.getMotor01().turnOn();
                    flf.getMotor02().turnOn();
                }
                break;
            case 2:
                if(state){
                    flf.getWarningLight().Off();
                } else {
                    flf.getWarningLight().On();
                }
                break;
            case 3:
                if(state){
                    flf.getBlueLight01().Off();
                    flf.getBlueLight02().Off();
                    flf.getBlueLight03().Off();
                    flf.getBlueLight04().Off();
                    flf.getBlueLight05().Off();
                    flf.getBlueLight06().Off();
                    flf.getBlueLight07().Off();
                    flf.getBlueLight08().Off();
                    flf.getBlueLight09().Off();
                    flf.getBlueLight10().Off();
                } else {
                    flf.getBlueLight01().On();
                    flf.getBlueLight02().On();
                    flf.getBlueLight03().On();
                    flf.getBlueLight04().On();
                    flf.getBlueLight05().On();
                    flf.getBlueLight06().On();
                    flf.getBlueLight07().On();
                    flf.getBlueLight08().On();
                    flf.getBlueLight09().On();
                    flf.getBlueLight10().On();
                }
                break;
            case 4:
                if(state){
                    flf.getSpotlight01().Off();
                    flf.getSpotlight02().Off();
                    flf.getSpotlight03().Off();
                    flf.getSpotlight04().Off();
                    flf.getSpotlight05().Off();
                    flf.getSpotlight06().Off();
                } else {
                    flf.getSpotlight01().On();
                    flf.getSpotlight02().On();
                    flf.getSpotlight03().On();
                    flf.getSpotlight04().On();
                    flf.getSpotlight05().On();
                    flf.getSpotlight06().On();
                }
                break;
            case 5:
                if(state){
                    flf.getSpotlight07().Off();
                    flf.getSpotlight08().Off();
                    flf.getSpotlight09().Off();
                    flf.getSpotlight10().Off();
                } else {
                    flf.getSpotlight07().On();
                    flf.getSpotlight08().On();
                    flf.getSpotlight09().On();
                    flf.getSpotlight10().On();
                }
                break;
            case 6:
                if(state){
                    flf.getRightSide1().Off();
                    flf.getRightSide2().Off();
                    flf.getRightSide3().Off();
                    flf.getRightSide4().Off();
                    flf.getRightSide5().Off();
                    flf.getLeftSide1().Off();
                    flf.getLeftSide2().Off();
                    flf.getLeftSide3().Off();
                    flf.getLeftSide4().Off();
                    flf.getLeftSide5().Off();
                } else {
                    flf.getRightSide1().On();
                    flf.getRightSide2().On();
                    flf.getRightSide3().On();
                    flf.getRightSide4().On();
                    flf.getRightSide5().On();
                    flf.getLeftSide1().On();
                    flf.getLeftSide2().On();
                    flf.getLeftSide3().On();
                    flf.getLeftSide4().On();
                    flf.getLeftSide5().On();
                }
                break;
        }
    }
}
