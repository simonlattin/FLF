package Axes;

public class Axis {

    private final Tire tire01;
    private final Tire tire02;
    private final BrakeDisc brakeDisc01;
    private final BrakeDisc brakeDisc02;
    private final BrakeDisc brakeDisc03;
    private final BrakeDisc brakeDisc04;
    private final BrakeDisc brakeDisc05;
    private final BrakeDisc brakeDisc06;
    private final Position position;
    private int steeringDegree;

    public Axis(Position position){
        this.position = position;
        this.tire01 = new Tire(Position.LEFT);
        this.tire02 = new Tire(Position.RIGHT);
        this.brakeDisc01 = new BrakeDisc(Position.LEFT);
        this.brakeDisc02 = new BrakeDisc(Position.LEFT);
        this.brakeDisc03 = new BrakeDisc(Position.LEFT);
        this.brakeDisc04 = new BrakeDisc(Position.RIGHT);
        this.brakeDisc05 = new BrakeDisc(Position.RIGHT);
        this.brakeDisc06 = new BrakeDisc(Position.RIGHT);
        if (this.position == Position.FRONT){
            this.steeringDegree = 0;
        }
    }

    public BrakeDisc getBrakeDisc01() {
        return brakeDisc01;
    }

    public BrakeDisc getBrakeDisc02() {
        return brakeDisc02;
    }

    public BrakeDisc getBrakeDisc03() {
        return brakeDisc03;
    }

    public BrakeDisc getBrakeDisc04() {
        return brakeDisc04;
    }

    public BrakeDisc getBrakeDisc05() {
        return brakeDisc05;
    }

    public BrakeDisc getBrakeDisc06() {
        return brakeDisc06;
    }

    public Tire getTire02() {
        return tire02;
    }

    public Tire getTire01() {
        return tire01;
    }

    public int getSteeringDegree() {
        return steeringDegree;
    }

    public void turn(int steeringDegree){
        System.out.println("a"+this.steeringDegree);
        this.steeringDegree = this.steeringDegree + steeringDegree;
    }
}
