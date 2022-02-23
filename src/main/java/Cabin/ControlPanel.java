package Cabin;

public class ControlPanel {

    private final ElectricMotorLever elektromotor;
    private final WarningLightLever warnlicht;
    private final BlueLightLever blaulicht;
    private final FrontlightsLever frontleuchten;
    private final RoofHeadlights dachscheinwerfer;
    private final SideLightsLever seitenleuchten;
    private final TurnKnob frontwerfer;
    private final TurnKnob dachloescharm;

    public ControlPanel(){
        this.elektromotor = new ElectricMotorLever();
        this.warnlicht = new WarningLightLever();
        this.blaulicht = new BlueLightLever();
        this.frontleuchten = new FrontlightsLever();
        this.dachscheinwerfer = new RoofHeadlights();
        this.seitenleuchten = new SideLightsLever();
        this.frontwerfer = new TurnKnob(TurnKnobFunction.FRONTEXTINGUISHER);
        this.dachloescharm = new TurnKnob(TurnKnobFunction.ROOFEXTINGUISHER);
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
