package io.buildwell.acceptance;

import io.buildwell.foundation.Calculator;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CalculatorAcceptanceTest {
    private Calculator calc = new Calculator();

    @Test
    public void shouldAddNegativeNumbers() {
        int actual = calc.add(-1, 200);
        assertEquals(199, actual);
    }
}
