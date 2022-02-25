import Actors.Operator;
import FLF.FLF;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class usageControlPanel {
    private final FLF flf = new FLF.Builder().build();

    @Test
    public void checkFunctionControlPanel(){
        flf.usageControlPanelPrepare();

        Assertions.assertFalse(flf.getCabin().getControlPanel().getElectricMotorLever().getState());//Motor off
        Assertions.assertFalse(flf.getCabin().getControlPanel().getWarningLightLever().getState());//Warninglight off
        Assertions.assertFalse(flf.getCabin().getControlPanel().getBlueLightLever().getState());//Bluelight off
        Assertions.assertFalse(flf.getCabin().getControlPanel().getFrontlightsLever().getState());//Frontlights off
        Assertions.assertFalse(flf.getCabin().getControlPanel().getRoofHeadLightsLever().getState());//Rooflights off
        Assertions.assertFalse(flf.getCabin().getControlPanel().getSideLightsLever().getState());//Sidelights on

        flf.getOperator().flipMotorLever();

        Assertions.assertTrue(flf.getCabin().getControlPanel().getElectricMotorLever().getState());//Motor on

        flf.getOperator().flipWarningLightLever();

        Assertions.assertTrue(flf.getCabin().getControlPanel().getWarningLightLever().getState());//Warninglight on

        flf.getOperator().flipBlueLightLever();

        Assertions.assertTrue(flf.getCabin().getControlPanel().getBlueLightLever().getState());//Bluelight on

        flf.getOperator().flipHeadLightLever();

        Assertions.assertTrue(flf.getCabin().getControlPanel().getFrontlightsLever().getState());//Frontlights on

        flf.getOperator().flipRoofLightLever();

        Assertions.assertTrue(flf.getCabin().getControlPanel().getRoofHeadLightsLever().getState());//Rooflights on

        flf.getOperator().flipSideLightLever();

        Assertions.assertTrue(flf.getCabin().getControlPanel().getSideLightsLever().getState());//Sidelights on

        flf.getOperator().flipMotorLever();
        flf.getOperator().flipWarningLightLever();
        flf.getOperator().flipBlueLightLever();
        flf.getOperator().flipHeadLightLever();
        flf.getOperator().flipRoofLightLever();
        flf.getOperator().flipSideLightLever();

        Assertions.assertFalse(flf.getCabin().getControlPanel().getElectricMotorLever().getState());//Motor off
        Assertions.assertFalse(flf.getCabin().getControlPanel().getWarningLightLever().getState());//Warninglight off
        Assertions.assertFalse(flf.getCabin().getControlPanel().getBlueLightLever().getState());//Bluelight off
        Assertions.assertFalse(flf.getCabin().getControlPanel().getFrontlightsLever().getState());//Frontlights off
        Assertions.assertFalse(flf.getCabin().getControlPanel().getRoofHeadLightsLever().getState());//Rooflights off
        Assertions.assertFalse(flf.getCabin().getControlPanel().getSideLightsLever().getState());//Sidelights on
    }
}
