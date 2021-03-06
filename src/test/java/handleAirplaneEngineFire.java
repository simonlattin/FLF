import FLF.FLF;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class handleAirplaneEngineFire {

    private final FLF flf = new FLF.Builder().build();

    @Test
    public void airplaneOnFir() {
        flf.airplaneOnFirePrepare();

        Assertions.assertTrue(flf.getMotor01().isOn());//Motor 1 on
        Assertions.assertTrue(flf.getMotor02().isOn());//Motor 2 on

        Assertions.assertNotNull(flf.getCabin().getSeat01().getFirefighter());//Sitzplatz besetzt
        Assertions.assertNotNull(flf.getCabin().getSeat02().getFirefighter());//Sitzplatz besetzt

        Assertions.assertTrue(flf.getCabin().getDoorLeft().isOpen());//Left door closed
        Assertions.assertTrue(flf.getCabin().getDoorRight().isOpen());//Right door closed

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

        flf.getOperator().turnTurnKnobFrontExtinguisher('7');

        while(flf.getFrontExtinguisher().getMixingRatio() != 10){
            flf.getDriver().pressRightJoystickButton();
        }

        flf.getDriver().pressJoystickCaliper();
        flf.getDriver().pressJoystickCaliper();
        flf.getDriver().pressJoystickCaliper();

        Assertions.assertEquals(91800,flf.getWaterTank().getAvailableUnits());//Mixingratio and usage right for watertank in Frontextinguisher
        Assertions.assertEquals(32700,flf.getFoamTank().getAvailableUnits());//Mixingratio and usage right for foamtank in Frontextinguisher

        if (!flf.getRoofExtinguisher().isExtended()){
            flf.getOperator().pressLeftJoystickButton();
        }

        Assertions.assertTrue(flf.getRoofExtinguisher().isExtended());//Frontextinguisher active and extended

        flf.getOperator().turnTurnKnobRoofExtinguisher('C');

        while(flf.getRoofExtinguisher().getMixingRatio() != 5){
            flf.getOperator().pressRightJoystickButton();
        }

        flf.getOperator().pressJoystickCaliper();
        flf.getOperator().pressJoystickCaliper();
        flf.getOperator().pressJoystickCaliper();
        flf.getOperator().pressJoystickCaliper();
        flf.getOperator().pressJoystickCaliper();

        Assertions.assertEquals(79925,flf.getWaterTank().getAvailableUnits());//Mixingratio and usage right for watertank in Roofextinguisher
        Assertions.assertEquals(32075,flf.getFoamTank().getAvailableUnits());//Mixingratio and usage right for foamtank in Roofextinguisher

        flf.getOperator().turnTurnKnobFrontExtinguisher('2');

        while(flf.getFrontExtinguisher().getMixingRatio() != 3){
            flf.getDriver().pressRightJoystickButton();
        }

        flf.getDriver().pressJoystickCaliper();
        flf.getDriver().pressJoystickCaliper();
        flf.getDriver().pressJoystickCaliper();

        Assertions.assertEquals(77015,flf.getWaterTank().getAvailableUnits());//Mixingratio and usage right for watertank in Frontextinguisher
        Assertions.assertEquals(31985,flf.getFoamTank().getAvailableUnits());//Mixingratio and usage right for foamtank in Frontextinguisher
    }
}
