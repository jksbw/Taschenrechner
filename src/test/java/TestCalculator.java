import org.junit.Test;
import static org.junit.Assert.*;

public class TestCalculator {

    Calculator test = new Calculator();

    @Test
    public void testSummeZweiPositive() {
        assertTrue(test.addition(2, 3) == 5);
    }

    @Test
    public void testSummeZweiNegative(){
        assertTrue(test.addition(-2, -4) == -6);
    }

    @Test
    public void testSummeZweiNull(){
        assertTrue(test.addition(3, -3) == 0);
    }

}