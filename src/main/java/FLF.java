import Axes.Axis;
import Cabin.Cabin;
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
            this.cabin = new Cabin();
            this.axis01 = new Axis(Axes.Position.FRONT);
            this.axis02 = new Axis(Axes.Position.BACK);
            this.sideLightLeft = new SideLight(Position.LEFT);
            this.sideLightRight = new SideLight(Position.RIGHT);
        }
    }
}
