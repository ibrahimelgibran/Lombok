package iegcode.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberTest {

    @Test
    void testConstructorNull() {

        Assertions.assertThrows(NullPointerException.class, () -> {
           var member = new Member("Gibran", "Gibran");
        });
    }

    @Test
    void testSetterNull() {

        Assertions.assertThrows(NullPointerException.class, () -> {
            var member = new Member("Gibran", "Gibran");
            member.setName(null);
        });
    }

    @Test
    void testMethodNull() {

        Assertions.assertThrows(NullPointerException.class, () -> {
            var member = new Member("Gibran", "Gibran");
            member.sayHello(null);
        });
    }
}
