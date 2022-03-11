import Actors.Operator;
import FLF.FLF;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class usageControlPanel {
    private final FLF flf = new FLF.Builder().build();

    @Test
    public void checkFunctionControlPanel(){
        flf.usageControlPanelPrepare();

        Assertions.assertFalse(flf.getCabin().getControlPanel().getMotorButton().getState());//Motor off
        Assertions.assertFalse(flf.getCabin().getControlPanel().getWarninglightButton().getState());//Warninglight off
        Assertions.assertFalse(flf.getCabin().getControlPanel().getBluelightsButton().getState());//Bluelight off
        Assertions.assertFalse(flf.getCabin().getControlPanel().getHeadlightsButton().getState());//Frontlights off
        Assertions.assertFalse(flf.getCabin().getControlPanel().getRooflightsButton().getState());//Rooflights off
        Assertions.assertFalse(flf.getCabin().getControlPanel().getSidelightsButton().getState());//Sidelights on

        flf.getOperator().pressMotorButton();

        Assertions.assertTrue(flf.getCabin().getControlPanel().getMotorButton().getState());//Motor on

        flf.getOperator().pressWarninglightButton();

        Assertions.assertTrue(flf.getCabin().getControlPanel().getWarninglightButton().getState());//Warninglight on

        flf.getOperator().pressBluelightButton();

        Assertions.assertTrue(flf.getCabin().getControlPanel().getBluelightsButton().getState());//Bluelight on

        flf.getOperator().pressHeadlightsButton();

        Assertions.assertTrue(flf.getCabin().getControlPanel().getHeadlightsButton().getState());//Frontlights on

        flf.getOperator().pressRooflightsButton();

        Assertions.assertTrue(flf.getCabin().getControlPanel().getRooflightsButton().getState());//Rooflights on

        flf.getOperator().pressSidelightsButton();

        Assertions.assertTrue(flf.getCabin().getControlPanel().getSidelightsButton().getState());//Sidelights on

        flf.getOperator().pressMotorButton();
        flf.getOperator().pressWarninglightButton();
        flf.getOperator().pressBluelightButton();
        flf.getOperator().pressHeadlightsButton();
        flf.getOperator().pressRooflightsButton();
        flf.getOperator().pressSidelightsButton();

        Assertions.assertFalse(flf.getCabin().getControlPanel().getMotorButton().getState());//Motor off
        Assertions.assertFalse(flf.getCabin().getControlPanel().getWarninglightButton().getState());//Warninglight off
        Assertions.assertFalse(flf.getCabin().getControlPanel().getBluelightsButton().getState());//Bluelight off
        Assertions.assertFalse(flf.getCabin().getControlPanel().getHeadlightsButton().getState());//Frontlights off
        Assertions.assertFalse(flf.getCabin().getControlPanel().getRooflightsButton().getState());//Rooflights off
        Assertions.assertFalse(flf.getCabin().getControlPanel().getSidelightsButton().getState());//Sidelights on
    }
}
