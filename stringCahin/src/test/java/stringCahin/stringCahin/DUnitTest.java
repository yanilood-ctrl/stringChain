package stringCahin.stringCahin;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DUnitTest {

    @Test
    public void testDWithStub() {
        EStub stub = new EStub();

        D d = new D(stub);

        String result = d.process("HEL");

        assertEquals("HELLX", result);
    }
}
