import Chip.DES;
import Chip.ICipher;
import Chip.RFIDChip;
import Chip.RSA;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StrategyTest {

    private final RFIDChip chip = new RFIDChip();

    @Test
    public void TestChip(){
        //cipher default = AES!
        Assertions.assertNotNull(chip.encrypt("Hallo Welt"));
        System.out.println(chip.encrypt("Hallo Welt"));

        ICipher cipher = new DES();
        chip.setCipher(cipher);
        Assertions.assertNotNull(chip.encrypt("Hallo Welt"));
        System.out.println(chip.encrypt("Hallo Welt"));

        cipher = new RSA();
        chip.setCipher(cipher);
        Assertions.assertNotNull(chip.encrypt("Hallo Welt"));
        System.out.println(chip.encrypt("Hallo Welt"));

    }
}
