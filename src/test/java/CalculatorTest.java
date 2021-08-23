import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator (5, 5);
    }

    @Test
    public void canAdd(){
        assertEquals(10, calculator.add(), 0.1);
    }

    @Test
    public void canSubtract(){
        assertEquals(0, calculator.subtract(), 0.1);
    }
    @Test
    public void CanMultiply(){
        assertEquals(25, calculator.multiply(), 0.1);
    }

    @Test
    public void canDivide(){
        assertEquals(1, calculator.divide(), 0.1);
    }


}
