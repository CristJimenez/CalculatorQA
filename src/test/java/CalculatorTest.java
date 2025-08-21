import org.cristian.calculator.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calc = new Calculator();

    //Check method sum
    @Test
    void testSum () {
        assertEquals(5, calc.sum("3", "2"));
    }

    //Check method sum throw exception and correct message
    @Test
    void testSumException () {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> calc.sum("2", "s"));
        assertEquals("It is not a valid number", ex.getMessage());
    }

    //Check method subtract
    @Test
    void testSubtract () {
        assertEquals(4, calc.subtract("7", "3"));
    }

    //Check method subtract throw exception and correct message
    @Test
    void testSubtractException () {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> calc.subtract("2", "r"));
        assertEquals("It is not a valid number", ex.getMessage());
    }

    //Check method multiply
    @Test
    void testMultiply () {
        assertEquals(12, calc.multiply("6", "2"));
    }

    //Check method multiply throw exception and correct message
    @Test
    void testMultiplyException () {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> calc.multiply("2", "m"));
        assertEquals("It is not a valid number", ex.getMessage());
    }

    //Check method divide
    @Test
    void testDivide () {
        assertEquals(3, calc.divide("12", "4"));
    }

    //Check method divide throw exception and correct message
    @Test
    void testDivideException () {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> calc.divide("2", "d"));
        assertEquals("It is not a valid number", ex.getMessage());
    }

    //Check method divide throw exception and correct message
    @Test
    void testDivideByZero () {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> calc.divide("12", "0"));
        assertEquals("It is not possible to divide by zero", ex.getMessage());
    }
}
