import Battery.BatteryManagement;
import FLF.FLF;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OperationDrive {

    private FLF flf = new FLF.Builder().build();

    @Test
    public void testOperationDrive(){

        flf.operationDrive();

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

        Assertions.assertEquals('1',flf.getCabin().getControlPanel().getFrontExtinguisherKnob().getState());//Frontwerfer Stufe 1

        Assertions.assertEquals('A',flf.getCabin().getControlPanel().getRoofExtinguisherKnob().getState());//Dachlöscharm Stufe 1

        flf.speedUp(20);
        Assertions.assertEquals(80, flf.getCabin().getSpeedDisplay().getSpeed());//Beschleunigen auf 28 km/h

        flf.drive();
        flf.drive();
        flf.drive();
        flf.drive();
        flf.drive();
        flf.drive();
        flf.drive();
        flf.drive();
        flf.drive();
        flf.drive();
        Assertions.assertEquals(80, flf.getCabin().getSpeedDisplay().getSpeed());
        Assertions.assertEquals(0, flf.getAxis01().getSteeringDegree());
        Assertions.assertEquals(0, flf.getAxis02().getSteeringDegree()); //10 Iterationen konstant geradeaus

        Assertions.assertEquals(380000, BatteryManagement.instance.getLoadedCells());
    }
}
