package Battery;

public abstract class ELoadingStation {

    private Pol pol;
    protected int chargingCurrent;

    public ELoadingStation(){
        pol = new Pol();
        chargingCurrent = 1000;
        pol.setChargignCurrent(chargingCurrent);
    }

    public Pol getPol() {
        return pol;
    }

    protected int getChargingCurrent() {
        return chargingCurrent;
    }
}
