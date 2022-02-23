package Cabin;

import Extinguisher.*;

public class Cabin {

    private final BusDoor tuerLinks;
    private final BusDoor tuerRechts;
    private final Sitzplatz sitzplatz01;
    private final Sitzplatz sitzplatz02;
    private final Sitzplatz sitzplatz03;
    private final Sitzplatz sitzplatz04;
    private final Joystick joystick01;
    private final Joystick joystick02;
    private final ControlPanel controlPanel;
    private final SteeringWheel steeringWheel;
    private final EnergyDisplay energyDisplay;
    private final SpeedDisplay speedDisplay;
    private final BreakPedal breakPedal;
    private final GasPedal gaspedal;

    public Cabin(){
        this.tuerLinks =  new BusDoor(Position.LINKS);
        this.tuerRechts = new BusDoor(Position.RECHTS);
        this.sitzplatz01 = new Sitzplatz(Position.VORNELINKS);
        this.sitzplatz02 = new Sitzplatz(Position.VORNERECHTS);
        this.sitzplatz03 = new Sitzplatz(Position.HINTENLINKS);
        this.sitzplatz04 = new Sitzplatz(Position.HINTENRECHTS);
        this.joystick01 = new JoystickFrontExtinguisher(new FrontExtinguisher(new MixingUnit(new Tank(TankKind.WASSER),new Tank(TankKind.SCHAUMPULVER))));//Löscharm anpassen
        this.joystick02 = new JoystickRoofExtinguisher(new RoofExtinguisher(new MixingUnit(new Tank(TankKind.WASSER),new Tank(TankKind.SCHAUMPULVER))));//Löscharm anpassen
        this.controlPanel = new ControlPanel();
        this.steeringWheel = new SteeringWheel();
        this.energyDisplay = new EnergyDisplay();
        this.speedDisplay = new SpeedDisplay();
        this.breakPedal = new BreakPedal();
        this.gaspedal = new GasPedal();
    }
}
