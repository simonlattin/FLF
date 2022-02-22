package Kabine;

import Loescharme.Frontwerfer;
import Loescharme.Mischanlage;

public class JoystickFrontwerfer extends Joystick{

    private Frontwerfer frontwerfer;

    public JoystickFrontwerfer(Frontwerfer frontwerfer){

    }

    public void pushLeftButton(){
        this.leftButton.press();
        if (!isAktive){
            this.isAktive = true;
            frontwerfer.setTurnAngle(90);
        } else {
            this.isAktive = false;
            frontwerfer.setTurnAngle(0);
        }
    }

    public void pushRightButton(){
        this.rightButton.press();
        if (!isAktive){
            int i = 0;
        } else {
            if (frontwerfer.getMixingRatio() == 0){
                frontwerfer.setMixingRatio(3);
            }
            else if (frontwerfer.getMixingRatio() == 3){
                frontwerfer.setMixingRatio(5);
            }
            else if (frontwerfer.getMixingRatio() == 5){
                frontwerfer.setMixingRatio(10);
            }
            else if (frontwerfer.getMixingRatio() == 10){
                frontwerfer.setMixingRatio(0);
            }
        }

    }

    public void pushTaster(){ //TODO
        this.taster.press();
    }
}
