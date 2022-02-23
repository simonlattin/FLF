package Cabin;

import Extinguisher.RoofExtinguisher;

public class JoystickRoofExtinguisher extends Joystick{

    private final RoofExtinguisher roofExtinguisher;

    public JoystickRoofExtinguisher(RoofExtinguisher roofExtinguisher){
        this.roofExtinguisher = roofExtinguisher;
    }

    public void pushLeftButton(){
        if (!isActive){
            this.isActive = true;
            roofExtinguisher.extendFirstSegment();
            roofExtinguisher.extendSecondSegment();
        } else {
            roofExtinguisher.retractSecondSegment();
            roofExtinguisher.retractFirstSegment();
            this.isActive = false;
        }
    }
    public void pushRightButton(){
        if (!isActive){
            int i = 0;
        } else {
            if (roofExtinguisher.getMixingRatio() == 0){
                roofExtinguisher.setMixingRatio(3);
            }
            else if (roofExtinguisher.getMixingRatio() == 3){
                roofExtinguisher.setMixingRatio(5);
            }
            else if (roofExtinguisher.getMixingRatio() == 5){
                roofExtinguisher.setMixingRatio(10);
            }
            else if (roofExtinguisher.getMixingRatio() == 10){
                roofExtinguisher.setMixingRatio(0);
            }
        }
    }

    public void pushCaliper(){
        this.caliper.press();
    }
}
