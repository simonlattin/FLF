import Battery.Battery;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CompositeTest {

    @Test
    public void TestBatteryStructure(){
        Battery battery = new Battery();
        Assertions.assertEquals(100,battery.getMainCells().size());//100 Mainzellen
        Assertions.assertEquals(100,battery.getMainCells().get(1).getCells().size());//1 Mainzelle hat 100 Subzellen
        Assertions.assertEquals(10,battery.getMainCells().get(1).getCells().get(1).getCells().size());//1 Subzelle hat 10 Zellen

        //Test Funktionsweise
        Assertions.assertEquals(0,battery.getLoadedCells());
        Assertions.assertEquals(0,battery.getPercentageFull());

        battery.chargeEnergy(50000);

        Assertions.assertEquals(50000,battery.getLoadedCells());
        Assertions.assertEquals(50,battery.getPercentageFull());

        battery.takeOut(25000);

        Assertions.assertEquals(25000,battery.getLoadedCells());
        Assertions.assertEquals(25,battery.getPercentageFull());
    }
}
