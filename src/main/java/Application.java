import Actors.Driver;
import Actors.Firefighter;
import Cabin.Joystick;
import Cabin.JoystickFrontExtinguisher;
import FLF.FLF;

public class Application {

    public static void main(String... args){

        FLF flf = new FLF.Builder().build();

        RFIDChip chip = new RFIDChip();
        System.out.println(chip.encrypt("Hallo"));
    }

}
