import Controls.*;
import FLF.FLF;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.google.common.eventbus.Subscribe;

public class EventBusTest {

    private final FLF flf = new FLF.Builder().build();

    @Test
    public void TestEventBus(){
        Assertions.assertFalse(flf.getMotor01().isOn());
        flf.getCabin().getControlPanel().pressButton(1);//MotorButton
        Assertions.assertTrue(flf.getMotor01().isOn());
        Assertions.assertEquals(1,flf.getMotor01().getEventsHandled());

        Assertions.assertFalse(flf.getWarningLight().isOn());
        flf.getCabin().getControlPanel().pressButton(2);//WarningLightButton
        Assertions.assertTrue(flf.getWarningLight().isOn());
        Assertions.assertEquals(1,flf.getWarningLight().getEventsHandled());

        Assertions.assertFalse(flf.getBlueLight01().isOn());
        flf.getCabin().getControlPanel().pressButton(3);//BlueLightButton
        Assertions.assertTrue(flf.getBlueLight01().isOn());
        Assertions.assertEquals(1,flf.getBlueLight01().getEventsHandled());

        Assertions.assertFalse(flf.getSpotlight01().isOn());
        flf.getCabin().getControlPanel().pressButton(4);//FrontLightButton
        Assertions.assertTrue(flf.getSpotlight01().isOn());
        Assertions.assertEquals(1,flf.getSpotlight01().getEventsHandled());

        Assertions.assertFalse(flf.getSpotlight07().isOn());
        flf.getCabin().getControlPanel().pressButton(5);//FrontLightButton
        Assertions.assertTrue(flf.getSpotlight07().isOn());
        Assertions.assertEquals(1,flf.getSpotlight07().getEventsHandled());

        Assertions.assertFalse(flf.getLeftSide1().isOn());
        flf.getCabin().getControlPanel().pressButton(6);//SideLightButton
        Assertions.assertTrue(flf.getLeftSide1().isOn());
        Assertions.assertEquals(1,flf.getLeftSide1().getEventsHandled());
    }
}
