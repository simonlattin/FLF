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
    private int lenkWinkel;

    public Axis(Position position){
        this.position = position;
        this.tire01 = new Tire(Position.LINKS);
        this.tire02 = new Tire(Position.RECHTS);
        this.brakeDisc01 = new BrakeDisc(Position.LINKS);
        this.brakeDisc02 = new BrakeDisc(Position.LINKS);
        this.brakeDisc03 = new BrakeDisc(Position.LINKS);
        this.brakeDisc04 = new BrakeDisc(Position.RECHTS);
        this.brakeDisc05 = new BrakeDisc(Position.RECHTS);
        this.brakeDisc06 = new BrakeDisc(Position.RECHTS);
        if (this.position == Position.VORNE){
            this.lenkWinkel = 0;
        }
    }

    public BrakeDisc getBremsscheibe01() {
        return brakeDisc01;
    }

    public BrakeDisc getBremsscheibe02() {
        return brakeDisc02;
    }

    public BrakeDisc getBremsscheibe03() {
        return brakeDisc03;
    }

    public BrakeDisc getBremsscheibe04() {
        return brakeDisc04;
    }

    public BrakeDisc getBremsscheibe05() {
        return brakeDisc05;
    }

    public BrakeDisc getBremsscheibe06() {
        return brakeDisc06;
    }

    public Tire getReifen02() {
        return tire02;
    }

    public Tire getReifen01() {
        return tire01;
    }

    public int getLenkWinkel() {
        return lenkWinkel;
    }

    public void turn(int lenkWinkel){
        this.lenkWinkel = this.lenkWinkel + lenkWinkel;
    }
}
