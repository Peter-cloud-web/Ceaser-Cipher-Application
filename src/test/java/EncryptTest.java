import org.junit.Test;

import static org.junit.Assert.*;

public class EncryptTest {
    @Test
    public void Encrypting_shiftAlphabet_String() {
        Encrypt testEncryption = new Encrypt();
        String expectedOutput = "G";
        assertEquals(expectedOutput, testEncryption.encode("e", 2));
    }


}