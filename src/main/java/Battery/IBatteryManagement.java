package Battery;

public interface IBatteryManagement {

    void chargeBatteries(int amount);

    void takeOut(int amount);

    int getPercentageFull();

    int getLoadedCells();

    void chargeWithAdapter();
}
