import FLF.FLF;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

public class ComponentTest {

    private final FLF flf = new FLF.Builder().build();
    private int mixingRatio;

    @Test
    public void TestMixingUnit(){

        Assertions.assertNotNull(flf.getMixingUnit());

        flf.setFirefighters();
        flf.getDriver().pressLeftJoystickButton();
        flf.getDriver().pressRightJoystickButton();
        getMixingRatioFromMixingUnit();
        Assertions.assertEquals(3,mixingRatio);
    }

    public void getMixingRatioFromMixingUnit(){
        Class clazz = flf.getClazz();
        try {
            Method method = clazz.getDeclaredMethod("getMixingRatio");
            mixingRatio = (int) method.invoke(flf.getMixingUnit());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
