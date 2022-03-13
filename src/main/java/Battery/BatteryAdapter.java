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


    public void splitChargingCurrent() {
        int chargingCurrent = getPol().getChargignCurrent();
        BatteryManagement.instance.getLoadingPorts().get(0).setChargignCurrent(chargingCurrent-600);
        BatteryManagement.instance.getLoadingPorts().get(1).setChargignCurrent(chargingCurrent-700);
        BatteryManagement.instance.getLoadingPorts().get(2).setChargignCurrent(chargingCurrent-700);

    }

    public void chargeWithAdapter() {

    }
}
