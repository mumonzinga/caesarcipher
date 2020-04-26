import org.junit.*;

import javax.crypto.Cipher;
import static junit.framework.TestCase.assertEquals;


import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class CaesarCipherTest {
    @Test
    public void newCaesarCipher_encryptRight_getEncodedRightText_Z() {
        CaeserCipher testCipher = new CaeserCipher("Z", "b", "a", 1, 1);
        assertEquals("Z", testCipher.encryptRight("Z", 1));
    }

    @Test
    public void newCaesarCipher_encryptLeft_getEncodedLeftText_I() {
        CaeserCipher testCipher = new CaeserCipher("C", "I", "F", 3, 3);
        assertEquals("I", testCipher.encryptLeft("I", 3));
    }

    @Test
    public void newCaesarCipher_getLatchKey_3() {
        CaeserCipher testCipher = new CaeserCipher("X", "D", "A", 3, 3);
        assertEquals(3, testCipher.getLatchKey());
    }

    @Test
    public void newCaesarCipher_getApprovedKey_4() {
        CaeserCipher testCipher = new CaeserCipher("X", "D", "A", 3, 3);
        assertEquals(3, testCipher.getApprovedKey());
    }

    @Test
    public void newCaesarCipher_encryptLeft_testSentenceEncryption_QEBNRFZHYOLTKCLUGRJMPLSBOQEBIXWVALD() {
        CaeserCipher testCipher = new CaeserCipher("WKHTXLFNEURZQIRAMXPSVRYHUWKHODCBGRJ", "QEBNRFZHYOLTKCLUGRJMPLSBOQEBIXWVALD", "THEQUICKBROWNFOXJUMPSOVERTHELAZYDOG", 3, 3);
        assertEquals("QEBNRFZHYOLTKCLUGRJMPLSBOQEBIXWVALD", testCipher.getEncodedLeftText());
        
    }

    @Test
    public void newCaesarCipher_encryptRight_testOtherCharacterEncryption_bcd25() {
        CaeserCipher testCipher = new CaeserCipher("zab25","bcd25", "abc25",1,1);
        assertEquals("zab25", testCipher.getEncodedRightText());
    }
    @Test
    public void newCaesarCipher_decrypt_testLetterCase_NbNb() {
        CaeserCipher testCipher = new CaeserCipher("LzLz", "NbNb", "MaMa", 1, 1 );
        assertEquals("MaMa", testCipher.decrypt("MaMa", 1));
    }
}