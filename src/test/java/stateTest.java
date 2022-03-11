import FLF.FLF;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class stateTest {

    FLF flf = new FLF.Builder().build();

    @Test
    public void stateTest(){

        flf.setFirefighters();

        Assertions.assertFalse(flf.getCabin().getControlPanel().getWarninglightButton().getState());
        Assertions.assertFalse(flf.getCabin().getControlPanel().getSidelightsButton().getState());
        Assertions.assertFalse(flf.getCabin().getControlPanel().getMotorButton().getState());
        Assertions.assertFalse(flf.getCabin().getControlPanel().getRooflightsButton().getState());

        flf.getOperator().pressWarninglightButton();

        Assertions.assertTrue(flf.getCabin().getControlPanel().getWarninglightButton().getState());

        flf.getOperator().pressWarninglightButton();

        Assertions.assertFalse(flf.getCabin().getControlPanel().getWarninglightButton().getState());

        flf.getOperator().pressMotorButton();
        flf.getOperator().pressRooflightsButton();
        flf.getOperator().pressSidelightsButton();

        Assertions.assertTrue(flf.getCabin().getControlPanel().getSidelightsButton().getState());
        Assertions.assertTrue(flf.getCabin().getControlPanel().getMotorButton().getState());
        Assertions.assertTrue(flf.getCabin().getControlPanel().getRooflightsButton().getState());

        flf.getOperator().pressMotorButton();
        flf.getOperator().pressRooflightsButton();
        flf.getOperator().pressSidelightsButton();

        Assertions.assertFalse(flf.getCabin().getControlPanel().getSidelightsButton().getState());
        Assertions.assertFalse(flf.getCabin().getControlPanel().getMotorButton().getState());
        Assertions.assertFalse(flf.getCabin().getControlPanel().getRooflightsButton().getState());
    }
}
