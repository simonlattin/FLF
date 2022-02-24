package Cabin;

import Controls.CentralUnit;

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
    private final BrakePedal brakePedal;
    private final GasPedal gaspedal;
    private final CentralUnit centralUnit;

    public Cabin(CabinBuilder builder){
        this.doorLeft =  builder.doorLeft;
        this.doorRight = builder.doorRight;
        this.joystickFront = builder.joystickFront;
        this.joystickRoof = builder.joystickRoof;
        this.centralUnit = builder.centralUnit;
        this.controlPanel = builder.controlPanel;
        this.steeringWheel = builder.steeringWheel;
        this.energyDisplay = builder.energyDisplay;
        this.speedDisplay = builder.speedDisplay;
        this.brakePedal = builder.brakePedal;
        this.gaspedal = builder.gaspedal;
        this.seat01 = builder.seat01;
        this.seat02 = builder.seat02;
        this.seat03 = builder.seat03;
        this.seat04 = builder.seat04;
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

    public BrakePedal getBreakPedal() {
        return brakePedal;
    }

    public GasPedal getGaspedal() {
        return gaspedal;
    }

    public static class CabinBuilder{
        private BusDoor doorLeft;
        private BusDoor doorRight;
        private Joystick joystickFront;
        private Joystick joystickRoof;
        private ControlPanel controlPanel;
        private SteeringWheel steeringWheel;
        private EnergyDisplay energyDisplay;
        private SpeedDisplay speedDisplay;
        private BrakePedal brakePedal;
        private GasPedal gaspedal;
        private CentralUnit centralUnit;
        private Seat seat01;
        private Seat seat02;
        private Seat seat03;
        private Seat seat04;

        public CabinBuilder withCentralUnit(CentralUnit getCentralUnit){
                doorLeft = new BusDoor(Position.LEFT);
                doorRight = new BusDoor(Position.RIGHT);
                joystickFront = new JoystickFrontExtinguisher();
                joystickRoof = new JoystickRoofExtinguisher();
                controlPanel = new ControlPanel(getCentralUnit);
                steeringWheel = new SteeringWheel(getCentralUnit);
                energyDisplay = new EnergyDisplay();
                speedDisplay = new SpeedDisplay();
                brakePedal = new BrakePedal(getCentralUnit);
                gaspedal = new GasPedal(getCentralUnit);
                centralUnit = getCentralUnit;
                seat01 = new Driverseat(Position.FRONTLEFT, gaspedal, brakePedal, steeringWheel);
                seat02 = new Operatorseat(Position.FRONTRIGHT);
                seat03 = new Backseat(Position.BACKLEFT);
                seat04 = new Backseat(Position.BACKRIGHT);
                return this;
            }
        }
    }

