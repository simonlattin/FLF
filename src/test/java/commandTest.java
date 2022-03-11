import Controls.ICommand;
import Controls.MotorOnCommand;
import FLF.FLF;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class commandTest {

    FLF flf = new FLF.Builder().build();
    ICommand oldCommand = null;

    @Test
    public void commandTest(){
        flf.setFirefighters();

        flf.getOperator().pressMotorButton();

        Assertions.assertNotNull(flf.getCentralUnit().getCommand());//Command is set
        Assertions.assertEquals(true,flf.getMotor01().isOn());//Command is executed
        Assertions.assertEquals(true,flf.getMotor02().isOn());//Command is executed
        oldCommand = flf.getCentralUnit().getCommand();

        flf.getOperator().pressHeadlightsButton();

        Assertions.assertNotEquals(oldCommand,flf.getCentralUnit().getCommand());//new Command is set
        Assertions.assertEquals(true,flf.getSpotlight01().isOn());//Command is executed
        Assertions.assertEquals(true,flf.getSpotlight02().isOn());//Command is executed
        Assertions.assertEquals(true,flf.getSpotlight03().isOn());//Command is executed
        Assertions.assertEquals(true,flf.getSpotlight04().isOn());//Command is executed
        Assertions.assertEquals(true,flf.getSpotlight05().isOn());//Command is executed
        Assertions.assertEquals(true,flf.getSpotlight06().isOn());//Command is executed
        oldCommand = flf.getCentralUnit().getCommand();

        flf.getOperator().pressWarninglightButton();

        Assertions.assertNotEquals(oldCommand,flf.getCentralUnit().getCommand());//new Command is set
        Assertions.assertEquals(true,flf.getWarningLight().isOn());//Command is executed
        oldCommand = flf.getCentralUnit().getCommand();

        flf.getOperator().pressMotorButton();

        Assertions.assertNotNull(flf.getCentralUnit().getCommand());//Command is set
        Assertions.assertEquals(false,flf.getMotor01().isOn());//Command is executed
        Assertions.assertEquals(false,flf.getMotor02().isOn());//Command is executed

    }
}
