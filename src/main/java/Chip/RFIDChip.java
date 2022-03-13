package Chip;

import Config.Configuration;

//Da keiner aus unserem Team im ersten Teil die Komplexaufgabe mit dem RFID-Chip hatte, sind nicht alle Funktionen vorhanden.
//Es wurde lediglich das Strategy-Pattern mit den verschiedenen Algorithmen angewandt.

public class RFIDChip{

    //!!! Normalerweise wäre Cipher final und könnte nur in der config geändert werden.
    //!!! Die Methode setCipher() wurde nur für den Test hinzugefügt!
    private ICipher cipher;

    public RFIDChip(){
        cipher = Configuration.instance.cipher;
    }

    public String encrypt(String input){
        try{
            return cipher.encrypt(input);
        }catch(Exception e){
            return e.toString();
        }
    }

    public void setCipher(ICipher cipher) {
        this.cipher = cipher;
    }
}