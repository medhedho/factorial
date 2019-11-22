package devops.factorial;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    private Factorial fact;

    @BeforeEach
    void setUp() {
        fact=new Factorial();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void factorial0() {
        assertEquals(1, fact.factorial(0));
    }

    @Test
    void factorial1() {
        assertEquals(1, fact.factorial(1));
    }

    @Test
    void factorial2() {
        assertEquals(2, fact.factorial(2));
    }

    @Test
    void factorial3() {
        assertEquals(6, fact.factorial(3));
    }

    @Test
    void factorial4() {
        assertEquals(24, fact.factorial(4));
    }
}