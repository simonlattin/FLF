package Cabin;

import Controls.CentralUnit;
import Extinguisher.ITankSensor;
import Extinguisher.Tank;
import Extinguisher.TankKind;
import Extinguisher.TankSensor;
import Lights.Color;
import Lights.LED;

import java.util.ArrayList;

public class ControlPanel {

    /*private final ElectricMotorLever electricMotorLever;
    private final WarningLightLever warningLightLever;
    private final BlueLightLever blueLightLever;
    private final FrontlightsLever frontlightsLever;
    private final RoofHeadlightsLever roofHeadLightsLever;
    private final SideLightsLever sideLightsLever;*/
    private final TurnKnob frontExtinguisherKnob;
    private final TurnKnob roofExtinguisherKnob;
    private final ControlButton motorButton;
    private final ControlButton headlightsButton;
    private final ControlButton rooflightsButton;
    private final ControlButton sidelightsButton;
    private final ControlButton bluelightsButton;
    private final ControlButton warninglightButton;
    private final CentralUnit centralUnit;
    private final LED tankLightWater;
    private final LED tankLightFoam;
    private final ArrayList<ITankSensor> sensors;

    public ControlPanel(CentralUnit centralUnit, Tank waterTank, Tank foamTank){
        this.motorButton = new MotorButton(centralUnit);
        this.bluelightsButton = new BluelightsButton(centralUnit);
        this.warninglightButton = new WarninglightsButton(centralUnit);
        this.sidelightsButton = new SidelightsButton(centralUnit);
        this.rooflightsButton = new RooflightsButton(centralUnit);
        this.headlightsButton = new HeadlightsButton(centralUnit);
        /*this.electricMotorLever = new ElectricMotorLever(centralUnit);
        this.warningLightLever = new WarningLightLever(centralUnit);
        this.blueLightLever = new BlueLightLever(centralUnit);
        this.frontlightsLever = new FrontlightsLever(centralUnit);
        this.roofHeadLightsLever = new RoofHeadlightsLever(centralUnit);
        this.sideLightsLever = new SideLightsLever(centralUnit);*/
        this.frontExtinguisherKnob = new TurnKnob(TurnKnobFunction.FRONTEXTINGUISHER);
        this.roofExtinguisherKnob = new TurnKnob(TurnKnobFunction.ROOFEXTINGUISHER);
        this.centralUnit = centralUnit;
        this.tankLightFoam = new LED(Color.INACTIVE);
        this.tankLightWater = new LED(Color.INACTIVE);
        sensors = new ArrayList<>();
        sensors.add(new TankSensor(waterTank));
        sensors.add(new TankSensor(foamTank));
    }

    /*public ElectricMotorLever getElectricMotorLever() {
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
    }*/

    public TurnKnob getFrontExtinguisherKnob() {
        return frontExtinguisherKnob;
    }

    public TurnKnob getRoofExtinguisherKnob() {
        return roofExtinguisherKnob;
    }

    public CentralUnit getCentralUnit() {
        return centralUnit;
    }

    public void addSensor(ITankSensor newSensor){
        sensors.add(newSensor);
    }

    public void removeSensor(ITankSensor sensor){
        sensors.remove(sensor);
    }

    public void checkTanks(){
        for(ITankSensor sensor : sensors){
            if(sensor.getTankKind() == TankKind.WATER){
                switch(sensor.checkContents()){
                    case 2 -> tankLightWater.setColor(Color.YELLOW);
                    case 3 -> tankLightWater.setColor(Color.ORANGE);
                    case 4 -> tankLightWater.setColor(Color.RED);
                    default -> tankLightWater.setColor(Color.INACTIVE);
                }
            }
            if(sensor.getTankKind() == TankKind.FOAM){
                switch(sensor.checkContents()){
                    case 2 -> tankLightFoam.setColor(Color.YELLOW);
                    case 3 -> tankLightFoam.setColor(Color.ORANGE);
                    case 4 -> tankLightFoam.setColor(Color.RED);
                    default -> tankLightFoam.setColor(Color.INACTIVE);
                }
            }
            
        }
    }

    /*public void flip(int option){
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
    }*/

    public void pressButton(int id){
        switch(id){
            case 1 -> motorButton.press();
            case 2 -> warninglightButton.press();
            case 3 -> bluelightsButton.press();
            case 4 -> headlightsButton.press();
            case 5 -> rooflightsButton.press();
            case 6 -> sidelightsButton.press();
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

    public LED getTankLightWater(){
        return tankLightWater;
    }

    public LED getTankLightFoam(){
        return tankLightFoam;
    }
}
