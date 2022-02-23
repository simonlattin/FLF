package Battery;

public class BatteryBox {

    private final Battery[][] batteries = new Battery[2][2];

    public BatteryBox(){
        this.batteries[0][0] = new Battery();
        this.batteries[0][1] = new Battery();
        this.batteries[1][0] = new Battery();
        this.batteries[1][1] = new Battery();
    }

    public Battery[][] getBatteries() {
        return batteries;
    }
}
