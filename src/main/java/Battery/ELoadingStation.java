package Battery;

public abstract class ELoadingStation {

    private final Pol pol = new Pol();

    public ELoadingStation(){
    }

    public Pol getPol() {
        return pol;
    }

//    public void chargeWithAdapter(){}
}
