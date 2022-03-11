package Chip;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.util.Arrays;

public class DES implements ICipher{

    public DES(){}

    public String encrypt(String input){
        try{

            SecretKey key = KeyGenerator.getInstance("DES").generateKey();

            Cipher desCipher;

            desCipher = Cipher.getInstance("DES");

            desCipher.init(Cipher.ENCRYPT_MODE, key);

            byte[] text = input.getBytes();

            byte[] secretIdentifier = desCipher.doFinal(text);

            return Arrays.toString(secretIdentifier);

        }catch(Exception e){
            return e.toString();
        }
    }
}
