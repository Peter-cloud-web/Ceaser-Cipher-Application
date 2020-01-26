import org.junit.Test;

import static org.junit.Assert.*;

public class DecryptTest {
    @Test
    public void Decrypting_shiftAlphabet_String() {
        Decrypt testDecryption = new Decrypt();
        String expectedOutput = "b";
        assertEquals(expectedOutput, testDecryption.decode("d", 2));
    }
    @Test
    public void Decrypting_shiftWord_String() {


        assertEquals(expectedOutput, testDecryption.decode("peter", 3));

    }

}