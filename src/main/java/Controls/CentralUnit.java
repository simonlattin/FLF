package Controls;

import Axes.Axis;
import Axes.Position;
import Drive.ElectricMotor;
import Cabin.*;
import FLF.FLF;
import Lights.*;

public class CentralUnit {

    private FLF flf;
    private ICommand command;
    private final IFunctionVisitor visitor;

    public CentralUnit(){
        visitor = new FunctionVisitor();
    }

    public void setFLF(FLF flf){
        this.flf = flf;
    }

    public FLF getFLF(){
        return flf;
    }

    public void brake(){
        flf.getBreakLight01().On();
        flf.getBreakLight02().On();
        flf.getCabin().getSpeedDisplay().lowerSpeed();

        flf.getBreakLight01().Off();
        flf.getBreakLight02().Off();
    }

    public void speedUp(){
        flf.getCabin().getSpeedDisplay().speedUp();
    }

    public void drive(){
        flf.getMotor01().drive();
        flf.getMotor02().drive();
    }

    public void turn(int degree){
        flf.getAxis01().turn(degree);
        flf.getAxis02().turn(degree);
        if(degree < 0){
            flf.getIndicator01().On();
            flf.getIndicator03().On();
            flf.getIndicator02().Off();
            flf.getIndicator04().Off();
        } else if(degree > 0){
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

    public void executeCommand(){
        switch(command.execute()){
            case 1 -> turnOnMotor();
            case 2 -> turnOffMotor();
            case 3 -> turnOnWarninglight();
            case 4 -> turnOffWarninglight();
            case 5 -> turnOnBluelights();
            case 6 -> turnOffBluelights();
            case 7 -> turnOnHeadlights();
            case 8 -> turnOffHeadlights();
            case 9 -> turnOnRooflights();
            case 10 -> turnOffRooflights();
            case 11 -> turnOnSidelights();
            case 12 -> turnOffSidelights();
            default -> System.out.println("invalid Command");
        }
    }
    
    public void turnOnMotor(){
        flf.getMotor01().turnOn();
        flf.getMotor02().turnOn();
        sendVisitor();
    }

    public void turnOffMotor(){
        flf.getMotor01().turnOff();
        flf.getMotor02().turnOff();
    }

    public void turnOnWarninglight(){
        flf.getWarningLight().On();
    }

    public void turnOffWarninglight(){
        flf.getWarningLight().Off();
    }

    public void turnOnBluelights(){
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
    
    public void turnOffBluelights(){
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
    }
    
    public void turnOnHeadlights(){
        flf.getSpotlight01().On();
        flf.getSpotlight02().On();
        flf.getSpotlight03().On();
        flf.getSpotlight04().On();
        flf.getSpotlight05().On();
        flf.getSpotlight06().On();
    }

    public void turnOffHeadlights(){
        flf.getSpotlight01().Off();
        flf.getSpotlight02().Off();
        flf.getSpotlight03().Off();
        flf.getSpotlight04().Off();
        flf.getSpotlight05().Off();
        flf.getSpotlight06().Off();
    }
    
    public void turnOnRooflights(){
        flf.getSpotlight07().On();
        flf.getSpotlight08().On();
        flf.getSpotlight09().On();
        flf.getSpotlight10().On();
    }

    public void turnOffRooflights(){
        flf.getSpotlight07().Off();
        flf.getSpotlight08().Off();
        flf.getSpotlight09().Off();
        flf.getSpotlight10().Off();
    }
    
    public void turnOnSidelights(){
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

    public void turnOffSidelights(){
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
    }

    public void setCommand(ICommand newCommand){
        command = newCommand;
    }

    public void sendVisitor(){
        if(!visitor.visit(flf.getFrontExtinguisher())){
            System.out.println("Front Extinguishing Arm isn't working properly");
        }
        if(!visitor.visit(flf.getRoofExtinguisher())){
            System.out.println("Roof Extinguishing Arm isn't working properly");
        }
        if(!visitor.visit(flf.getFloorSprayNozzle1(),flf.getFloorSprayNozzle2(),flf.getFloorSprayNozzle3(),flf.getFloorSprayNozzle4(),flf.getFloorSprayNozzle5(),flf.getFloorSprayNozzle6(),flf.getFloorSprayNozzle7())){
            System.out.println("Floor Spray Nozzles aren't working properly");
        }
        System.out.println("Visitor checked everything");
    }
}
