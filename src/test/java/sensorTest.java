import FLF.FLF;
import Lights.Color;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class sensorTest {

    FLF flf = new FLF.Builder().build();

    @Test
    public void sensorTest() {

        flf.setFirefighters();

        Assertions.assertEquals(100, flf.getWaterTank().getPercentageFull());//Wassertank voll

        Assertions.assertEquals(100, flf.getFoamTank().getPercentageFull());//Schaumpulvertank voll

        if (!flf.getFrontExtinguisher().isActive()) {
            flf.getDriver().pressLeftJoystickButton();
        }

        Assertions.assertEquals(90, flf.getFrontExtinguisher().getTurnAngle());//Frontextinguisher active and turned

        flf.getOperator().turnTurnKnobFrontExtinguisher('7');

        while (flf.getFrontExtinguisher().getMixingRatio() != 10) {
            flf.getDriver().pressRightJoystickButton();
        }

        for(int i = 0;i<20;i++){
            flf.getDriver().pressJoystickCaliper();
        }

        Assertions.assertEquals(Color.YELLOW,flf.getCabin().getControlPanel().getTankLightWater().getColor());//Watersensor Yellow
        Assertions.assertEquals(Color.INACTIVE,flf.getCabin().getControlPanel().getTankLightFoam().getColor());//Foamsensor Inactive

        if (!flf.getRoofExtinguisher().isExtended()){
            flf.getOperator().pressLeftJoystickButton();
        }

        flf.getOperator().turnTurnKnobRoofExtinguisher('C');

        while(flf.getRoofExtinguisher().getMixingRatio() != 10){
            flf.getOperator().pressRightJoystickButton();
        }

        for(int i = 0;i<10;i++){
            flf.getOperator().pressJoystickCaliper();
        }

        Assertions.assertEquals(Color.ORANGE,flf.getCabin().getControlPanel().getTankLightWater().getColor());//Watersensor Orange
        Assertions.assertEquals(Color.INACTIVE,flf.getCabin().getControlPanel().getTankLightFoam().getColor());//Foamsensor Inactive
    }
}
