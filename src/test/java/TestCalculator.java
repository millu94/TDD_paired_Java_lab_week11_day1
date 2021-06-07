import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculator {

    Calculator calc;

    @Before
    public void before() {
        calc = new Calculator();
    }

    @Test
    public void canAdd() {
        assertEquals(4, calc.add(2, 2));
    }

    @Test
    public void canSubtract(){
        assertEquals(3, calc.subtract(10, 7));
    }

    @Test
    public void canMultiply(){
        assertEquals(9, calc.multiply(3, 3));
    }

    @Test
    public void canDivide(){
        assertEquals(5, calc.divide(20, 4), 0.0);
    }

}
