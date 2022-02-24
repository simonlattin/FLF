package Cabin;

import Extinguisher.FrontExtinguisher;

public class JoystickFrontExtinguisher extends Joystick{
    private final ControlPanel controlPanel;

    public JoystickFrontExtinguisher(ControlPanel controlPanel){
        this.controlPanel = controlPanel;
    }

    public void pushLeftButton(){
        this.leftButton.press();
        if (!isActive){
            this.isActive = true;
            frontExtinguisher.activate();
            frontExtinguisher.setTurnAngle(90);
        } else {
            this.isActive = false;
            frontExtinguisher.deactivate();
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

    public void pushCaliper(){
        this.caliper.press();
        if(isActive) {
            frontExtinguisher.setOutputAmount(controlPanel.getFrontExtinguisherKnob().getAmount());
            frontExtinguisher.extiguish();
        }
    }
}
