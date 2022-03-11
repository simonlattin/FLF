package Chip;

import Config.Configuration;

//Da keiner aus unserem Team im ersten Teil die Komplexaufgabe mit dem RFID-Chip hatte, sind nicht alle Funktionen vorhanden.
//Es wurde lediglich das Strategy-Pattern mit den verschiedenen Algorithmen angewandt.

public class RFIDChip{

    private final ICipher cipher;

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

}