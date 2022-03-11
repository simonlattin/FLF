package FLF;

import Actors.Driver;
import Actors.Operator;
import Axes.Axis;
import Cabin.Cabin;
import Config.Configuration;
import Controls.CentralUnit;
import Drive.ElectricMotor;
import Extinguisher.*;
import Lights.*;

import java.io.File;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

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
    private final Object mixingUnit;
    private final FrontExtinguisher frontExtinguisher;
    private final RoofExtinguisher roofExtinguisher;
    private final FloorSprayNozzle floorSprayNozzle1;
    private final FloorSprayNozzle floorSprayNozzle2;
    private final FloorSprayNozzle floorSprayNozzle3;
    private final FloorSprayNozzle floorSprayNozzle4;
    private final FloorSprayNozzle floorSprayNozzle5;
    private final FloorSprayNozzle floorSprayNozzle6;
    private final FloorSprayNozzle floorSprayNozzle7;
    private Driver driver;
    private Operator operator;
    private Object instance;
    private Class clazz;

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
        axis02 = builder.axis02; //VORNE
        axis03 = builder.axis03; //HINTEN
        axis04 = builder.axis04; //HINTEN
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
        loadClazzFromJavaArchive();
        provideInstanceOfClass();
        mixingUnit = instance;
        frontExtinguisher = builder.frontExtinguisher;
        roofExtinguisher = builder.roofExtinguisher;
        floorSprayNozzle1 = builder.floorSprayNozzle1;
        floorSprayNozzle2 = builder.floorSprayNozzle2;
        floorSprayNozzle3 = builder.floorSprayNozzle3;
        floorSprayNozzle4 = builder.floorSprayNozzle4;
        floorSprayNozzle5 = builder.floorSprayNozzle5;
        floorSprayNozzle6 = builder.floorSprayNozzle6;
        floorSprayNozzle7 = builder.floorSprayNozzle7;

        setTank("setFoamtank", foamTank);
        setTank("setWatertank", waterTank);
        centralUnit.setFLF(this);
        frontExtinguisher.setMixingUnit(mixingUnit);
        roofExtinguisher.setMixingUnit(mixingUnit);
        roofExtinguisher.setClazz(clazz);
        frontExtinguisher.setClazz(clazz);
        cabin.getjoystickFront().setExtinguisher(frontExtinguisher, roofExtinguisher);
        cabin.getjoystickRoof().setExtinguisher(frontExtinguisher, roofExtinguisher);
        centralUnit.addSubscriber(motor01);
        centralUnit.addSubscriber(motor02);
        centralUnit.addSubscriber(spotlight01);
        centralUnit.addSubscriber(spotlight02);
        centralUnit.addSubscriber(spotlight03);
        centralUnit.addSubscriber(spotlight04);
        centralUnit.addSubscriber(spotlight05);
        centralUnit.addSubscriber(spotlight06);
        centralUnit.addSubscriber(spotlight07);
        centralUnit.addSubscriber(spotlight08);
        centralUnit.addSubscriber(spotlight09);
        centralUnit.addSubscriber(spotlight10);
        centralUnit.addSubscriber(indicator01);
        centralUnit.addSubscriber(indicator02);
        centralUnit.addSubscriber(indicator03);
        centralUnit.addSubscriber(indicator04);
        centralUnit.addSubscriber(blueLight01);
        centralUnit.addSubscriber(blueLight02);
        centralUnit.addSubscriber(blueLight03);
        centralUnit.addSubscriber(blueLight04);
        centralUnit.addSubscriber(blueLight05);
        centralUnit.addSubscriber(blueLight06);
        centralUnit.addSubscriber(blueLight07);
        centralUnit.addSubscriber(blueLight08);
        centralUnit.addSubscriber(blueLight09);
        centralUnit.addSubscriber(blueLight10);
        centralUnit.addSubscriber(warningLight);
        centralUnit.addSubscriber(leftSide1);
        centralUnit.addSubscriber(leftSide2);
        centralUnit.addSubscriber(leftSide3);
        centralUnit.addSubscriber(leftSide4);
        centralUnit.addSubscriber(leftSide5);
        centralUnit.addSubscriber(rightSide1);
        centralUnit.addSubscriber(rightSide2);
        centralUnit.addSubscriber(rightSide3);
        centralUnit.addSubscriber(rightSide4);
        centralUnit.addSubscriber(rightSide5);
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

    public Object getMixingUnit() {
        return mixingUnit;
    }

    public FrontExtinguisher getFrontExtinguisher() {
        return frontExtinguisher;
    }

    public RoofExtinguisher getRoofExtinguisher() {
        return roofExtinguisher;
    }

    public FloorSprayNozzle getFloorSprayNozzle1() {
        return floorSprayNozzle1;
    }

    public FloorSprayNozzle getFloorSprayNozzle2() {
        return floorSprayNozzle2;
    }

    public FloorSprayNozzle getFloorSprayNozzle3() {
        return floorSprayNozzle3;
    }

    public FloorSprayNozzle getFloorSprayNozzle4() {
        return floorSprayNozzle4;
    }

    public FloorSprayNozzle getFloorSprayNozzle5() {
        return floorSprayNozzle5;
    }

    public FloorSprayNozzle getFloorSprayNozzle6() {
        return floorSprayNozzle6;
    }

    public FloorSprayNozzle getFloorSprayNozzle7() {
        return floorSprayNozzle7;
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
        private final Axis axis03;
        private final Axis axis04;
        private final SideLight sideLightRight;
        private final SideLight sideLightLeft;
        private final ElectricMotor motor;
        private final CentralUnit centralUnit;
        private final Tank waterTank;
        private final Tank foamTank;
        private final FrontExtinguisher frontExtinguisher;
        private final RoofExtinguisher roofExtinguisher;
        private final FloorSprayNozzle floorSprayNozzle1;
        private final FloorSprayNozzle floorSprayNozzle2;
        private final FloorSprayNozzle floorSprayNozzle3;
        private final FloorSprayNozzle floorSprayNozzle4;
        private final FloorSprayNozzle floorSprayNozzle5;
        private final FloorSprayNozzle floorSprayNozzle6;
        private final FloorSprayNozzle floorSprayNozzle7;


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
            this.waterTank = new Tank(TankKind.WATER);
            this.foamTank = new Tank(TankKind.FOAM);
            this.cabin = new Cabin(new Cabin.CabinBuilder().withCentralUnitAndTankSensors(centralUnit,waterTank,foamTank));
            this.axis01 = new Axis(Axes.Position.FRONT);
            this.axis02 = new Axis(Axes.Position.FRONT);
            this.axis03 = new Axis(Axes.Position.BACK);
            this.axis04 = new Axis(Axes.Position.BACK);
            this.sideLightLeft = new SideLight(Position.LEFT);
            this.sideLightRight = new SideLight(Position.RIGHT);
            this.motor = new ElectricMotor(this.cabin.getSpeedDisplay());
            this.frontExtinguisher = new FrontExtinguisher();
            this.roofExtinguisher = new RoofExtinguisher();
            this.floorSprayNozzle1 = new FloorSprayNozzle(waterTank);
            this.floorSprayNozzle2 = new FloorSprayNozzle(waterTank);
            this.floorSprayNozzle3 = new FloorSprayNozzle(waterTank);
            this.floorSprayNozzle4 = new FloorSprayNozzle(waterTank);
            this.floorSprayNozzle5 = new FloorSprayNozzle(waterTank);
            this.floorSprayNozzle6 = new FloorSprayNozzle(waterTank);
            this.floorSprayNozzle7 = new FloorSprayNozzle(waterTank);


        }

        public FLF build(){
            return new FLF(this);
        }
    }
    
    public void engineOn() {
        this.motor01.turnOn();
        this.motor02.turnOn();
    }
    
    public void turnOnBlueLight() {
        this.blueLight01.On();
        this.blueLight02.On();
        this.blueLight03.On();
        this.blueLight04.On();
        this.blueLight05.On();
        this.blueLight06.On();
        this.blueLight07.On();
        this.blueLight08.On();
        this.blueLight09.On();
        this.blueLight10.On();
    }

    public void turnOffBlueLight() {
        this.blueLight01.Off();
        this.blueLight02.Off();
        this.blueLight03.Off();
        this.blueLight04.Off();
        this.blueLight05.Off();
        this.blueLight06.Off();
        this.blueLight07.Off();
        this.blueLight08.Off();
        this.blueLight09.Off();
        this.blueLight10.Off();
    }
    
    public void turnOnFrontLight() {
        this.spotlight01.On();
        this.spotlight02.On();
        this.spotlight03.On();
        this.spotlight04.On();
        this.spotlight05.On();
        this.spotlight06.On();
    }

    public void turnOffFrontLight() {
        this.spotlight01.Off();
        this.spotlight02.Off();
        this.spotlight03.Off();
        this.spotlight04.Off();
        this.spotlight05.Off();
        this.spotlight06.Off();
    }

    public void turnOnRoofLight() {
        this.spotlight07.On();
        this.spotlight08.On();
        this.spotlight09.On();
        this.spotlight10.On();
    }

    public void turnOffRoofLight() {
        this.spotlight07.Off();
        this.spotlight08.Off();
        this.spotlight09.Off();
        this.spotlight10.Off();
    }
    
    public void turnOnSideLights() {
        this.leftSide1.On();
        this.leftSide2.On();
        this.leftSide3.On();
        this.leftSide4.On();
        this.leftSide5.On();
        this.rightSide1.On();
        this.rightSide2.On();
        this.rightSide3.On();
        this.rightSide4.On();
        this.rightSide5.On();
    }

    public void turnOffSideLights() {
        this.leftSide1.Off();
        this.leftSide2.Off();
        this.leftSide3.Off();
        this.leftSide4.Off();
        this.leftSide5.Off();
        this.rightSide1.Off();
        this.rightSide2.Off();
        this.rightSide3.Off();
        this.rightSide4.Off();
        this.rightSide5.Off();
    }

    public void speedUp(int amount) {
        for (int i = 0; i < amount; i++) {
            this.cabin.getGaspedal().accelerate();
        }
    }

    public void speedDown(int amount){
        for (int i = 0; i < amount; i++) {
            this.cabin.getBreakPedal().brake();
        }
    }

    public void drive(){
        this.centralUnit.drive();
    }

    public void steer(int angle){
        this.cabin.getSteeringWheel().turn(angle);
    }

    public void activateFloorSprayNuzzles() {
        this.floorSprayNozzle1.spray();
        this.floorSprayNozzle2.spray();
        this.floorSprayNozzle3.spray();
        this.floorSprayNozzle4.spray();
        this.floorSprayNozzle5.spray();
        this.floorSprayNozzle6.spray();
        this.floorSprayNozzle7.spray();
    }

    public void park() {
        this.cabin.getDoorLeft().pressButton();
        this.cabin.getDoorRight().pressButton();
        this.cabin.getControlPanel().turnRoofExtingushierKnob('A');
        this.cabin.getControlPanel().turnFrontExtingushierKnob('1');
    }

    public void setFirefighters(){
        driver = new Driver(this.cabin.getSeat01());
        this.cabin.getSeat01().setFirefighter(driver);
        operator = new Operator(this.cabin.getSeat02());
        this.cabin.getSeat02().setFirefighter(operator);
    }
    
    public void testDrive() {
        engineOn();
        driver = new Driver(this.cabin.getSeat01());
        this.cabin.getSeat01().setFirefighter(driver);
        operator = new Operator(this.cabin.getSeat02());
        this.cabin.getSeat02().setFirefighter(operator);
        turnOnFrontLight();
        this.warningLight.On();
        this.cabin.getControlPanel().turnRoofExtingushierKnob('A');
        this.cabin.getControlPanel().turnFrontExtingushierKnob('1');
    }
    
    public void operationDrive() {
        engineOn();
        driver = new Driver(this.cabin.getSeat01());
        this.cabin.getSeat01().setFirefighter(driver);
        operator = new Operator(this.cabin.getSeat02());
        this.cabin.getSeat02().setFirefighter(operator);
        turnOnRoofLight();
        turnOnFrontLight();
        this.warningLight.On();
        turnOnBlueLight();
        this.cabin.getControlPanel().turnRoofExtingushierKnob('A');
        this.cabin.getControlPanel().turnFrontExtingushierKnob('1');
    }
    
    public void tankVehicle() {
        engineOn();
        turnOnRoofLight();
        turnOnFrontLight();
        driver = new Driver(cabin.getSeat01());
        operator = new Operator(cabin.getSeat02());
        this.cabin.getSeat01().setFirefighter(driver);
        this.cabin.getSeat02().setFirefighter(operator);
        this.warningLight.On();
        turnOnBlueLight();
        turnOnSideLights();
    }

    public void airplaneOnFirePrepare(){
        engineOn();
        driver = new Driver(cabin.getSeat01());
        cabin.getSeat01().setFirefighter(driver);
        operator = new Operator(cabin.getSeat02());
        cabin.getSeat02().setFirefighter(operator);
        if(!cabin.getDoorRight().isOpen()){
            cabin.getInnerRight().push();
        }
        if(!cabin.getDoorLeft().isOpen()){
            cabin.getInnerLeft().push();
        }
        turnOnRoofLight();
        turnOnFrontLight();
        warningLight.On();
        turnOnBlueLight();
        turnOnSideLights();
    }

    public Driver getDriver(){
        return driver;
    }

    public Operator getOperator(){
        return operator;
    }

    public void fireInEnginePrepare(){
        engineOn();
        driver = new Driver(cabin.getSeat01());
        cabin.getSeat01().setFirefighter(driver);
        operator = new Operator(cabin.getSeat02());
        cabin.getSeat02().setFirefighter(operator);
        if(!cabin.getDoorRight().isOpen()){
            cabin.getInnerRight().push();
        }
        if(!cabin.getDoorLeft().isOpen()){
            cabin.getInnerLeft().push();
        }
        turnOnRoofLight();
        turnOnFrontLight();
        warningLight.On();
        turnOnBlueLight();
        turnOnSideLights();
    }

    public void usageControlPanelPrepare(){
        operator = new Operator(cabin.getSeat02());
        cabin.getSeat02().setFirefighter(operator);
    }

    public void loadClazzFromJavaArchive() {
        try {
            URL[] urls = {new File(Configuration.instance.subFolderPathOfJarArchive).toURI().toURL()};
            URLClassLoader urlClassLoader = new URLClassLoader(urls, FLF.class.getClassLoader());
            clazz = Class.forName(Configuration.instance.nameOfClass, true, urlClassLoader);
//            System.out.println("class    | " + clazz + " - " + clazz.hashCode());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void provideInstanceOfClass() {
        try {
            instance = clazz.getMethod("getInstance").invoke(null);
//            System.out.println("instance | " + instance.toString() + " - " + instance.hashCode());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void executeMethodDirectlyWithoutPort(String method1) {

        try {
            Method method = clazz.getDeclaredMethod(method1);
            String version = (String) method.invoke(instance);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void setTank(String method1, Tank tank) {

        try {
            Method method = clazz.getDeclaredMethod(method1, Tank.class);
            String version = (String) method.invoke(instance, tank);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println();
    }
}
