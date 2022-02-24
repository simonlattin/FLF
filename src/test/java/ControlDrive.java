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
        
    }
}
