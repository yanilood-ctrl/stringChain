package stringCahin.stringCahin;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class EUnitTest {

    @Test
    public void testEProcessAddsO() {
        E e = new E();

        String result = e.process("HELL");

        // E מוסיפה "O" → "HELLO"
        assertEquals("HELLO", result);
    }
}
