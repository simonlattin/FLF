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
        this.electricMotorLever = new ElectricMotorLever(centralUnit);
        this.warningLightLever = new WarningLightLever(centralUnit);
        this.blueLightLever = new BlueLightLever(centralUnit);
        this.frontlightsLever = new FrontlightsLever(centralUnit);
        this.roofHeadLightsLever = new RoofHeadlightsLever(centralUnit);
        this.sideLightsLever = new SideLightsLever(centralUnit);
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
