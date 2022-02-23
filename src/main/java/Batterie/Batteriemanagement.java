package Batterie;

public enum Batteriemanagement {
    instance;
    private final Batterie[][] batteries = new Batterie[2][2];

    Batteriemanagement(){
        batteries[0][0] = new Batterie();
        batteries[0][1] = new Batterie();
        batteries[1][0] = new Batterie();
        batteries[1][1] = new Batterie();
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



}
