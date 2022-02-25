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

    public ElectricMotorLever getElectricMotorLever() {
        return electricMotorLever;
    }

    public WarningLightLever getWarningLightLever() {
        return warningLightLever;
    }

    public BlueLightLever getBlueLightLever() {
        return blueLightLever;
    }

    public FrontlightsLever getFrontlightsLever() {
        return frontlightsLever;
    }

    public RoofHeadlightsLever getRoofHeadLightsLever() {
        return roofHeadLightsLever;
    }

    public SideLightsLever getSideLightsLever() {
        return sideLightsLever;
    }

    public TurnKnob getFrontExtinguisherKnob() {
        return frontExtinguisherKnob;
    }

    public TurnKnob getRoofExtinguisherKnob() {
        return roofExtinguisherKnob;
    }

    public CentralUnit getCentralUnit() {
        return centralUnit;
    }

    public void flip(int option){
        switch (option) {
            case 1:
                this.electricMotorLever.flip();
                break;
            case 2:
                this.warningLightLever.flip();
                break;
            case 3:
                this.blueLightLever.flip();
                break;
            case 4:
                this.frontlightsLever.flip();
                break;
            case 5:
                this.roofHeadLightsLever.flip();
                break;
            case 6:
                this.sideLightsLever.flip();
                break;
        }
    }

    public void turnKnob(int option, char state){
        if(option == 1){
            turnFrontExtingushierKnob(state);
        } else {
            turnRoofExtingushierKnob(state);
        }
    }

    public void turnFrontExtingushierKnob(char state){
        this.frontExtinguisherKnob.turn(state);
    }

    public void turnRoofExtingushierKnob(char state){
        this.roofExtinguisherKnob.turn(state);
    }
}
