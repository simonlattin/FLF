package Controls;

import Axes.Axis;
import Axes.Position;
import Drive.ElectricMotor;
import Cabin.*;
import Lights.*;

public class CentralUnit {
    private final SpeedDisplay speedDisplay;
    private final Axis frontAxis;
    private final SideLight rightSide1;
    private final SideLight rightSide2;
    private final SideLight rightSide3;
    private final SideLight rightSide4;
    private final SideLight rightSide5;
    private final SideLight leftSide1;
    private final SideLight leftSide2;
    private final SideLight leftSide3;
    private final SideLight leftSide4;
    private final SideLight leftSide5;
    private final Spotlight spotlight01;
    private final Spotlight spotlight02;
    private final Spotlight spotlight03;
    private final Spotlight spotlight04;
    private final Spotlight spotlight05;
    private final Spotlight spotlight06;
    private final Spotlight spotlight07;
    private final Spotlight spotlight08;
    private final Spotlight spotlight09;
    private final Spotlight spotlight10;
    private final Indicator indicator01;
    private final Indicator indicator02;
    private final Indicator indicator03;
    private final Indicator indicator04;
    private final BreakLight breakLight01;
    private final BreakLight breakLight02;
    private final BlueLight blueLight01;
    private final BlueLight blueLight02;
    private final BlueLight blueLight03;
    private final BlueLight blueLight04;
    private final BlueLight blueLight05;
    private final BlueLight blueLight06;
    private final BlueLight blueLight07;
    private final BlueLight blueLight08;
    private final BlueLight blueLight09;
    private final BlueLight blueLight10;
    private final WarningLight warningLight;
    private final ElectricMotor motor1;
    private final ElectricMotor motor2;

    public CentralUnit(){
        speedDisplay = new SpeedDisplay();
        frontAxis = new Axis(Position.VORNE);
        rightSide1 = new SideLight(Lights.Position.RECHTS);
        rightSide2 = new SideLight(Lights.Position.RECHTS);
        rightSide3 = new SideLight(Lights.Position.RECHTS);
        rightSide4 = new SideLight(Lights.Position.RECHTS);
        rightSide5 = new SideLight(Lights.Position.RECHTS);
        leftSide1 = new SideLight(Lights.Position.LINKS);
        leftSide2 = new SideLight(Lights.Position.LINKS);
        leftSide3 = new SideLight(Lights.Position.LINKS);
        leftSide4 = new SideLight(Lights.Position.LINKS);
        leftSide5 = new SideLight(Lights.Position.LINKS);
        spotlight01 = new Spotlight(Lights.Position.VORNELINKS);
        spotlight02 = new Spotlight(Lights.Position.VORNELINKS);
        spotlight03 = new Spotlight(Lights.Position.VORNELINKS);
        spotlight04 = new Spotlight(Lights.Position.VORNERECHTS);
        spotlight05 = new Spotlight(Lights.Position.VORNERECHTS);
        spotlight06 = new Spotlight(Lights.Position.VORNERECHTS);
        spotlight07 = new Spotlight(Lights.Position.DACH);
        spotlight08 = new Spotlight(Lights.Position.DACH);
        spotlight09 = new Spotlight(Lights.Position.DACH);
        spotlight10 = new Spotlight(Lights.Position.DACH);
        indicator01 = new Indicator(Lights.Position.VORNELINKS);
        indicator02 = new Indicator(Lights.Position.VORNERECHTS);
        indicator03 = new Indicator(Lights.Position.HINTENLINKS);
        indicator04 = new Indicator(Lights.Position.HINTENRECHTS);
        breakLight01 = new BreakLight(Lights.Position.HINTENLINKS);
        breakLight02 = new BreakLight(Lights.Position.HINTENRECHTS);
        blueLight01 = new BlueLight(Size.KLEIN, Lights.Position.VORNE);
        blueLight02 = new BlueLight(Size.KLEIN, Lights.Position.VORNE);
        blueLight03 = new BlueLight(Size.GROSS, Lights.Position.DACH);
        blueLight04 = new BlueLight(Size.GROSS, Lights.Position.DACH);
        blueLight05 = new BlueLight(Size.GROSS, Lights.Position.DACH);
        blueLight06 = new BlueLight(Size.GROSS, Lights.Position.DACH);
        blueLight07 = new BlueLight(Size.MITTEL, Lights.Position.HINTENRECHTS);
        blueLight08 = new BlueLight(Size.MITTEL, Lights.Position.HINTENRECHTS);
        blueLight09 = new BlueLight(Size.MITTEL, Lights.Position.HINTENLINKS);
        blueLight10 = new BlueLight(Size.MITTEL, Lights.Position.HINTENLINKS);
        warningLight = new WarningLight();
        motor1 = new ElectricMotor(speedDisplay);
        motor2 = new ElectricMotor(speedDisplay);
    }

    public void brake(int amount){
        breakLight01.On();
        breakLight02.On();
        for(int i = 0; i < amount; i++){
            speedDisplay.lowerSpeed();
        }
        breakLight01.Off();
        breakLight02.Off();
        System.out.println("The speed is now " + speedDisplay.getSpeed() + " km/h.");
    }

    public void speedUp(int amount){
        for(int i = 0; i < amount; i++){
            speedDisplay.speedUp();
        }
        System.out.println("The speed is now " + speedDisplay.getSpeed() + " km/h.");
    }

    public void drive(){
        System.out.println("Driving one iteration");
        motor1.drive();
        motor2.drive();
    }

    public void turn(int winkel){
        frontAxis.turn(winkel);
        if(winkel < 0){
            indicator01.On();
            indicator03.On();
            indicator02.Off();
            indicator04.Off();
            System.out.println("Turn left");
        } else if(winkel > 0){
            indicator01.Off();
            indicator03.Off();
            indicator02.On();
            indicator04.On();
            System.out.println("Turn right");
        } else {
            indicator01.Off();
            indicator03.Off();
            indicator02.Off();
            indicator04.Off();
            System.out.println("Straight");
        }
        System.out.println("The steering degree is " + frontAxis.getLenkWinkel() + "°.");
    }

    public boolean flipLever(int leverId, boolean state){
        switch(leverId){
            case 1:
                if(state){
                    motor1.turnOn();
                    motor2.turnOn();
                    System.out.println("Motor off");
                    return false;
                } else {
                    motor1.turnOff();
                    motor2.turnOff();
                    System.out.println("Motor on");
                    return true;
                }
            case 2:
                if(state){
                    warningLight.Off();
                    System.out.println("warning light off");
                    return false;
                } else {
                    warningLight.On();
                    System.out.println("warning light on");
                    return true;
                }
            case 3:
                if(state){
                    blueLight01.Off();
                    blueLight02.Off();
                    blueLight03.Off();
                    blueLight04.Off();
                    blueLight05.Off();
                    blueLight06.Off();
                    blueLight07.Off();
                    blueLight08.Off();
                    blueLight09.Off();
                    blueLight10.Off();
                    System.out.println("blue light off");
                    return false;
                } else {
                    blueLight01.On();
                    blueLight02.On();
                    blueLight03.On();
                    blueLight04.On();
                    blueLight05.On();
                    blueLight06.On();
                    blueLight07.On();
                    blueLight08.On();
                    blueLight09.On();
                    blueLight10.On();
                    System.out.println("blue light on");
                    return true;
                }
            case 4:
                if(state){
                    spotlight01.Off();
                    spotlight02.Off();
                    spotlight03.Off();
                    spotlight04.Off();
                    spotlight05.Off();
                    spotlight06.Off();
                    System.out.println("spotlight off");
                    return false;
                } else {
                    spotlight01.On();
                    spotlight02.On();
                    spotlight03.On();
                    spotlight04.On();
                    spotlight05.On();
                    spotlight06.On();
                    System.out.println("spotlight on");
                    return true;
                }
            case 5:
                if(state){
                    spotlight07.Off();
                    spotlight08.Off();
                    spotlight09.Off();
                    spotlight10.Off();
                    System.out.println("rooflight off");
                    return false;
                } else {
                    spotlight07.On();
                    spotlight08.On();
                    spotlight09.On();
                    spotlight10.On();
                    System.out.println("rooflight on");
                    return true;
                }
            case 6:
                if(state){
                    rightSide1.Off();
                    rightSide2.Off();
                    rightSide3.Off();
                    rightSide4.Off();
                    rightSide5.Off();
                    leftSide1.Off();
                    leftSide2.Off();
                    leftSide3.Off();
                    leftSide4.Off();
                    leftSide5.Off();
                    System.out.println("Sideligths off");
                    return false;
                } else {
                    rightSide1.On();
                    rightSide2.On();
                    rightSide3.On();
                    rightSide4.On();
                    rightSide5.On();
                    leftSide1.On();
                    leftSide2.On();
                    leftSide3.On();
                    leftSide4.On();
                    leftSide5.On();
                    System.out.println("Sideligths on");
                    return true;
                }

        }
        return false;
    }
}
