import Cabin.Joystick;
import Cabin.JoystickFrontExtinguisher;
import FLF.FLF;

public class Application {

    public static void main(String... args){

        FLF flf = new FLF.Builder().build();

        flf.getCentralUnit().speedUp();
        flf.getCentralUnit().drive();
        flf.getCentralUnit().speedUp();
        flf.getCentralUnit().drive();
        flf.getCentralUnit().brake();
        flf.getCentralUnit().drive();
        flf.getCentralUnit().turn(30);
        flf.getCentralUnit().drive();
        flf.getCentralUnit().turn(0);
        flf.getCentralUnit().drive();
        flf.getCentralUnit().turn(-30);
        flf.getCentralUnit().drive();
        //Parken s01
    }

}
