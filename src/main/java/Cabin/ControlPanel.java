package Cabin;

public class ControlPanel {

    private final ElectricMotorLever elektromotor;
    private final WarnlichtLever warnlicht;
    private final BlueLightLever blaulicht;
    private final FrontlightsLever frontleuchten;
    private final RoofHeadlights dachscheinwerfer;
    private final SeitenleuchtenLever seitenleuchten;
    private final TurnKnob frontwerfer;
    private final TurnKnob dachloescharm;

    public ControlPanel(){
        this.elektromotor = new ElectricMotorLever();
        this.warnlicht = new WarnlichtLever();
        this.blaulicht = new BlueLightLever();
        this.frontleuchten = new FrontlightsLever();
        this.dachscheinwerfer = new RoofHeadlights();
        this.seitenleuchten = new SeitenleuchtenLever();
        this.frontwerfer = new TurnKnob(TurnKnobFunction.FRONTWERFER);
        this.dachloescharm = new TurnKnob(TurnKnobFunction.DACHLOESCHARM);
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
