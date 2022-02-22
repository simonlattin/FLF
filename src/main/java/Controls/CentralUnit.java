package Controls;

import Achsen.Achse;
import Achsen.Position;
import Antrieb.Elektromotor;
import Kabine.*;
import Lichter.*;

public class CentralUnit {
    private Tacho tacho;
    private Achse frontAxis;
    private SideLight rightSide1;
    private SideLight rightSide2;
    private SideLight rightSide3;
    private SideLight rightSide4;
    private SideLight rightSide5;
    private SideLight leftSide1;
    private SideLight leftSide2;
    private SideLight leftSide3;
    private SideLight leftSide4;
    private SideLight leftSide5;
    private Scheinwerfer scheinwerfer01;
    private Scheinwerfer scheinwerfer02;
    private Scheinwerfer scheinwerfer03;
    private Scheinwerfer scheinwerfer04;
    private Scheinwerfer scheinwerfer05;
    private Scheinwerfer scheinwerfer06;
    private Scheinwerfer scheinwerfer07;
    private Scheinwerfer scheinwerfer08;
    private Scheinwerfer scheinwerfer09;
    private Scheinwerfer scheinwerfer10;
    private Fahrtrichtungsanzeiger fahrtrichtungsanzeiger01;
    private Fahrtrichtungsanzeiger fahrtrichtungsanzeiger02;
    private Fahrtrichtungsanzeiger fahrtrichtungsanzeiger03;
    private Fahrtrichtungsanzeiger fahrtrichtungsanzeiger04;
    private Bremslicht bremslicht01;
    private Bremslicht bremslicht02;
    private Blaulicht blaulicht01;
    private Blaulicht blaulicht02;
    private Blaulicht blaulicht03;
    private Blaulicht blaulicht04;
    private Blaulicht blaulicht05;
    private Blaulicht blaulicht06;
    private Blaulicht blaulicht07;
    private Blaulicht blaulicht08;
    private Blaulicht blaulicht09;
    private Blaulicht blaulicht10;
    private Warnlicht warnlicht;
    private Elektromotor motor;

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
        motor = new Elektromotor();
    }

    public void brake(int amount){
        for(int i = 0; i < amount; i++){
            tacho.lowerSpeed();
        }
        System.out.println("The speed is now " + tacho.getSpeed() + " km/h.");
    }

    public void speedUp(int amount){
        for(int i = 0; i < amount; i++){
            tacho.speedUp();
        }
        System.out.println("The speed is now " + tacho.getSpeed() + " km/h.");
    }

    public void turn(int winkel){
        frontAxis.turn(winkel);
        System.out.println("The steering degree is " + frontAxis.getLenkWinkel() + "°.");
    }

    public boolean flipLever(int leverId, boolean state){
        int option = leverId;
        switch(option){
            case 1:
                if(state){
                    System.out.println("Motor off");
                    return false;
                } else {
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
                } else {;
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
