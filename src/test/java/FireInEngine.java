import FLF.FLF;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FireInEngine {
    private final FLF flf = new FLF.Builder().build();

    @Test
    public void fireInEngine() {
        flf.fireInEnginePrepare();

        Assertions.assertNotNull(flf.getCabin().getSeat01().getFirefighter());//Sitzplatz besetzt
        Assertions.assertNotNull(flf.getCabin().getSeat02().getFirefighter());//Sitzplatz besetzt

        Assertions.assertTrue(flf.getCabin().getDoorLeft().isOpen());//Left door closed
        Assertions.assertTrue(flf.getCabin().getDoorRight().isOpen());//Right door closed

        Assertions.assertTrue(flf.getMotor01().isOn());//Motor 1 on
        Assertions.assertTrue(flf.getMotor02().isOn());//Motor 2 on

        Assertions.assertTrue(flf.getSpotlight07().isOn());//Rooflights on
        Assertions.assertTrue(flf.getSpotlight08().isOn());//Rooflights on
        Assertions.assertTrue(flf.getSpotlight09().isOn());//Rooflights on
        Assertions.assertTrue(flf.getSpotlight10().isOn());//Rooflights on

        Assertions.assertTrue(flf.getLeftSide1().isOn());//Sidelights on
        Assertions.assertTrue(flf.getLeftSide2().isOn());//Sidelights on
        Assertions.assertTrue(flf.getLeftSide3().isOn());//Sidelights on
        Assertions.assertTrue(flf.getLeftSide4().isOn());//Sidelights on
        Assertions.assertTrue(flf.getLeftSide5().isOn());//Sidelights on
        Assertions.assertTrue(flf.getRightSide1().isOn());//Sidelights on
        Assertions.assertTrue(flf.getRightSide2().isOn());//Sidelights on
        Assertions.assertTrue(flf.getRightSide3().isOn());//Sidelights on
        Assertions.assertTrue(flf.getRightSide4().isOn());//Sidelights on
        Assertions.assertTrue(flf.getRightSide5().isOn());//Sidelights on

        Assertions.assertTrue(flf.getSpotlight01().isOn());//Frontlights on
        Assertions.assertTrue(flf.getSpotlight02().isOn());//Frontlights on
        Assertions.assertTrue(flf.getSpotlight03().isOn());//Frontlights on
        Assertions.assertTrue(flf.getSpotlight04().isOn());//Frontlights on
        Assertions.assertTrue(flf.getSpotlight05().isOn());//Frontlights on
        Assertions.assertTrue(flf.getSpotlight06().isOn());//Frontlights on

        Assertions.assertTrue(flf.getWarningLight().isOn());//Warninglight on

        Assertions.assertTrue(flf.getBlueLight01().isOn());//Bluelights on
        Assertions.assertTrue(flf.getBlueLight02().isOn());//Bluelights on
        Assertions.assertTrue(flf.getBlueLight03().isOn());//Bluelights on
        Assertions.assertTrue(flf.getBlueLight04().isOn());//Bluelights on
        Assertions.assertTrue(flf.getBlueLight05().isOn());//Bluelights on
        Assertions.assertTrue(flf.getBlueLight06().isOn());//Bluelights on
        Assertions.assertTrue(flf.getBlueLight07().isOn());//Bluelights on
        Assertions.assertTrue(flf.getBlueLight08().isOn());//Bluelights on
        Assertions.assertTrue(flf.getBlueLight09().isOn());//Bluelights on
        Assertions.assertTrue(flf.getBlueLight10().isOn());//Bluelights on

        Assertions.assertEquals(100,flf.getWaterTank().getPercentageFull());//Watertank full
        Assertions.assertEquals(100,flf.getFoamTank().getPercentageFull());//Foamtank full

        if (!flf.getFrontExtinguisher().isActive()){
            flf.getDriver().pressLeftJoystickButton();
        }

        Assertions.assertEquals(90,flf.getFrontExtinguisher().getTurnAngle());//Frontextinguisher active and turned

        while (flf.getCabin().getControlPanel().getFrontExtinguisherKnob().getAmount() != 3500){
            flf.getCabin().getControlPanel().getFrontExtinguisherKnob().turn(flf.getCabin().getControlPanel().getFrontExtinguisherKnob().getState());
        }

        while(flf.getFrontExtinguisher().getMixingRatio() != 10){
            flf.getDriver().pressRightJoystickButton();
        }

        flf.getDriver().pressJoystickCaliper();
        flf.getDriver().pressJoystickCaliper();
        flf.getDriver().pressJoystickCaliper();
        flf.getDriver().pressJoystickCaliper();
        flf.getDriver().pressJoystickCaliper();

        Assertions.assertEquals(85500,flf.getWaterTank().getAvailableUnits());//Mixingratio and usage right for watertank in Frontextinguisher
        Assertions.assertEquals(32000,flf.getFoamTank().getAvailableUnits());//Mixingratio and usage right for foamtank in Frontextinguisher

        while (flf.getCabin().getControlPanel().getRoofExtinguisherKnob().getAmount() != 2500){
            flf.getCabin().getControlPanel().getRoofExtinguisherKnob().turn(flf.getCabin().getControlPanel().getRoofExtinguisherKnob().getState());
        }

        while(flf.getRoofExtinguisher().getMixingRatio() != 5){
            flf.getOperator().pressRightJoystickButton();
        }

        flf.getOperator().pressJoystickCaliper();
        flf.getOperator().pressJoystickCaliper();
        flf.getOperator().pressJoystickCaliper();
        flf.getOperator().pressJoystickCaliper();
        flf.getOperator().pressJoystickCaliper();

        Assertions.assertEquals(74250,flf.getWaterTank().getAvailableUnits());//Mixingratio and usage right for watertank in Roofextinguisher
        Assertions.assertEquals(30750,flf.getFoamTank().getAvailableUnits());//Mixingratio and usage right for foamtank in Roofextinguisher

        flf.getOperator().pressJoystickCaliper();
        flf.getOperator().pressJoystickCaliper();
        flf.getOperator().pressJoystickCaliper();
        flf.getOperator().pressJoystickCaliper();
        flf.getOperator().pressJoystickCaliper();

        Assertions.assertEquals(63000,flf.getWaterTank().getAvailableUnits());//Mixingratio and usage right for watertank in Roofextinguisher
        Assertions.assertEquals(29500,flf.getFoamTank().getAvailableUnits());//Mixingratio and usage right for foamtank in Roofextinguisher

        while (flf.getCabin().getControlPanel().getFrontExtinguisherKnob().getAmount() != 1000){
            flf.getCabin().getControlPanel().getFrontExtinguisherKnob().turn(flf.getCabin().getControlPanel().getFrontExtinguisherKnob().getState());
        }

        while(flf.getFrontExtinguisher().getMixingRatio() != 3){
            flf.getDriver().pressRightJoystickButton();
        }

        flf.getDriver().pressJoystickCaliper();
        flf.getDriver().pressJoystickCaliper();
        flf.getDriver().pressJoystickCaliper();
        flf.getDriver().pressJoystickCaliper();
        flf.getDriver().pressJoystickCaliper();

        Assertions.assertEquals(58150,flf.getWaterTank().getAvailableUnits());//Mixingratio and usage right for watertank in Frontextinguisher
        Assertions.assertEquals(29350,flf.getFoamTank().getAvailableUnits());//Mixingratio and usage right for foamtank in Frontextinguisher
    }
}
