import FLF.FLF;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class handleFuelTruckOnFire {
    
    private FLF flf = new FLF.Builder().build();
    
    @Test
    public void testTankVehicle() {
        flf.tankVehicle();
        flf.getCabin().getControlPanel().turnFrontExtingushierKnob('6');
        flf.getCabin().getControlPanel().turnRoofExtingushierKnob('C');

        Assertions.assertTrue(flf.getMotor01().isOn()); //Motor an
        Assertions.assertTrue(flf.getMotor02().isOn()); //Motor an

        Assertions.assertNotNull(flf.getCabin().getSeat01().getFirefighter());//Sitzplatz besetzt
        Assertions.assertNotNull(flf.getCabin().getSeat02().getFirefighter());//Sitzplatz besetzt
        Assertions.assertNull(flf.getCabin().getSeat03().getFirefighter());//Sitzplatz besetzt
        Assertions.assertNull(flf.getCabin().getSeat04().getFirefighter());//Sitzplatz besetzt

        Assertions.assertFalse(flf.getCabin().getDoorLeft().isOpen());//Tür zu
        Assertions.assertFalse(flf.getCabin().getDoorRight().isOpen());//Tür zu

        Assertions.assertFalse(flf.getRoofExtinguisher().isExtended());//Dachlöscharm eingefahren

        Assertions.assertFalse(flf.getFrontExtinguisher().isActive());//Frontlöscharm deaktiviert

        Assertions.assertTrue(flf.getSpotlight07().isOn());//Dachscheinwerfer ein
        Assertions.assertTrue(flf.getSpotlight08().isOn());//Dachscheinwerfer ein
        Assertions.assertTrue(flf.getSpotlight09().isOn());//Dachscheinwerfer ein
        Assertions.assertTrue(flf.getSpotlight10().isOn());//Dachscheinwerfer ein

        Assertions.assertTrue(flf.getLeftSide1().isOn());//Seitenleuchten ein
        Assertions.assertTrue(flf.getLeftSide2().isOn());//Seitenleuchten ein
        Assertions.assertTrue(flf.getLeftSide3().isOn());//Seitenleuchten ein
        Assertions.assertTrue(flf.getLeftSide4().isOn());//Seitenleuchten ein
        Assertions.assertTrue(flf.getLeftSide5().isOn());//Seitenleuchten ein
        Assertions.assertTrue(flf.getRightSide1().isOn());//Seitenleuchten ein
        Assertions.assertTrue(flf.getRightSide2().isOn());//Seitenleuchten ein
        Assertions.assertTrue(flf.getRightSide3().isOn());//Seitenleuchten ein
        Assertions.assertTrue(flf.getRightSide4().isOn());//Seitenleuchten ein
        Assertions.assertTrue(flf.getRightSide5().isOn());//Seitenleuchten ein

        Assertions.assertTrue(flf.getSpotlight01().isOn());//Frontscheinwerfer ein
        Assertions.assertTrue(flf.getSpotlight02().isOn());//Frontscheinwerfer ein
        Assertions.assertTrue(flf.getSpotlight03().isOn());//Frontscheinwerfer ein
        Assertions.assertTrue(flf.getSpotlight04().isOn());//Frontscheinwerfer ein
        Assertions.assertTrue(flf.getSpotlight05().isOn());//Frontscheinwerfer ein
        Assertions.assertTrue(flf.getSpotlight06().isOn());//Frontscheinwerfer ein

        Assertions.assertTrue(flf.getWarningLight().isOn());//Warnlicht ein

        Assertions.assertTrue(flf.getBlueLight01().isOn());//Blaulicht ein
        Assertions.assertTrue(flf.getBlueLight02().isOn());//Blaulicht ein
        Assertions.assertTrue(flf.getBlueLight03().isOn());//Blaulicht ein
        Assertions.assertTrue(flf.getBlueLight04().isOn());//Blaulicht ein
        Assertions.assertTrue(flf.getBlueLight05().isOn());//Blaulicht ein
        Assertions.assertTrue(flf.getBlueLight06().isOn());//Blaulicht ein
        Assertions.assertTrue(flf.getBlueLight07().isOn());//Blaulicht ein
        Assertions.assertTrue(flf.getBlueLight08().isOn());//Blaulicht ein
        Assertions.assertTrue(flf.getBlueLight09().isOn());//Blaulicht ein
        Assertions.assertTrue(flf.getBlueLight10().isOn());//Blaulicht ein

        Assertions.assertEquals(100, flf.getWaterTank().getPercentageFull());//Wassertank voll

        Assertions.assertEquals(100, flf.getFoamTank().getPercentageFull());//Schaumpulvertank voll

        flf.activateFloorSprayNuzzles();
        Assertions.assertEquals(100550, flf.getWaterTank().getAvailableUnits());

        flf.getDriver().pressLeftJoystickButton();
        flf.getDriver().pressRightJoystickButton();
        flf.getDriver().pressRightJoystickButton();
        flf.getDriver().pressJoystickCaliper();
        flf.getDriver().pressJoystickCaliper();
        flf.getDriver().pressJoystickCaliper();
        Assertions.assertTrue(flf.getFrontExtinguisher().isActive());//Frontwerfer aktiviert
        Assertions.assertEquals(5, flf.getFrontExtinguisher().getMixingRatio());//Mischverhältnis 5 %
        Assertions.assertEquals(90, flf.getFrontExtinguisher().getTurnAngle());//Frontwerfer um 90% gedreht
        Assertions.assertEquals(3000, flf.getFrontExtinguisher().getOutputAmount());//Ausbringungsmenge korrekt

        Assertions.assertEquals(92000, flf.getWaterTank().getAvailableUnits());//korrekter Verbrauch Wasser
        Assertions.assertEquals(33300, flf.getFoamTank().getAvailableUnits());//korrekter Verbrauch Schaumpulver


        flf.getOperator().pressLeftJoystickButton();
        flf.getOperator().pressRightJoystickButton();
        flf.getOperator().pressJoystickCaliper();
        flf.getOperator().pressJoystickCaliper();
        flf.getOperator().pressJoystickCaliper();
        Assertions.assertTrue(flf.getRoofExtinguisher().isExtended());//Dachlöscharm ist ausgefahren
        Assertions.assertEquals(3, flf.getRoofExtinguisher().getMixingRatio());//Mischverältnis 3%
        Assertions.assertEquals(2500, flf.getRoofExtinguisher().getOutputAmount());//Ausbringunsmenge korrekt

        Assertions.assertEquals(84725, flf.getWaterTank().getAvailableUnits());//korrekter Verbrauch Wasser
        Assertions.assertEquals(33075, flf.getFoamTank().getAvailableUnits());//korrekter Verbrauch Schaumpulver
    }
}
