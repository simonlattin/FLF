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
        int singleAmount = amount / 4;
        for(int i = 0;i<2;i++){
            for(int j = 0;j<2;j++){
                batteries[i][j].takeOut(singleAmount);
            }
        }
    }



}
