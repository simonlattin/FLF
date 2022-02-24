package Cabin;

import Extinguisher.FrontExtinguisher;

public class JoystickFrontExtinguisher extends Joystick{

    private final FrontExtinguisher frontExtinguisher;

    public JoystickFrontExtinguisher(FrontExtinguisher frontExtinguisher){
        this.frontExtinguisher = frontExtinguisher;
    }

    public void pushLeftButton(){
        this.leftButton.press();
        if (!isActive){
            this.isActive = true;
            frontExtinguisher.setTurnAngle(90);
        } else {
            this.isActive = false;
            frontExtinguisher.setTurnAngle(0);
        }
    }

    public void pushRightButton(){
        this.rightButton.press();
        if (!isActive){
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

    public void pushCaliper(TurnKnob turnKnob){
        this.caliper.press();
        frontExtinguisher.setOutputAmount(turnKnob.getAmount());
        frontExtinguisher.extiguish();
    }
}
