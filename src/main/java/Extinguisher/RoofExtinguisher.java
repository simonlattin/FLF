package Extinguisher;

import Config.Configuration;
import Controls.IFunctionVisitor;
import FLF.FLF;

import java.io.File;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

public class RoofExtinguisher {

    private final int maxCapacity;
    private double extendLength;
    private final int maxExtendLength;
    private int outputAmount;
    private Object mixingUnit;
    private final Segment segment1;
    private final Segment segment2;
    private int mixingRatio;
    private final int maxRange;
    private String extinguishingAgent;
    private Class clazz;
    private boolean isExtended;

    public RoofExtinguisher() {
        this.maxCapacity = 10000;
        this.extendLength = 0;
        this.maxExtendLength = 17;
        this.segment1 = new Segment(0,true,false);
        this.segment2 = new Segment(17,false,true);
        this.maxRange = 90;
        this.mixingRatio = 0;
    }

    public void setOutputAmount(int outputAmount) {
        this.outputAmount = outputAmount;
    }

    public void setExtendLength(double extendLength) {
        this.extendLength = extendLength;
    }

    public void extendFirstSegment(){
        this.segment1.setAngle(90);
        this.segment1.extend();
    }

    public void extendSecondSegment(){
        this.segment2.extend();
    }

    public void retractFirstSegment(){
        this.segment1.setAngle(0);
        this.segment1.retract();
    }

    public void retractSecondSegment(){
        this.segment1.retract();
    }

    public void setMixingRatio(int ratio){
        try {
            Method method = clazz.getDeclaredMethod("setMixingRatio", int.class);
            String version = (String) method.invoke(mixingUnit, ratio);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.mixingRatio = ratio;
    }

    public int getMixingRatio() {
        return mixingRatio;
    }

    public int getOutputAmount() {
        return outputAmount;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public double getExtendLength() {
        return extendLength;
    }

    public int getMaxExtendLength() {
        return maxExtendLength;
    }

    public Segment getSegment1() {
        return segment1;
    }

    public Segment getSegment2() {
        return segment2;
    }

    public int getMaxRange() {
        return maxRange;
    }

    public String getExtinguishingAgent() {
        return extinguishingAgent;
    }

    public void extiguish(){
        try {
            Method method = clazz.getDeclaredMethod("mix", int.class);
            String version = (String) method.invoke(mixingUnit, outputAmount);
            Method method2 = clazz.getDeclaredMethod("getExtinguishingAgent");
            this.extinguishingAgent = (String) method2.invoke(mixingUnit);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setMixingUnit(Object mixingUnit) {
        this.mixingUnit = mixingUnit;
    }

    public boolean isExtended() {
        if (this.segment1.isExtended() || this.segment2.isExtended()){
            return true;
        } else {
            return false;
        }
    }

    public boolean acceptVisitor(IFunctionVisitor visitor){
        return testFunctionality();
    }

    public boolean testFunctionality(){
        int i = getMixingRatio();
        int j = getOutputAmount();
        setMixingRatio(3);
        setOutputAmount(1000);
        if(getMixingRatio() == 3 && getOutputAmount() == 1000){
            setMixingRatio(i);
            setOutputAmount(j);
            return true;
        }
        setMixingRatio(i);
        setOutputAmount(j);
        return false;
    }

    public void setClazz(Class clazz){
        this.clazz = clazz;
    }

//    public void loadClazzFromJavaArchive() {
//        try {
//            URL[] urls = {new File(Configuration.instance.subFolderPathOfJarArchive).toURI().toURL()};
//            URLClassLoader urlClassLoader = new URLClassLoader(urls, FLF.class.getClassLoader());
//            clazz = Class.forName(Configuration.instance.nameOfClass, true, urlClassLoader);
////            System.out.println("class    | " + clazz + " - " + clazz.hashCode());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
