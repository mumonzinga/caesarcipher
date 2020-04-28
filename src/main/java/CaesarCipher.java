import static java.lang.System.*;
import static java.lang.System.exit;




public class CaesarCipher {
    private String encodedRightText;
    private String encodedLeftText;
    private String decodedText;
    private int latchKey;
    private int approvedKey;
    private String cipherRightText;


    public CaesarCipher(String encryptedRightText, String encryptedLeftText, String decryptedText, int shiftKey, int chosenKey) {
        this.encodedRightText = encryptedRightText;
        this.encodedLeftText = encryptedLeftText;
        this.decodedText = decryptedText;
        this.latchKey = shiftKey;
        this.approvedKey = chosenKey;
    }

    public String getEncodedRightText() {
        return encodedRightText;
    }

    public String getEncodedLeftText() {
        return encodedLeftText;
    }

    public String getDecodedText() {
        return decodedText;
    }

    public int getLatchKey() {
        return latchKey;
    }

    public int getApprovedKey() {
        return approvedKey;
    }


    public static final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String encryptRight(String encodedRightText, int latchKey) {
        encodedRightText = encodedRightText.toUpperCase();
        char[] cr = encodedRightText.toCharArray();
        String encodedRightScript = "";
        for (int i = 0; i < encodedRightText.length(); i++) {
            int charRightKey = alphabet.indexOf(encodedRightText.charAt(i));
            int indexRight = (latchKey-latchKey %26 + charRightKey);
            char CipherRightch = alphabet.charAt(indexRight);
            encodedRightScript = String.valueOf(CipherRightch);
        }
        return encodedRightScript;
    }

    public static String encryptLeft(String encodedLeftText, int latchKey) {
        encodedLeftText = encodedLeftText.toUpperCase();
        char[] cl = encodedLeftText.toCharArray();
        String encodedLeftScript = "";

        for (int i = 0; i <encodedLeftText.length(); i++) {

            int charLeftKey = alphabet.indexOf(encodedLeftText.charAt(i));
            int indexLeft = (charLeftKey+latchKey) % 26 - latchKey ;
            char CipherLeftch = alphabet.charAt((indexLeft));
            encodedLeftScript = String.valueOf(CipherLeftch);

        }
        return encodedLeftScript;
    }

    public static String decrypt(String decodedText, int approvedKey) {
        decodedText = decodedText.toUpperCase();
        char[] cd = decodedText.toCharArray();
        String decodeRight = "";
        String decodeLeft = "";
        String error = "";
        String decodedScript = "";

        if (approvedKey < 1 || approvedKey > 26) {
            error = "key must be between 1 to 25";
        } else if (decodeRight == "right") {
            for (int i = 0; i < decodedText.length(); i++) {
                int charDerKey = alphabet.indexOf(decodedText.charAt(i));
                int chosenKey =  (charDerKey +approvedKey) %26-approvedKey;
                if (chosenKey < 0) {
                    chosenKey = alphabet.length() - chosenKey;
                }
                char cipherDecodech = alphabet.charAt(chosenKey);
                decodedScript = String.valueOf(cipherDecodech);
            }
            return decodedScript;
        } else if (decodeLeft == "left") {
            for (int i = 0; i < decodedText.length(); i++) {
                int charDelKey = alphabet.indexOf(decodedText.charAt(i));
                int chosenke = (charDelKey-approvedKey) % 26 ;
                if (chosenke < 0) {
                    chosenke = alphabet.length() +chosenke;
                }
                char cipherDecodecl = alphabet.charAt(chosenke);
                decodedScript = String.valueOf(cipherDecodecl);
            }
        }
        return decodedScript;
    }
}



