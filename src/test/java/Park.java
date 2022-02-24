import FLF.FLF;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Park { //test s01

    private FLF flf = new FLF.Builder().build();


    @Test
    public void testParking(){
        flf.park();
        Assertions.assertFalse(flf.getMotor01().isOn()); //Motor aus

        Assertions.assertNull(flf.getCabin().getSeat01());//Sitzplatz unbesetzt
        Assertions.assertNull(flf.getCabin().getSeat02());//Sitzplatz unbesetzt
        Assertions.assertNull(flf.getCabin().getSeat03());//Sitzplatz unbesetzt
        Assertions.assertNull(flf.getCabin().getSeat04());//Sitzplatz unbesetzt

        Assertions.assertTrue(flf.getCabin().getDoorLeft().isOpen());//Tür offen
        Assertions.assertTrue(flf.getCabin().getDoorRight().isOpen());//Tür offen

        Assertions.assertFalse(flf.getRoofExtinguisher().isExtended());

        Assertions.assertFalse(flf.getFrontExtinguisher().isActive());

        Assertions.assertFalse(flf.getSpotlight01().);
    }
}
