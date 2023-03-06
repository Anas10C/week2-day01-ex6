import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class IPv4ValidationTest {

    @Test
    void IPv4ShouldNotContainLessThanFourFields() {
        IPv4Validation validate = new IPv4Validation();
        assertEquals(validate.validateIPv4("0.0.0"), false);
    }
    @Test
    void IPv4ShouldNotEndWithZero() {
        IPv4Validation validate = new IPv4Validation();
        assertEquals(validate.validateIPv4("0.0.0.0"), false);
    }

    @Test
    void IPv4ShouldNotEndWith255() {
        IPv4Validation validate = new IPv4Validation();
        assertEquals(validate.validateIPv4("192.168.1.255"), false);
    }

    @Test
    void IPv4ShouldNotContainAlphaChars() {
        IPv4Validation validate = new IPv4Validation();
        assertEquals(validate.validateIPv4("192.b.8.7"), false);
    }
    @Test
    void IPv4IsValid() {
        IPv4Validation validate = new IPv4Validation();
        assertEquals(validate.validateIPv4("192.168.1.2"), true);
    }

    @Test
    void IPv4FieldsShouldNotBeLargerThan255() {
        IPv4Validation validate = new IPv4Validation();
        assertEquals(validate.validateIPv4("192.300.500.800"), false);
    }

}