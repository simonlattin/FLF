package Battery;

import java.util.ArrayList;
import java.util.List;

public enum BatteryManagement implements IBatteryManagement{
    instance;
    private final Battery[][] batteries = new Battery[2][2];
    private final List<Pol> loadingPorts = new ArrayList<>();

    BatteryManagement(){
        batteries[0][0] = new Battery();
        batteries[0][1] = new Battery();
        batteries[1][0] = new Battery();
        batteries[1][1] = new Battery();
        loadingPorts.add(new Pol());
        loadingPorts.add(new Pol());
        loadingPorts.add(new Pol());
    }

    public void chargeBatteries(int amount){
        int singleAmount = amount / 4;
        for(int i = 0;i<2;i++){
            for(int j = 0;j<2;j++){
                batteries[i][j].chargeEnergy(singleAmount);
            }
        }
    }

    public void takeOut(int amount){
        int compare1 = batteries[0][0].getLoadedCells();
        int compare2 = batteries[0][1].getLoadedCells();
        int compare3 = batteries[1][0].getLoadedCells();
        int compare4 = batteries[1][1].getLoadedCells();
        if(compare1 > compare2){
            batteries[0][0].takeOut(amount);
        } else if(compare2 > compare3){
            batteries[0][1].takeOut(amount);
        } else if(compare3 > compare4){
            batteries[1][0].takeOut(amount);
        } else {
            batteries[1][1].takeOut(amount);
        }
    }

    public int getPercentageFull() {
        int b1 = batteries[0][0].getLoadedCells();
        int b2 = batteries[0][1].getLoadedCells();
        int b3 = batteries[1][0].getLoadedCells();
        int b4 = batteries[1][1].getLoadedCells();
        int b5 = b1 + b2 + b3 + b4;
        b5 = b5 * 100;
        return b5 / 400000;
    }

    public int getLoadedCells() {
        int b1 = batteries[0][0].getLoadedCells();
        int b2 = batteries[0][1].getLoadedCells();
        int b3 = batteries[1][0].getLoadedCells();
        int b4 = batteries[1][1].getLoadedCells();

        return b1 + b2 + b3 + b4;
    }

    public void chargeWithAdapter() {
        chargeBatteries(loadingPorts.get(0).getChargignCurrent());
        chargeBatteries(loadingPorts.get(1).getChargignCurrent());
        chargeBatteries(loadingPorts.get(2).getChargignCurrent());
    }

    public List<Pol> getLoadingPorts() {
        return loadingPorts;
    }

    public void splitChargingCurrent() {

    }
}
