package dz.univ.calculatrice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class subtractoperationTest {

    @Test
    void shouldSubtractTwoNumbers() {
        final subtractoperation operation = new subtractoperation();
        assertEquals(2.0, operation.execute(5.0, 3.0), 0.0001);
    }

    @Test
    void shouldReturnSubtractionSymbol() {
        final subtractoperation operation = new subtractoperation();
        assertEquals("-", operation.getSymbol());
    }

    @Test
    void shouldSubtractNegativeNumbers() {
        final subtractoperation operation = new subtractoperation();
        assertEquals(-2.0, operation.execute(-5.0, -3.0), 0.0001);
    }

    @Test
    void shouldSubtractDecimalNumbers() {
        final subtractoperation operation = new subtractoperation();
        assertEquals(1.9, operation.execute(5.2, 3.3), 0.0001);
    }
}
