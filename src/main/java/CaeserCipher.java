public class CaeserCipher {
    private String encodedRightText;
    private String encodedLeftText;
    private String decodedText;
    private int latchKey;
    private int approvedKey;

    public CaeserCipher(String encryptedRightText, String encryptedLeftText, String decryptedText, int shiftKey, int chosenKey) {
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
        String cipherRightText = " ";



        for (int i = 0; i <encodedRightText.length() ; i++) {


            int charRightKey = alphabet.indexOf(encodedRightText.charAt(i));
            int indexRight = (charRightKey-latchKey) % 26 +latchKey;
            char CipherRightch = alphabet.charAt(indexRight);
            cipherRightText = String.valueOf(CipherRightch);

        }


        return cipherRightText;
    }

    public static String encryptLeft(String encodedLeftText, int latchKey) {
        encodedLeftText = encodedLeftText.toUpperCase();
        char[] cl = encodedLeftText.toCharArray();
        String cipherLeftText = "";

        for (int i = 0; i < encodedLeftText.length(); i++) {

            int charLeftKey = alphabet.indexOf(encodedLeftText.charAt(i));
            int indexLeft = (latchKey + charLeftKey) % 26;
            char CipherLeftch = alphabet.charAt((indexLeft));
            cipherLeftText = String.valueOf(CipherLeftch);

        }
        return cipherLeftText;
    }

    public static String Decrypt(String decodedText, int approvedKey) {
        decodedText = decodedText.toUpperCase();
        char[] cd = decodedText.toCharArray();
        String decodeRight = "";
        String decodeLeft = "";
        String error = "";
        String cipherDecode = "";

        if (approvedKey < 1 || approvedKey > 26) {
            error = "key must be between 1 to 25";
        } else if (decodeRight == "right") {
            for (int i = 0; i < cipherDecode.length(); i++) {
                int charDerKey = alphabet.indexOf(cipherDecode.charAt(i));
                int chosenKey = (charDerKey - approvedKey) % 26;
                if (chosenKey < 0) {
                    chosenKey = alphabet.length() + chosenKey;
                }
                char cipherDecodech = alphabet.charAt(chosenKey);
                cipherDecode = String.valueOf(cipherDecodech);
            }
            return cipherDecode;
        } else if (decodeLeft == "left") {
            for (int i = 0; i < cipherDecode.length(); i--) {
                int charDelKey = alphabet.indexOf(cipherDecode.charAt(i));
                int chosenke = (charDelKey + approvedKey) % 26;
                if (chosenke > 0) {
                    chosenke = alphabet.length() - chosenke;
                }
                char cipherDecodecl = alphabet.charAt(chosenke);
                cipherDecode = String.valueOf(cipherDecodecl);

            }

        }
        return cipherDecode;
    }


}