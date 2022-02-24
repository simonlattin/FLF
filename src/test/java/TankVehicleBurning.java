import Battery.BatteryManagement;
import FLF.FLF;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TankVehicleBurning {
    
    private FLF flf = new FLF.Builder().build();
    
    @Test
    public void testTankVehicle() {
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
    }
}
