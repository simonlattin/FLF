package Cabin;

import Controls.CentralUnit;
import Extinguisher.*;

public class Cabin {

    private final BusDoor doorLeft;
    private final BusDoor doorRight;
    private final Seat seat01;
    private final Seat seat02;
    private final Seat seat03;
    private final Seat seat04;
    private final Joystick joystickFront;
    private final Joystick joystickRoof;
    private final ControlPanel controlPanel;
    private final SteeringWheel steeringWheel;
    private final EnergyDisplay energyDisplay;
    private final SpeedDisplay speedDisplay;
    private final BreakPedal breakPedal;
    private final GasPedal gaspedal;
    private final CentralUnit centralUnit;

    public Cabin(CentralUnit centralUnit){
        this.doorLeft =  new BusDoor(Position.LEFT);
        this.doorRight = new BusDoor(Position.RIGHT);
        this.seat01 = new Seat(Position.FRONTLEFT);
        this.seat02 = new Seat(Position.FRONTRIGHT);
        this.seat03 = new Seat(Position.BACKLEFT);
        this.seat04 = new Seat(Position.BACKRIGHT);
        this.joystickFront = new JoystickFrontExtinguisher();//Löscharm anpassen
        this.joystickRoof = new JoystickRoofExtinguisher();//Löscharm anpassen
        this.centralUnit = centralUnit;
        this.controlPanel = new ControlPanel(centralUnit);
        this.steeringWheel = new SteeringWheel(centralUnit);
        this.energyDisplay = new EnergyDisplay();
        this.speedDisplay = new SpeedDisplay();
        this.breakPedal = new BreakPedal(centralUnit);
        this.gaspedal = new GasPedal(centralUnit);
    }

    public BusDoor getDoorLeft() {
        return doorLeft;
    }

    public BusDoor getDoorRight() {
        return doorRight;
    }

    public Seat getSeat01() {
        return seat01;
    }

    public Seat getSeat02() {
        return seat02;
    }

    public Seat getSeat03() {
        return seat03;
    }

    public Seat getSeat04() {
        return seat04;
    }

    public Joystick getjoystickFront() {
        return joystickFront;
    }

    public Joystick getjoystickRoof() {
        return joystickRoof;
    }

    public ControlPanel getControlPanel() {
        return controlPanel;
    }

    public SteeringWheel getSteeringWheel() {
        return steeringWheel;
    }

    public EnergyDisplay getEnergyDisplay() {
        return energyDisplay;
    }

    public SpeedDisplay getSpeedDisplay() {
        return speedDisplay;
    }

    public BreakPedal getBreakPedal() {
        return breakPedal;
    }

    public GasPedal getGaspedal() {
        return gaspedal;
    }
}
