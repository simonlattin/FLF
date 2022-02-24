package Cabin;

import Controls.CentralUnit;

public class ControlPanel {

    private final ElectricMotorLever electricMotorLever;
    private final WarningLightLever warningLightLever;
    private final BlueLightLever blueLightLever;
    private final FrontlightsLever frontlightsLever;
    private final RoofHeadlightsLever roofHeadLightsLever;
    private final SideLightsLever sideLightsLever;
    private final TurnKnob frontExtinguisherKnob;
    private final TurnKnob roofExtinguisherKnob;
    private final CentralUnit centralUnit;

    public ControlPanel(CentralUnit centralUnit){
        this.electricMotorLever = new ElectricMotorLever();
        this.warningLightLever = new WarningLightLever();
        this.blueLightLever = new BlueLightLever();
        this.frontlightsLever = new FrontlightsLever();
        this.roofHeadLightsLever = new RoofHeadlightsLever();
        this.sideLightsLever = new SideLightsLever();
        this.frontExtinguisherKnob = new TurnKnob(TurnKnobFunction.FRONTEXTINGUISHER);
        this.roofExtinguisherKnob = new TurnKnob(TurnKnobFunction.ROOFEXTINGUISHER);
        this.centralUnit = centralUnit;
    }

    public void motorLeverFlip(){
        this.electricMotorLever.flip();
    }

    public void warningLightLeverFlip(){
        this.warningLightLever.flip();
    }

    public void blueLightLeverFlip(){
        this.blueLightLever.flip();
    }

    public void frontlightsLeverFlip(){
        this.frontlightsLever.flip();
    }

    public void roofHeadLightsLeverFlip(){
        this.roofHeadLightsLever.flip();
    }

    public void sideLightsLeverFlip(){
        this.sideLightsLever.flip();
    }
}
