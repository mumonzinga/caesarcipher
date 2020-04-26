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
    public void newCaesarCipher_getEncodedLeftText_Z() {
        CaeserCipher testCipher = new CaeserCipher("D", "Z", "B", 2, 2);
        assertEquals("Z", testCipher.getEncodedLeftText());
    }

    @Test
    public void newCaesarCipher_getLatchKey_3() {
        CaeserCipher testCipher = new CaeserCipher("D", "X", "A", 3, 3);
        assertEquals(3, testCipher.getLatchKey());
    }

    @Test
    public void newCaesarCipher_getApprovedKey_4() {
        CaeserCipher testCipher = new CaeserCipher("D", "X", "A", 3, 3);
        assertEquals(3, testCipher.getApprovedKey());
    }

}