package Cabin;

import Extinguisher.*;

public class Cabin {

    private final BusDoor doorLeft;
    private final BusDoor doorRight;
    private final Seat seat01;
    private final Seat seat02;
    private final Seat seat03;
    private final Seat seat04;
    private final Joystick joystick01;
    private final Joystick joystick02;
    private final ControlPanel controlPanel;
    private final SteeringWheel steeringWheel;
    private final EnergyDisplay energyDisplay;
    private final SpeedDisplay speedDisplay;
    private final BreakPedal breakPedal;
    private final GasPedal gaspedal;

    public Cabin(){
        this.doorLeft =  new BusDoor(Position.LEFT);
        this.doorRight = new BusDoor(Position.RIGHT);
        this.seat01 = new Seat(Position.FRONTLEFT);
        this.seat02 = new Seat(Position.FRONTRIGHT);
        this.seat03 = new Seat(Position.BACKLEFT);
        this.seat04 = new Seat(Position.BACKRIGHT);
        this.joystick01 = new JoystickFrontExtinguisher(new FrontExtinguisher(new MixingUnit(new Tank(TankKind.WATER),new Tank(TankKind.FOAM))));//Löscharm anpassen
        this.joystick02 = new JoystickRoofExtinguisher(new RoofExtinguisher(new MixingUnit(new Tank(TankKind.WATER),new Tank(TankKind.FOAM))));//Löscharm anpassen
        this.controlPanel = new ControlPanel();
        this.steeringWheel = new SteeringWheel();
        this.energyDisplay = new EnergyDisplay();
        this.speedDisplay = new SpeedDisplay();
        this.breakPedal = new BreakPedal();
        this.gaspedal = new GasPedal();
    }
}
