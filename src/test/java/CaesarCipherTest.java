import org.junit.*;

import javax.crypto.Cipher;
import static junit.framework.TestCase.assertEquals;


import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class CaesarCipherTest {
    @Test
    public void newCaesarCipher_getEncodedRightText_B() {
        CaeserCipher testCipher = new CaeserCipher("B", "Z", "A", 1);
        assertEquals("B", testCipher.getEncodedRightText());
    }

    @Test
    public void newCaesarCipher_getEncodedLeftText_Z() {
        CaeserCipher testCipher = new CaeserCipher("D", "Z", "B", 2);
        assertEquals("Z", testCipher.getEncodedLeftText());
    }

    @Test
    public void newCaesarCipher_getLatchKey_3() {
        CaeserCipher testCipher = new CaeserCipher("D", "X", "A", 3);
        assertEquals(3, testCipher.getLatchKey());
    }
}