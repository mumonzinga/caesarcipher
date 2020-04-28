import org.junit.*;

import javax.crypto.Cipher;
import static junit.framework.TestCase.assertEquals;


import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class CaesarCipherTest {
    @Test
    public void newCaesarCipher_encryptRight_getEncodedRightText_Z() {
        CaesarCipher testCipher = new CaesarCipher("Z", "B", "A", 1, 1);
        assertEquals("Z", testCipher.encryptRight("Z", 1));
    }

    @Test
    public void newCaesarCipher_encryptLeft_getEncodedLeftText_I() {
        CaesarCipher testCipher = new CaesarCipher("C", "I", "F", 3, 3);
        assertEquals("I", testCipher.encryptLeft("I", 3));
    }
    @Test
    public void newCaesarCipher_getEncodedLeftText_I() {
        CaesarCipher testCipher = new CaesarCipher("C", "I", "F", 3, 3);
        assertEquals("I", testCipher.getEncodedLeftText());
    }
    @Test
    public void newCaesarCipher_getEncodedRightText_C() {
        CaesarCipher testCipher = new CaesarCipher("C", "I", "F", 3, 3);
        assertEquals("C", testCipher.getEncodedRightText());
    }
    @Test
    public void newCaesarCipher_decrypt_C() {
        CaesarCipher testCipher = new CaesarCipher("C", "I", "F", 3, 3);
        assertEquals("F", testCipher.getDecodedText());
    }
    @Test
    public void newCaesarCipher_getDecodedText_F() {
        CaesarCipher testCipher = new CaesarCipher("C", "I", "F", 3, 3);
        assertEquals("F", testCipher.getDecodedText());
    }
    @Test
    public void newCaesarCipher_getLatchKey_3() {
        CaesarCipher testCipher = new CaesarCipher("X", "D", "A", 3, 3);
        assertEquals(3, testCipher.getLatchKey());
    }

    @Test
    public void newCaesarCipher_getApprovedKey_4() {
        CaesarCipher testCipher = new CaesarCipher("X", "D", "A", 3, 3);
        assertEquals(3, testCipher.getApprovedKey());
    }

    @Test
    public void newCaesarCipher_getEncodedLeftText_testSentenceEncryption_QEBNRFZHYOLTKCLUGRJMPLSBOQEBIXWVALD() {
        CaesarCipher testCipher = new CaesarCipher("WKHTXLFNEURZQIRAMXPSVRYHUWKHODCBGRJ", "QEBNRFZHYOLTKCLUGRJMPLSBOQEBIXWVALD", "THEQUICKBROWNFOXJUMPSOVERTHELAZYDOG", 3, 3);
        assertEquals("QEBNRFZHYOLTKCLUGRJMPLSBOQEBIXWVALD", testCipher.getEncodedLeftText());
        
    }
    @Test
    public void newCaesarCipher_getDecodedText_testSentenceEncryption_THEQUICKBROWNFOXJUMPSOVERTHELAZYDOG() {
        CaesarCipher testCipher = new CaesarCipher("WKHTXLFNEURZQIRAMXPSVRYHUWKHODCBGRJ", "QEBNRFZHYOLTKCLUGRJMPLSBOQEBIXWVALD", "THEQUICKBROWNFOXJUMPSOVERTHELAZYDOG", 3, 3);
        assertEquals("THEQUICKBROWNFOXJUMPSOVERTHELAZYDOG", testCipher.getDecodedText());
    }


    @Test
    public void newCaesarCipher_encryptRight_testOtherCharacterEncryption_bcd25() {
        CaesarCipher testCipher = new CaesarCipher("zab25","bcd25", "abc25",1,1);
        assertEquals("zab25", testCipher.getEncodedRightText());
    }

}