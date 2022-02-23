package Controls;

import Achsen.Achse;
import Achsen.Position;
import Antrieb.Elektromotor;
import Kabine.*;
import Lichter.*;

public class CentralUnit {
    private final Tacho tacho;
    private final Achse frontAxis;
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
    private final Scheinwerfer scheinwerfer01;
    private final Scheinwerfer scheinwerfer02;
    private final Scheinwerfer scheinwerfer03;
    private final Scheinwerfer scheinwerfer04;
    private final Scheinwerfer scheinwerfer05;
    private final Scheinwerfer scheinwerfer06;
    private final Scheinwerfer scheinwerfer07;
    private final Scheinwerfer scheinwerfer08;
    private final Scheinwerfer scheinwerfer09;
    private final Scheinwerfer scheinwerfer10;
    private final Fahrtrichtungsanzeiger fahrtrichtungsanzeiger01;
    private final Fahrtrichtungsanzeiger fahrtrichtungsanzeiger02;
    private final Fahrtrichtungsanzeiger fahrtrichtungsanzeiger03;
    private final Fahrtrichtungsanzeiger fahrtrichtungsanzeiger04;
    private final Bremslicht bremslicht01;
    private final Bremslicht bremslicht02;
    private final Blaulicht blaulicht01;
    private final Blaulicht blaulicht02;
    private final Blaulicht blaulicht03;
    private final Blaulicht blaulicht04;
    private final Blaulicht blaulicht05;
    private final Blaulicht blaulicht06;
    private final Blaulicht blaulicht07;
    private final Blaulicht blaulicht08;
    private final Blaulicht blaulicht09;
    private final Blaulicht blaulicht10;
    private final Warnlicht warnlicht;
    private final Elektromotor motor1;
    private final Elektromotor motor2;

    public CentralUnit(){
        tacho = new Tacho();
        frontAxis = new Achse(Position.VORNE);
        rightSide1 = new SideLight(Lichter.Position.RECHTS);
        rightSide2 = new SideLight(Lichter.Position.RECHTS);
        rightSide3 = new SideLight(Lichter.Position.RECHTS);
        rightSide4 = new SideLight(Lichter.Position.RECHTS);
        rightSide5 = new SideLight(Lichter.Position.RECHTS);
        leftSide1 = new SideLight(Lichter.Position.LINKS);
        leftSide2 = new SideLight(Lichter.Position.LINKS);
        leftSide3 = new SideLight(Lichter.Position.LINKS);
        leftSide4 = new SideLight(Lichter.Position.LINKS);
        leftSide5 = new SideLight(Lichter.Position.LINKS);
        scheinwerfer01 = new Scheinwerfer(Lichter.Position.VORNELINKS);
        scheinwerfer02 = new Scheinwerfer(Lichter.Position.VORNELINKS);
        scheinwerfer03 = new Scheinwerfer(Lichter.Position.VORNELINKS);
        scheinwerfer04 = new Scheinwerfer(Lichter.Position.VORNERECHTS);
        scheinwerfer05 = new Scheinwerfer(Lichter.Position.VORNERECHTS);
        scheinwerfer06 = new Scheinwerfer(Lichter.Position.VORNERECHTS);
        scheinwerfer07 = new Scheinwerfer(Lichter.Position.DACH);
        scheinwerfer08 = new Scheinwerfer(Lichter.Position.DACH);
        scheinwerfer09 = new Scheinwerfer(Lichter.Position.DACH);
        scheinwerfer10 = new Scheinwerfer(Lichter.Position.DACH);
        fahrtrichtungsanzeiger01 = new Fahrtrichtungsanzeiger(Lichter.Position.VORNELINKS);
        fahrtrichtungsanzeiger02 = new Fahrtrichtungsanzeiger(Lichter.Position.VORNERECHTS);
        fahrtrichtungsanzeiger03 = new Fahrtrichtungsanzeiger(Lichter.Position.HINTENLINKS);
        fahrtrichtungsanzeiger04 = new Fahrtrichtungsanzeiger(Lichter.Position.HINTENRECHTS);
        bremslicht01 = new Bremslicht(Lichter.Position.HINTENLINKS);
        bremslicht02 = new Bremslicht(Lichter.Position.HINTENRECHTS);
        blaulicht01 = new Blaulicht(Groesse.KLEIN, Lichter.Position.VORNE);
        blaulicht02 = new Blaulicht(Groesse.KLEIN, Lichter.Position.VORNE);
        blaulicht03 = new Blaulicht(Groesse.GROSS, Lichter.Position.DACH);
        blaulicht04 = new Blaulicht(Groesse.GROSS, Lichter.Position.DACH);
        blaulicht05 = new Blaulicht(Groesse.GROSS, Lichter.Position.DACH);
        blaulicht06 = new Blaulicht(Groesse.GROSS, Lichter.Position.DACH);
        blaulicht07 = new Blaulicht(Groesse.MITTEL, Lichter.Position.HINTENRECHTS);
        blaulicht08 = new Blaulicht(Groesse.MITTEL, Lichter.Position.HINTENRECHTS);
        blaulicht09 = new Blaulicht(Groesse.MITTEL, Lichter.Position.HINTENLINKS);
        blaulicht10 = new Blaulicht(Groesse.MITTEL, Lichter.Position.HINTENLINKS);
        warnlicht = new Warnlicht();
        motor1 = new Elektromotor(tacho);
        motor2 = new Elektromotor(tacho);
    }

    public void brake(int amount){
        bremslicht01.On();
        bremslicht02.On();
        for(int i = 0; i < amount; i++){
            tacho.lowerSpeed();
        }
        bremslicht01.Off();
        bremslicht02.Off();
        System.out.println("The speed is now " + tacho.getSpeed() + " km/h.");
    }

    public void speedUp(int amount){
        for(int i = 0; i < amount; i++){
            tacho.speedUp();
        }
        System.out.println("The speed is now " + tacho.getSpeed() + " km/h.");
    }

    public void drive(){
        System.out.println("Driving one iteration");
        motor1.drive();
        motor2.drive();
    }

    public void turn(int winkel){
        frontAxis.turn(winkel);
        if(winkel < 0){
            fahrtrichtungsanzeiger01.On();
            fahrtrichtungsanzeiger03.On();
            fahrtrichtungsanzeiger02.Off();
            fahrtrichtungsanzeiger04.Off();
            System.out.println("Turn left");
        } else if(winkel > 0){
            fahrtrichtungsanzeiger01.Off();
            fahrtrichtungsanzeiger03.Off();
            fahrtrichtungsanzeiger02.On();
            fahrtrichtungsanzeiger04.On();
            System.out.println("Turn right");
        } else {
            fahrtrichtungsanzeiger01.Off();
            fahrtrichtungsanzeiger03.Off();
            fahrtrichtungsanzeiger02.Off();
            fahrtrichtungsanzeiger04.Off();
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
                    warnlicht.Off();
                    System.out.println("warning light off");
                    return false;
                } else {
                    warnlicht.On();
                    System.out.println("warning light on");
                    return true;
                }
            case 3:
                if(state){
                    blaulicht01.Off();
                    blaulicht02.Off();
                    blaulicht03.Off();
                    blaulicht04.Off();
                    blaulicht05.Off();
                    blaulicht06.Off();
                    blaulicht07.Off();
                    blaulicht08.Off();
                    blaulicht09.Off();
                    blaulicht10.Off();
                    System.out.println("blue light off");
                    return false;
                } else {
                    blaulicht01.On();
                    blaulicht02.On();
                    blaulicht03.On();
                    blaulicht04.On();
                    blaulicht05.On();
                    blaulicht06.On();
                    blaulicht07.On();
                    blaulicht08.On();
                    blaulicht09.On();
                    blaulicht10.On();
                    System.out.println("blue light on");
                    return true;
                }
            case 4:
                if(state){
                    scheinwerfer01.Off();
                    scheinwerfer02.Off();
                    scheinwerfer03.Off();
                    scheinwerfer04.Off();
                    scheinwerfer05.Off();
                    scheinwerfer06.Off();
                    System.out.println("spotlight off");
                    return false;
                } else {
                    scheinwerfer01.On();
                    scheinwerfer02.On();
                    scheinwerfer03.On();
                    scheinwerfer04.On();
                    scheinwerfer05.On();
                    scheinwerfer06.On();
                    System.out.println("spotlight on");
                    return true;
                }
            case 5:
                if(state){
                    scheinwerfer07.Off();
                    scheinwerfer08.Off();
                    scheinwerfer09.Off();
                    scheinwerfer10.Off();
                    System.out.println("rooflight off");
                    return false;
                } else {
                    scheinwerfer07.On();
                    scheinwerfer08.On();
                    scheinwerfer09.On();
                    scheinwerfer10.On();
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
