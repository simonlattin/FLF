import Battery.BatteryAdapter;
import Battery.BatteryManagement;
import Battery.IBatteryManagement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AdapterTest {

    @Test
    public void TestBatteryAdapter(){
        Assertions.assertEquals(0, BatteryManagement.instance.getLoadedCells());
        IBatteryManagement eLoadingStation = new BatteryAdapter();
        eLoadingStation.splitChargingCurrent();
        BatteryManagement.instance.chargeWithAdapter();
        Assertions.assertEquals(1000, BatteryManagement.instance.getLoadedCells());
    }


}
