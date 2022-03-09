import Actors.Driver;
import Actors.Firefighter;
import Cabin.Joystick;
import Cabin.JoystickFrontExtinguisher;
import FLF.FLF;

public class Application {

    public static void main(String... args){

        FLF flf = new FLF.Builder().build();

        flf.setFirefighters();

        System.out.println(flf.getCabin().getControlPanel().getTankLightWater().getColor());

        flf.getFrontExtinguisher().setMixingRatio(0);
        flf.getOperator().turnTurnKnobFrontExtinguisher('7');

        if (!flf.getFrontExtinguisher().isActive()){
            flf.getDriver().pressLeftJoystickButton();
        }

        for(int i = 0;i<20;i++){
            flf.getDriver().pressJoystickCaliper();
            System.out.println(flf.getWaterTank().getAvailableUnits());
            System.out.println("-");
        }



        flf.getCabin().getControlPanel().checkTanks();

        System.out.println(flf.getCabin().getControlPanel().getTankLightWater().getColor());

        //Parken s01
    }

}
