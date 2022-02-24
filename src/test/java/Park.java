import Battery.BatteryManagement;
import FLF.FLF;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Park { //test s01

    private FLF flf = new FLF.Builder().build();


    @Test
    public void testParking(){
        flf.park();
        Assertions.assertFalse(flf.getMotor01().isOn()); //Motor aus
        Assertions.assertFalse(flf.getMotor02().isOn()); //Motor aus

        Assertions.assertNull(flf.getCabin().getSeat01().getFirefighter());//Sitzplatz unbesetzt
        Assertions.assertNull(flf.getCabin().getSeat02().getFirefighter());//Sitzplatz unbesetzt
        Assertions.assertNull(flf.getCabin().getSeat03().getFirefighter());//Sitzplatz unbesetzt
        Assertions.assertNull(flf.getCabin().getSeat04().getFirefighter());//Sitzplatz unbesetzt

        Assertions.assertTrue(flf.getCabin().getDoorLeft().isOpen());//Tür offen
        Assertions.assertTrue(flf.getCabin().getDoorRight().isOpen());//Tür offen

        Assertions.assertFalse(flf.getRoofExtinguisher().isExtended());//Dachlöscharm eingefahren

        Assertions.assertFalse(flf.getFrontExtinguisher().isActive());//Frontlöscharm deaktiviert

        Assertions.assertFalse(flf.getSpotlight01().isOn());//Frontscheinwerfer aus
        Assertions.assertFalse(flf.getSpotlight02().isOn());//Frontscheinwerfer aus
        Assertions.assertFalse(flf.getSpotlight03().isOn());//Frontscheinwerfer aus
        Assertions.assertFalse(flf.getSpotlight04().isOn());//Frontscheinwerfer aus
        Assertions.assertFalse(flf.getSpotlight05().isOn());//Frontscheinwerfer aus
        Assertions.assertFalse(flf.getSpotlight06().isOn());//Frontscheinwerfer aus

        Assertions.assertFalse(flf.getSpotlight07().isOn());//Dachscheinwerfer aus
        Assertions.assertFalse(flf.getSpotlight08().isOn());//Dachscheinwerfer aus
        Assertions.assertFalse(flf.getSpotlight09().isOn());//Dachscheinwerfer aus
        Assertions.assertFalse(flf.getSpotlight10().isOn());//Dachscheinwerfer aus

        Assertions.assertFalse(flf.getLeftSide1().isOn());//Seitenleuchten aus
        Assertions.assertFalse(flf.getLeftSide2().isOn());//Seitenleuchten aus
        Assertions.assertFalse(flf.getLeftSide3().isOn());//Seitenleuchten aus
        Assertions.assertFalse(flf.getLeftSide4().isOn());//Seitenleuchten aus
        Assertions.assertFalse(flf.getLeftSide5().isOn());//Seitenleuchten aus
        Assertions.assertFalse(flf.getRightSide1().isOn());//Seitenleuchten aus
        Assertions.assertFalse(flf.getRightSide2().isOn());//Seitenleuchten aus
        Assertions.assertFalse(flf.getRightSide3().isOn());//Seitenleuchten aus
        Assertions.assertFalse(flf.getRightSide4().isOn());//Seitenleuchten aus
        Assertions.assertFalse(flf.getRightSide5().isOn());//Seitenleuchten aus

        Assertions.assertFalse(flf.getWarningLight().isOn());//Warnlicht aus

        Assertions.assertFalse(flf.getBlueLight01().isOn());//Blaulicht aus
        Assertions.assertFalse(flf.getBlueLight02().isOn());//Blaulicht aus
        Assertions.assertFalse(flf.getBlueLight03().isOn());//Blaulicht aus
        Assertions.assertFalse(flf.getBlueLight04().isOn());//Blaulicht aus
        Assertions.assertFalse(flf.getBlueLight05().isOn());//Blaulicht aus
        Assertions.assertFalse(flf.getBlueLight06().isOn());//Blaulicht aus
        Assertions.assertFalse(flf.getBlueLight07().isOn());//Blaulicht aus
        Assertions.assertFalse(flf.getBlueLight08().isOn());//Blaulicht aus
        Assertions.assertFalse(flf.getBlueLight09().isOn());//Blaulicht aus
        Assertions.assertFalse(flf.getBlueLight10().isOn());//Blaulicht aus

        Assertions.assertEquals(100, flf.getWaterTank().getPercentageFull());//Wassertank voll

        Assertions.assertEquals(100, flf.getFoamTank().getPercentageFull());//Schaumpulvertank voll

        Assertions.assertEquals(100, BatteryManagement.instance.getPercentageFull());//Batterie geladen

        Assertions.assertEquals(flf.getCabin().getControlPanel().getFrontExtinguisherKnob().getState(),'1'); //Frontwerfer Stufe 1

        Assertions.assertEquals(flf.getCabin().getControlPanel().getRoofExtinguisherKnob().getState(),'A');//Dachlöscharm Stufe 1
    }
}
