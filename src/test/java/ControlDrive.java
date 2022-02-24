import Battery.BatteryManagement;
import FLF.FLF;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ControlDrive {
    
    private FLF flf = new FLF.Builder().build();
    
    @Test
    public void testDrive(){
        flf.testDrive();

        Assertions.assertTrue(flf.getMotor01().isOn()); //Motor an
        Assertions.assertTrue(flf.getMotor02().isOn()); //Motor an

        Assertions.assertNotNull(flf.getCabin().getSeat01().getFirefighter());//Sitzplatz besetzt
        Assertions.assertNotNull(flf.getCabin().getSeat02().getFirefighter());//Sitzplatz besetzt
        Assertions.assertNotNull(flf.getCabin().getSeat03().getFirefighter());//Sitzplatz besetzt
        Assertions.assertNotNull(flf.getCabin().getSeat04().getFirefighter());//Sitzplatz besetzt

        Assertions.assertFalse(flf.getCabin().getDoorLeft().isOpen());//Tür zu
        Assertions.assertFalse(flf.getCabin().getDoorRight().isOpen());//Tür zu

        Assertions.assertFalse(flf.getRoofExtinguisher().isExtended());//Dachlöscharm eingefahren

        Assertions.assertFalse(flf.getFrontExtinguisher().isActive());//Frontlöscharm deaktiviert

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

        Assertions.assertTrue(flf.getSpotlight01().isOn());//Frontscheinwerfer ein
        Assertions.assertTrue(flf.getSpotlight02().isOn());//Frontscheinwerfer ein
        Assertions.assertTrue(flf.getSpotlight03().isOn());//Frontscheinwerfer ein
        Assertions.assertTrue(flf.getSpotlight04().isOn());//Frontscheinwerfer ein
        Assertions.assertTrue(flf.getSpotlight05().isOn());//Frontscheinwerfer ein
        Assertions.assertTrue(flf.getSpotlight06().isOn());//Frontscheinwerfer ein

        Assertions.assertTrue(flf.getWarningLight().isOn());//Warnlicht ein

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

        Assertions.assertEquals('1',flf.getCabin().getControlPanel().getFrontExtinguisherKnob().getState());//Frontwerfer Stufe 1

        Assertions.assertEquals('A',flf.getCabin().getControlPanel().getRoofExtinguisherKnob().getState());//Dachlöscharm Stufe 1

        flf.speedUp(7);
        Assertions.assertEquals(28, flf.getCabin().getSpeedDisplay().getSpeed());//Beschleunigen auf 28 km/h

        flf.drive();
        flf.drive();
        flf.drive();
        flf.drive();
        flf.drive();
        Assertions.assertEquals(28, flf.getCabin().getSpeedDisplay().getSpeed());
        Assertions.assertEquals(0, flf.getAxis01().getSteeringDegree());
        Assertions.assertEquals(0, flf.getAxis02().getSteeringDegree()); //5 Interationen konstant geradeaus

        flf.steer(-5);
        flf.drive();
        flf.drive();
        flf.drive();
        flf.drive();
        flf.drive();
        Assertions.assertEquals(28, flf.getCabin().getSpeedDisplay().getSpeed());
        Assertions.assertEquals(-5, flf.getAxis01().getSteeringDegree());
        Assertions.assertEquals(-5, flf.getAxis02().getSteeringDegree());//5 Interationen konstant mit 5° nach links

        flf.steer(5);
        flf.drive();
        flf.drive();
        flf.drive();
        flf.drive();
        flf.drive();
        Assertions.assertEquals(28, flf.getCabin().getSpeedDisplay().getSpeed());
        Assertions.assertEquals(0, flf.getAxis01().getSteeringDegree());
        Assertions.assertEquals(0, flf.getAxis02().getSteeringDegree());//5 Interationen konstant geradeaus

        flf.steer(5);
        flf.drive();
        flf.drive();
        flf.drive();
        flf.drive();
        flf.drive();
        Assertions.assertEquals(28, flf.getCabin().getSpeedDisplay().getSpeed());
        Assertions.assertEquals(5, flf.getAxis01().getSteeringDegree());
        Assertions.assertEquals(5, flf.getAxis02().getSteeringDegree());//5 Interationen konstant mit 5° nach rechts

        flf.speedUp(7);
        Assertions.assertEquals(0, flf.getCabin().getSpeedDisplay().getSpeed());
        Assertions.assertEquals(386000, BatteryManagement.instance.getLoadedCells());
    }
}
