package com.example.Proyecto4;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;

public class Encriptacion {

    static private final String UNICODE_FORMAT = "UTF-8";
    static SecretKey myKey = generateKey("AES"); // generamos llave
    static Cipher chipher;

    public Encriptacion(){
        try {
            chipher = Cipher.getInstance("AES");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        }
    }

    public static SecretKey generateKey(String encryptionType){
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance(encryptionType);
            SecretKey myKey = keyGenerator.generateKey();
            return myKey;

        }catch (Exception r){
            return null;
        }
    }


    public  byte[] encriptar (String dataToEncrypt){
        try{
            byte[] text = dataToEncrypt.getBytes(UNICODE_FORMAT);
            chipher.init(Cipher.ENCRYPT_MODE, myKey);
            byte[] textEncrypted = chipher.doFinal(text);

            return textEncrypted;

        }catch (Exception m){
            return null;
        }
    }

    public  String desencriptar (String datoEncriptado) {
        try {
            byte[] dataToDecrypt = encriptar(datoEncriptado);

            chipher.init(Cipher.DECRYPT_MODE, myKey);
            byte[] textDecrypted = chipher.doFinal(dataToDecrypt);
            String result = new String(textDecrypted);

            return result;

        } catch (Exception n) {

            return null;
        }
    }
}
