import Actors.Driver;
import Actors.Firefighter;
import Cabin.Joystick;
import Cabin.JoystickFrontExtinguisher;
import FLF.FLF;

public class Application {

    public static void main(String... args){

        FLF flf = new FLF.Builder().build();

        flf.setFirefighters();

        if (!flf.getFrontExtinguisher().isActive()){
            flf.getDriver().pressLeftJoystickButton();
        }

        flf.getOperator().turnTurnKnobFrontExtinguisher('7');

        while(flf.getFrontExtinguisher().getMixingRatio() != 0){
            flf.getDriver().pressRightJoystickButton();
        }

        for(int i = 0;i<28;i++){
            flf.getDriver().pressJoystickCaliper();
            System.out.println(flf.getCabin().getControlPanel().getTankLightWater().getColor());
            System.out.println(flf.getWaterTank().getAvailableUnits());
        }


    }

}
