package dz.univ.calculatrice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AddOperationTest {

    @Test
    void shouldAddTwoNumbers() {
        final AddOperation operation = new AddOperation();
        assertEquals(8.0, operation.execute(5.0, 3.0), 0.0001);
    }

    @Test
    void shouldReturnAdditionSymbol() {
        final AddOperation operation = new AddOperation();
        assertEquals("+", operation.getSymbol());
    }

    @Test
    void shouldAddNegativeNumbers() {
        final AddOperation operation = new AddOperation();
        assertEquals(-8.0, operation.execute(-5.0, -3.0), 0.0001);
    }

    @Test
    void shouldAddDecimalNumbers() {
        final AddOperation operation = new AddOperation();
        assertEquals(8.5, operation.execute(5.2, 3.3), 0.0001);
    }
}
