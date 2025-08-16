import org.cristian.calculator.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calc = new Calculator();

    //Check method sum
    @Test
    void testSum () {
        assertEquals(5, calc.sum(3, 2));
    }

    //Check method subtract
    @Test
    void testSubtract () {
        assertEquals(4, calc.subtract(7, 3));
    }

    //Check method multiply
    @Test
    void testMultiply () {
        assertEquals(12, calc.multiply(6, 2));
    }

    //Check method divide
    @Test
    void testDivide () {
        assertEquals(3, calc.divide(12, 4));
    }

    //Check method divide throw exception and correct message
    @Test
    void testDivideByZero () {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> calc.divide(12, 0));
        assertEquals("It is not possible to divide by zero", ex.getMessage());
    }
}
