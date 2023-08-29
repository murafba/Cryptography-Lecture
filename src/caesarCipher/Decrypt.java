package caesarCipher;

/**
 * CREATING CLASSIC CRYPTOGRAPHY SOURCE CODE:
 * CAESAR CIPHER WITH KEY = 256 (ASCII CHARACTER)
 * KEY SHIFT = n_number
 * DECRYPTING FROM ASCII CIPHERTEXT
 */

public class Decrypt {
    private char[] cipherChar;
    private int[] cipherCharIntValue;
    private String cipherText;
    private String plainText;
    private int cipherKey;

    // CONSTRUCTOR
    public Decrypt(String cipherText, int cipherKey) {
        this.cipherText = cipherText;
        this.cipherKey = cipherKey;
    }

    // FIRST PROCESS: GET CHARACTER FROM CIPHERTEXT
    public void cipherTextToCipherChar() {

        this.cipherChar = new char[this.cipherText.length()];

        for (int i = 0; i < this.cipherChar.length; i++) {
            this.cipherChar[i] = this.cipherText.charAt(i);
            //System.out.println(charCharacter[i]);
        }

    }

    // SECOND PROCESS: CONVERT CHAR TO ASCII INTEGER VALUE
    private void cipherCharToIntValue(){

        this.cipherCharIntValue = new int[this.cipherChar.length];

        for (int i = 0; i < this.cipherCharIntValue.length; i++) {
            this.cipherCharIntValue[i] = this.cipherChar[i];
        }

    }

    // THIRD PROCESS: DECRYPTING
    public void decrypt(){

        cipherTextToCipherChar();
        cipherCharToIntValue();

        int[] plainCharIntValue = new int[this.cipherCharIntValue.length];
        char[] charPlainCharacter = new char[this.cipherCharIntValue.length];

        for (int i = 0; i < charPlainCharacter.length; i++) {

            if (this.cipherCharIntValue[i] == 32) {
                plainCharIntValue[i] = 32;
            } else {
                if (this.cipherCharIntValue[i] < 0) {
                    plainCharIntValue[i] = 256 + (this.cipherCharIntValue[i] - this.cipherKey);
                }
                else {
                    plainCharIntValue[i] = (this.cipherCharIntValue[i] - this.cipherKey) % 256;
                }
            }

        }

        for (int j = 0; j < plainCharIntValue.length; j++) {
            charPlainCharacter[j] = (char) (plainCharIntValue[j]);
        }

        this.plainText = String.valueOf(charPlainCharacter);

    }

    // SETTER AND GETTER
    public String getPlainText() {
        return this.plainText;
    }

    public String getCipherText() {
        return cipherText;
    }

    public int getCipherKey() {
        return cipherKey;
    }

    public void setCipherText(String cipherText) {
        this.cipherText = cipherText;
    }

    public void setCipherKey(int cipherKey) {
        this.cipherKey = cipherKey;
    }
}
