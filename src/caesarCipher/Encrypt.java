package caesarCipher;

/**
 * CREATING CLASSIC CRYPTOGRAPHY SOURCE CODE:
 * CAESAR CIPHER WITH KEY = 256 (ASCII CHARACTER)
 * KEY SHIFT = n_number
 * ENCRYPTING FROM ASCII PLAINTEXT
 */

public class Encrypt {
    private String plainText;
    private String cipherText;
    private int cipherKey;
    private int[] plainCharIntValue;
    private char[] plainChar;


    // CONSTRUCTOR
    public Encrypt(){
        this.plainText = null;
        this.cipherText = null;
        this.cipherKey = 0;
    }
    public Encrypt(String plainText, int cipherKey){
        this.plainText = plainText;
        this.cipherKey = cipherKey;
    }


    // FIRST PROCESS: GET CHARACTER FROM PLAINTEXT
    private void plainTextToPlainChar(){

        this.plainChar = new char[this.plainText.length()];

        for (int i = 0; i < this.plainText.length(); i++) {
            this.plainChar[i] = this.plainText.charAt(i);
        }

    }

    // SECOND PROCESS: CONVERT CHAR TO ASCII INTEGER VALUE
    private void plainCharToIntValue(){

        this.plainCharIntValue = new int[this.plainChar.length];

        for (int i = 0; i < plainChar.length; i++) {
            this.plainCharIntValue[i] = this.plainChar[i];
        }

    }

    // THIRD PROCESS: ENCRYPTING
    public void encrypt(){

        plainTextToPlainChar();
        plainCharToIntValue();

        char[] charCipherCharacter = new char[this.plainCharIntValue.length];
        int[] cipherCharIntValue = new int[this.plainCharIntValue.length];

        for (int i = 0; i < charCipherCharacter.length; i++) {

            if (this.plainCharIntValue[i] == 32) {
                cipherCharIntValue[i] = 32;
            } else {
                cipherCharIntValue[i] = (this.plainCharIntValue[i] + this.cipherKey) % 256;
            }

        }

        for (int j = 0; j < cipherCharIntValue.length; j++) {
            charCipherCharacter[j] = (char) (cipherCharIntValue[j]);
        }

        this.cipherText = String.valueOf(charCipherCharacter);

    }


    // SETTER AND GETTER
    public void setPlainText(String plainText) {
        this.plainText = plainText;
    }

    public void setCipherKey(int cipherKey) {
        this.cipherKey = cipherKey;
    }

    public String getPlainText() {
        return this.plainText;
    }

    public String getCipherText() {
        return this.cipherText;
    }

    public int getCipherKey() {
        return cipherKey;
    }

}
