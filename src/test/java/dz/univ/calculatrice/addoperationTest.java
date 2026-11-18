package dz.univ.calculatrice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class addoperationTest {

    @Test
    void shouldAddTwoNumbers() {
        final addoperation operation = new addoperation();
        assertEquals(8.0, operation.execute(5.0, 3.0), 0.0001);
    }

    @Test
    void shouldReturnAdditionSymbol() {
        final addoperation operation = new addoperation();
        assertEquals("+", operation.getSymbol());
    }

    @Test
    void shouldAddNegativeNumbers() {
        final addoperation operation = new addoperation();
        assertEquals(-8.0, operation.execute(-5.0, -3.0), 0.0001);
    }

    @Test
    void shouldAddDecimalNumbers() {
        final addoperation operation = new addoperation();
        assertEquals(8.5, operation.execute(5.2, 3.3), 0.0001);
    }
}
