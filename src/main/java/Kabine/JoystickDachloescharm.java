package Kabine;

import Loescharme.Dachloescharm;
import Loescharme.Frontwerfer;

public class JoystickDachloescharm extends Joystick{

    private final Dachloescharm dachloescharm;

    public JoystickDachloescharm(Dachloescharm dachloescharm){
        this.dachloescharm = dachloescharm;
    }

    public void pushLeftButton(){
        if (!isAktive){
            this.isAktive = true;
            dachloescharm.extendFirstSegment();
            dachloescharm.extendSecondSegment();
        } else {
            dachloescharm.retractSecondSegment();
            dachloescharm.retractFirstSegment();
            this.isAktive = false;
        }
    }

    public void pushRightButton(){
        if (!isAktive){
            int i = 0;
        } else {
            if (dachloescharm.getMixingRatio() == 0){
                dachloescharm.setMixingRatio(3);
            }
            else if (dachloescharm.getMixingRatio() == 3){
                dachloescharm.setMixingRatio(5);
            }
            else if (dachloescharm.getMixingRatio() == 5){
                dachloescharm.setMixingRatio(10);
            }
            else if (dachloescharm.getMixingRatio() == 10){
                dachloescharm.setMixingRatio(0);
            }
        }
    }

    public void pushTaster(){ //TODO
        this.taster.press();
    }
}
