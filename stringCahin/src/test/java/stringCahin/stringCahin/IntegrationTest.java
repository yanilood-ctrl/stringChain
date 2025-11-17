package stringCahin.stringCahin;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IntegrationTest {

    // אינטגרציה: B → C → DStub
    @Test
    public void testIntegration_B_C_DStub() {
        DStub dStub = new DStub();
        C c = new C(dStub);
        B b = new B(c);

        String result = b.process("H");

        // H + "E" → "HE"
        // C: "HE" + "L" → "HEL"
        // DStub: "HEL" + "X" → "HELX"
        assertEquals("HELX", result);
    }

    // אינטגרציה: C → D → EStub
    @Test
    public void testIntegration_C_D_EStub() {
        EStub eStub = new EStub();
        D d = new D(eStub);
        C c = new C(d);

        String result = c.process("HE");

        // C: "HE" + "L" → "HEL"
        // D: "HEL" + "L" → "HELL"
        // EStub: "HELL" + "X" → "HELLX"
        assertEquals("HELLX", result);
    }
}
