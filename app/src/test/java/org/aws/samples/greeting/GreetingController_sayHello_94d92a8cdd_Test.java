package org.aws.samples.greeting;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class GreetingController_sayHello_94d92a8cdd_Test {

    @Autowired
    private GreetingController controller;

    @MockBean
    private ExternalService externalService; // Ensure that this class is available and imported

    @Test
    public void testSayHello_success() {
        String expected = "Hello";
        String actual = controller.sayHello();
        assertEquals(expected, actual, "Expected output does not match actual output");
    }

    @Test
    public void testSayHello_failure() {
        String expected = "Hi";
        String actual = controller.sayHello();
        assertNotEquals(expected, actual, "Expected output matches actual output");
    }
}
