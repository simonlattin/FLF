package Kabine;

import Lichter.Scheinwerfer;

public class FrontleuchtenSchalter extends Schalter{
    private Scheinwerfer frontLeft1;
    private Scheinwerfer frontLeft2;
    private Scheinwerfer frontLeft3;
    private Scheinwerfer frontRight1;
    private Scheinwerfer frontRight2;
    private Scheinwerfer frontRight3;

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
