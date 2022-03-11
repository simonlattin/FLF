package Chip;

import javax.crypto.Cipher;
import java.nio.charset.StandardCharsets;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Arrays;

public class RSA implements ICipher{

    private KeyPairGenerator generator;
    private KeyPair pair;
    private PrivateKey privateKey;
    private PublicKey publicKey;

    public RSA(){
        try {
            generator = KeyPairGenerator.getInstance("RSA");
            generator.initialize(2048);
            pair = generator.generateKeyPair();
            privateKey = pair.getPrivate();
            publicKey = pair.getPublic();
        } catch (Exception e){
            System.out.println(e);
        }
    }

    public String encrypt(String input){
        try {
            Cipher cipher = Cipher.getInstance("RSA");
            cipher.init(Cipher.ENCRYPT_MODE, publicKey);
            byte[] inputByte = input.getBytes(StandardCharsets.UTF_8);
            byte[] encypted = cipher.doFinal(inputByte);
            return Arrays.toString(encypted);
        } catch (Exception e){
            return e.toString();
        }
    }
}
