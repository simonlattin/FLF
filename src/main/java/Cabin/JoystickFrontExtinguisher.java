package Cabin;

import Extinguisher.FrontExtinguisher;

public class JoystickFrontExtinguisher extends Joystick{

    private FrontExtinguisher frontExtinguisher;

    public JoystickFrontExtinguisher(FrontExtinguisher frontExtinguisher){

    }

    public void pushLeftButton(){
        this.leftButton.press();
        if (!isAktive){
            this.isAktive = true;
            frontExtinguisher.setTurnAngle(90);
        } else {
            this.isAktive = false;
            frontExtinguisher.setTurnAngle(0);
        }
    }

    public void pushRightButton(){
        this.rightButton.press();
        if (!isAktive){
            int i = 0;
        } else {
            if (frontExtinguisher.getMixingRatio() == 0){
                frontExtinguisher.setMixingRatio(3);
            }
            else if (frontExtinguisher.getMixingRatio() == 3){
                frontExtinguisher.setMixingRatio(5);
            }
            else if (frontExtinguisher.getMixingRatio() == 5){
                frontExtinguisher.setMixingRatio(10);
            }
            else if (frontExtinguisher.getMixingRatio() == 10){
                frontExtinguisher.setMixingRatio(0);
            }
        }

    }

    public void pushTaster(){ //TODO
        this.caliper.press();
    }
}
