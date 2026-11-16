package dz.univ.calculatrice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SubtractOperationTest {

    @Test
    void shouldSubtractTwoNumbers() {
        final SubtractOperation operation = new SubtractOperation();
        assertEquals(2.0, operation.execute(5.0, 3.0), 0.0001);
    }

    @Test
    void shouldReturnSubtractionSymbol() {
        final SubtractOperation operation = new SubtractOperation();
        assertEquals("-", operation.getSymbol());
    }

    @Test
    void shouldSubtractNegativeNumbers() {
        final SubtractOperation operation = new SubtractOperation();
        assertEquals(-2.0, operation.execute(-5.0, -3.0), 0.0001);
    }

    @Test
    void shouldSubtractDecimalNumbers() {
        final SubtractOperation operation = new SubtractOperation();
        assertEquals(1.9, operation.execute(5.2, 3.3), 0.0001);
    }
}
