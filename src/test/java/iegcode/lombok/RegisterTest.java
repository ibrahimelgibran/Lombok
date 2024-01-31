package iegcode.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RegisterTest {

    @Test
    void testWith() {

        var register1 = new Register("Gibran", "rahasia");
        var register2 = register1.withUsername("Elgibran");

        Assertions.assertEquals(register1.getPassword(), register2.getPassword());
        Assertions.assertNotEquals(register1.getUsername(), register2.getUsername());
    }
}
