package Extinguisher;

import Config.Configuration;
import Controls.IFunctionVisitor;
import FLF.FLF;

import java.io.File;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

public class FrontExtinguisher {

    private final int maxCapacity;
    private int turnAngle;
    private int outputAmount;
    private Object mixingUnit;
    private int mixingRatio;
    private String extinguishingAgent;
    private boolean isActive;
    private Class clazz;

    public FrontExtinguisher(){
        this.maxCapacity = 3500;
        this.turnAngle = 0;
        this.mixingRatio = 0;
        this.isActive = false;
    }

    public void setTurnAngle(int turnAngle) {
        this.turnAngle = turnAngle;
    }

    public void setOutputAmount(int outputAmount) {
        this.outputAmount = outputAmount;
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

    public void activate() {
        isActive = true;
    }

    public void deactivate() {
        isActive = false;
    }

    public int getTurnAngle() {
        return turnAngle;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int getOutputAmount() {
        return outputAmount;
    }

    public int getMixingRatio() {
        return mixingRatio;
    }

    public String getExtinguishingAgent() {
        return extinguishingAgent;
    }

    public boolean isActive() {
        return isActive;
    }

    public void extiguish(){
        try {
            Method method = clazz.getDeclaredMethod("mix", int.class);
            String version = (String) method.invoke(mixingUnit, outputAmount);
            Method method2 = clazz.getDeclaredMethod("getExtinguishingAgent");
            this.extinguishingAgent = (String) method.invoke(mixingUnit, outputAmount);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setMixingUnit(Object mixingUnit) {
        this.mixingUnit = mixingUnit;
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
