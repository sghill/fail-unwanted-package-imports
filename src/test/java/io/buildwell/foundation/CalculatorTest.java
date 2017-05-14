package io.buildwell.foundation;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calc = new Calculator();

    @Test
    public void shouldAddIntegers() {
        int actual = calc.add(3, 5);
        assertEquals(8, actual);
    }

}
