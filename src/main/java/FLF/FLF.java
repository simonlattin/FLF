package FLF;

import Axes.Axis;
import Cabin.Cabin;
import Controls.CentralUnit;
import Drive.ElectricMotor;
import Extinguisher.*;
import Lights.*;

public class FLF {

    private final Spotlight spotlight01;
    private final Spotlight spotlight02;
    private final Spotlight spotlight03;
    private final Spotlight spotlight04;
    private final Spotlight spotlight05;
    private final Spotlight spotlight06;
    private final Spotlight spotlight07;
    private final Spotlight spotlight08;
    private final Spotlight spotlight09;
    private final Spotlight spotlight10;
    private final Indicator indicator01;
    private final Indicator indicator02;
    private final Indicator indicator03;
    private final Indicator indicator04;
    private final BreakLight breakLight01;
    private final BreakLight breakLight02;
    private final BlueLight blueLight01;
    private final BlueLight blueLight02;
    private final BlueLight blueLight03;
    private final BlueLight blueLight04;
    private final BlueLight blueLight05;
    private final BlueLight blueLight06;
    private final BlueLight blueLight07;
    private final BlueLight blueLight08;
    private final BlueLight blueLight09;
    private final BlueLight blueLight10;
    private final WarningLight warningLight;
    private final Cabin cabin;
    private final Axis axis01;
    private final Axis axis02;
    private final Axis axis03;
    private final Axis axis04;
    private final SideLight rightSide1;
    private final SideLight rightSide2;
    private final SideLight rightSide3;
    private final SideLight rightSide4;
    private final SideLight rightSide5;
    private final SideLight leftSide1;
    private final SideLight leftSide2;
    private final SideLight leftSide3;
    private final SideLight leftSide4;
    private final SideLight leftSide5;
    private final ElectricMotor motor01;
    private final ElectricMotor motor02;
    private final CentralUnit centralUnit;
    private final Tank waterTank;
    private final Tank foamTank;
    private final MixingUnit mixingUnit;
    private final FrontExtinguisher frontExtinguisher;
    private final RoofExtinguisher roofExtinguisher;

    public FLF(Builder builder){
        spotlight01 = builder.spotlight01;//VORNELINKS
        spotlight02 = builder.spotlight01;//VORNELINKS
        spotlight03 = builder.spotlight01;//VORNELINKS
        spotlight04 = builder.spotlight03;//VORNERECHTS
        spotlight05 = builder.spotlight03;//VORNERECHTS
        spotlight06 = builder.spotlight03;//VORNERECHTS
        spotlight07 = builder.spotlight02;//DACH
        spotlight08 = builder.spotlight02;//DACH
        spotlight09 = builder.spotlight02;//DACH
        spotlight10 = builder.spotlight02;//DACH
        indicator01 = builder.indicator01;//VORNELINKS
        indicator02 = builder.indicator02;//VORNERECHTS
        indicator03 = builder.indicator03;//HINTENLINKS
        indicator04 = builder.indicator04;//HINTENRECHTS
        breakLight01 = builder.breakLight01;
        breakLight02 = builder.breakLight02;
        blueLight01 = builder.blueLight01; //Vorne
        blueLight02 = builder.blueLight01; //Vorne
        blueLight03 = builder.blueLight02; //Dach
        blueLight04 = builder.blueLight02; //Dach
        blueLight05 = builder.blueLight02; //Dach
        blueLight06 = builder.blueLight02; //Dach
        blueLight07 = builder.blueLight03; //Hinten Rechts
        blueLight08 = builder.blueLight03; //Hinten Rechts
        blueLight09 = builder.blueLight04; //Hinten Links
        blueLight10 = builder.blueLight04; //Hinten Links
        warningLight = builder.warningLight;
        centralUnit = builder.centralUnit;
        cabin = builder.cabin;
        axis01 = builder.axis01; //VORNE
        axis02 = builder.axis01; //VORNE
        axis03 = builder.axis02; //HINTEN
        axis04 = builder.axis02; //HINTEN
        rightSide1 = builder.sideLightRight;
        rightSide2 = builder.sideLightRight;
        rightSide3 = builder.sideLightRight;
        rightSide4 = builder.sideLightRight;
        rightSide5 = builder.sideLightRight;
        leftSide1 = builder.sideLightLeft;
        leftSide2 = builder.sideLightLeft;
        leftSide3 = builder.sideLightLeft;
        leftSide4 = builder.sideLightLeft;
        leftSide5 = builder.sideLightLeft;
        motor01 = builder.motor;
        motor02 = builder.motor;
        waterTank = builder.waterTank;
        foamTank = builder.foamTank;
        mixingUnit = builder.mixingUnit;
        frontExtinguisher = builder.frontExtinguisher;
        roofExtinguisher = builder.roofExtinguisher;

        mixingUnit.setFoamtank(foamTank);
        mixingUnit.setWatertank(waterTank);
        centralUnit.setFLF(this);
        frontExtinguisher.setMixingUnit(mixingUnit);
        roofExtinguisher.setMixingUnit(mixingUnit);
        cabin.getjoystickFront().setExtinguisher(frontExtinguisher, roofExtinguisher);
        cabin.getjoystickRoof().setExtinguisher(frontExtinguisher, roofExtinguisher);
    }

    public Spotlight getSpotlight01() {
        return spotlight01;
    }

    public Spotlight getSpotlight02() {
        return spotlight02;
    }

    public Spotlight getSpotlight03() {
        return spotlight03;
    }

    public Spotlight getSpotlight04() {
        return spotlight04;
    }

    public Spotlight getSpotlight05() {
        return spotlight05;
    }

    public Spotlight getSpotlight06() {
        return spotlight06;
    }

    public Spotlight getSpotlight07() {
        return spotlight07;
    }

    public Spotlight getSpotlight08() {
        return spotlight08;
    }

    public Spotlight getSpotlight09() {
        return spotlight09;
    }

    public Spotlight getSpotlight10() {
        return spotlight10;
    }

    public Indicator getIndicator01() {
        return indicator01;
    }

    public Indicator getIndicator02() {
        return indicator02;
    }

    public Indicator getIndicator03() {
        return indicator03;
    }

    public Indicator getIndicator04() {
        return indicator04;
    }

    public BreakLight getBreakLight01() {
        return breakLight01;
    }

    public BreakLight getBreakLight02() {
        return breakLight02;
    }

    public BlueLight getBlueLight01() {
        return blueLight01;
    }

    public BlueLight getBlueLight02() {
        return blueLight02;
    }

    public BlueLight getBlueLight03() {
        return blueLight03;
    }

    public BlueLight getBlueLight04() {
        return blueLight04;
    }

    public BlueLight getBlueLight05() {
        return blueLight05;
    }

    public BlueLight getBlueLight06() {
        return blueLight06;
    }

    public BlueLight getBlueLight07() {
        return blueLight07;
    }

    public BlueLight getBlueLight08() {
        return blueLight08;
    }

    public BlueLight getBlueLight09() {
        return blueLight09;
    }

    public BlueLight getBlueLight10() {
        return blueLight10;
    }

    public WarningLight getWarningLight() {
        return warningLight;
    }

    public Cabin getCabin() {
        return cabin;
    }

    public Axis getAxis01() {
        return axis01;
    }

    public Axis getAxis02() {
        return axis02;
    }

    public Axis getAxis03() {
        return axis03;
    }

    public Axis getAxis04() {
        return axis04;
    }

    public SideLight getRightSide1() {
        return rightSide1;
    }

    public SideLight getRightSide2() {
        return rightSide2;
    }

    public SideLight getRightSide3() {
        return rightSide3;
    }

    public SideLight getRightSide4() {
        return rightSide4;
    }

    public SideLight getRightSide5() {
        return rightSide5;
    }

    public SideLight getLeftSide1() {
        return leftSide1;
    }

    public SideLight getLeftSide2() {
        return leftSide2;
    }

    public SideLight getLeftSide3() {
        return leftSide3;
    }

    public SideLight getLeftSide4() {
        return leftSide4;
    }

    public SideLight getLeftSide5() {
        return leftSide5;
    }

    public ElectricMotor getMotor01() {
        return motor01;
    }

    public ElectricMotor getMotor02() {
        return motor02;
    }

    public CentralUnit getCentralUnit() {
        return centralUnit;
    }

    public Tank getWaterTank() {
        return waterTank;
    }

    public Tank getFoamTank() {
        return foamTank;
    }

    public MixingUnit getMixingUnit() {
        return mixingUnit;
    }

    public FrontExtinguisher getFrontExtinguisher() {
        return frontExtinguisher;
    }

    public RoofExtinguisher getRoofExtinguisher() {
        return roofExtinguisher;
    }

    public static class Builder{

        private final Spotlight spotlight01;
        private final Spotlight spotlight02;
        private final Spotlight spotlight03;
        private final Indicator indicator01;
        private final Indicator indicator02;
        private final Indicator indicator03;
        private final Indicator indicator04;
        private final BreakLight breakLight01;
        private final BreakLight breakLight02;
        private final BlueLight blueLight01;
        private final BlueLight blueLight02;
        private final BlueLight blueLight03;
        private final BlueLight blueLight04;
        private final WarningLight warningLight;
        private final Cabin cabin;
        private final Axis axis01;
        private final Axis axis02;
        private final SideLight sideLightRight;
        private final SideLight sideLightLeft;
        private final ElectricMotor motor;
        private final CentralUnit centralUnit;
        private final Tank waterTank;
        private final Tank foamTank;
        private final MixingUnit mixingUnit;
        private final FrontExtinguisher frontExtinguisher;
        private final RoofExtinguisher roofExtinguisher;


        public Builder(){
            this.spotlight01 = new Spotlight(Position.FRONTLEFT);
            this.spotlight02 = new Spotlight(Position.ROOF);
            this.spotlight03 = new Spotlight(Position.FRONTRIGHT);
            this.indicator01 = new Indicator(Position.FRONTLEFT);
            this.indicator02 = new Indicator(Position.FRONTRIGHT);
            this.indicator03 = new Indicator(Position.BACKLEFT);
            this.indicator04 = new Indicator(Position.BACKRIGHT);
            this.breakLight01 = new BreakLight(Position.BACKLEFT);
            this.breakLight02 = new BreakLight(Position.BACKRIGHT);
            this.blueLight01 = new BlueLight(Size.SMALL, Position.FRONT);
            this.blueLight02 = new BlueLight(Size.BIG, Position.ROOF);
            this.blueLight03 = new BlueLight(Size.MEDIUM, Position.BACKRIGHT);
            this.blueLight04 = new BlueLight(Size.MEDIUM, Position.BACKLEFT);
            this.warningLight = new WarningLight();
            this.centralUnit = new CentralUnit();
            this.cabin = new Cabin(centralUnit);
            this.axis01 = new Axis(Axes.Position.FRONT);
            this.axis02 = new Axis(Axes.Position.BACK);
            this.sideLightLeft = new SideLight(Position.LEFT);
            this.sideLightRight = new SideLight(Position.RIGHT);
            this.motor = new ElectricMotor(this.cabin.getSpeedDisplay());
            this.waterTank = new Tank(TankKind.WATER);
            this.foamTank = new Tank(TankKind.FOAM);
            this.mixingUnit = new MixingUnit();
            this.frontExtinguisher = new FrontExtinguisher();
            this.roofExtinguisher = new RoofExtinguisher();
        }

        public FLF build(){
            return new FLF(this);
        }
    }

    public void park() {
        this.cabin.getDoorLeft().pressButton();
        this.cabin.getDoorRight().pressButton();
    }
}
