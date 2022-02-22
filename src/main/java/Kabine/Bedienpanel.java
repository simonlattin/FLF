package Kabine;

public class Bedienpanel {

    private ElektromotorSchalter elektromotor;
    private WarnlichtSchalter warnlicht;
    private BlaulichtSchalter blaulicht;
    private FrontleuchtenSchalter frontleuchten;
    private DachscheinerferSchalter dachscheinwerfer;
    private SeitenleuchtenSchalter seitenleuchten;
    private Drehknopf frontwerfer;
    private Drehknopf dachloescharm;

    public Bedienpanel(){
        this.elektromotor = new ElektromotorSchalter();
        this.warnlicht = new WarnlichtSchalter();
        this.blaulicht = new BlaulichtSchalter();
        this.frontleuchten = new FrontleuchtenSchalter();
        this.dachscheinwerfer = new DachscheinerferSchalter();
        this.seitenleuchten = new SeitenleuchtenSchalter();
        this.frontwerfer = new Drehknopf(DrehknopfFunktion.FRONTWERFER);
        this.dachloescharm = new Drehknopf(DrehknopfFunktion.DACHLOESCHARM);
    }

    public void motorFlip(){
        this.elektromotor.flip();
    }

    public void warnlichtFlip(){
        this.warnlicht.flip();
    }

    public void blaulichFlip(){
        this.blaulicht.flip();
    }

    public void frontleuchtenFlip(){
        this.frontleuchten.flip();
    }

    public void dachscheinwerferFlip(){
        this.dachscheinwerfer.flip();
    }

    public void seitenleuchtenFlip(){
        this.seitenleuchten.flip();
    }
}
