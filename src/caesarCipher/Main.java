package caesarCipher;

public class Main {
    public static void main(String[] args) {
        Encrypt encrypting = new Encrypt("hello world", 3);

        System.out.println("============= ENCRYPTING =============");
        System.out.println("Plaintext: [" + encrypting.getPlainText() + "]");
        encrypting.encrypt();

        System.out.println("Ciphertext: [" + encrypting.getCipherText() + "]\n");


        Decrypt decrypting = new Decrypt(encrypting.getCipherText(), encrypting.getCipherKey());

        System.out.println("============= DECRYPTING =============");
        decrypting.decrypt();

        System.out.println("Ciphertext: [" + decrypting.getCipherText() + "]");
        System.out.println("Plaintext: [" + decrypting.getPlainText() + "]");
        System.out.println();

//        encrypting.setCipherKey(1);
//        encrypting.setPlainText("I Love You");
//        encrypting.encrypt();
//        System.out.println(encrypting.getCipherText());
//        System.out.println(encrypting.getCipherKey());
//
//        decrypting.setCipherText("J Mpwf Zpv");
//        decrypting.setCipherKey(1);
//        decrypting.decrypt();
//        System.out.println(decrypting.getCipherKey());
//        System.out.println(decrypting.getPlainText());


    }
}
