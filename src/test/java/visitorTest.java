import FLF.FLF;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class visitorTest {

    FLF flf = new FLF.Builder().build();

    @Test
    public void visitorTest(){
        Assertions.assertNotNull(flf.getCentralUnit().getVisitor());

        Assertions.assertTrue(flf.getCentralUnit().getVisitorFinished());
    }
}
