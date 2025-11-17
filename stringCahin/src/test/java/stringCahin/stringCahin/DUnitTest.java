package stringCahin.stringCahin;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DUnitTest {

    @Test
    public void testDWithStub() {
        // סטאב עבור E
        EStub stub = new EStub();

        // יוצרים את D עם הסטאב
        D d = new D(stub);

        // D מוסיפה "L" ל־"HEL" → "HELL"
        // והסטאב מוסיף "X" → "HELLX"
        String result = d.process("HEL");

        assertEquals("HELLX", result);
    }
}
