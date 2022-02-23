package Cabin;

import Lights.Spotlight;

public class FrontlightsLever extends Lever {
    private Spotlight frontLeft1;
    private Spotlight frontLeft2;
    private Spotlight frontLeft3;
    private Spotlight frontRight1;
    private Spotlight frontRight2;
    private Spotlight frontRight3;

    public void flip(){
        if(state){
            state = false;
            frontLeft1.Off();
            frontLeft2.Off();
            frontLeft3.Off();
            frontRight1.Off();
            frontRight2.Off();
            frontRight3.Off();
        } else {
            state = true;
            frontLeft1.On();
            frontLeft2.On();
            frontLeft3.On();
            frontRight1.On();
            frontRight2.On();
            frontRight3.On();
        }
    }
    }
