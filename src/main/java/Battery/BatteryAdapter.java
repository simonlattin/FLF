package Battery;

public class BatteryAdapter extends ELoadingStation implements IBatteryManagement{


    public BatteryAdapter(){
    }


    public void chargeBatteries(int amount) {

    }


    public void takeOut(int amount) {

    }


    public int getPercentageFull() {
        return 0;
    }


    public int getLoadedCells() {
        return 0;
    }


    public void chargeWithAdapter() {
        int chargingCurrent1 = chargingCurrent - 600;
        int chargingCurrent2 = chargingCurrent - 300;
        int chargingCurrent3 = chargingCurrent - 300;

    }
}
