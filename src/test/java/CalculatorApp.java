import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorApp {

    @Test
    public void shouldAddTwoNumbers() {
        int result = new Calculator().getAdditionResult(10, 20);
        Assert.assertEquals(30, result);

    }

    @Test
    public void shouldSubtractTwoNumbers() {

        int result = new Calculator().getSubtractionResult(50, 30);
        Assert.assertEquals(20, result);
    }


    @Test
    public void shouldMultiplyTwoNumbers() {
        int result = new Calculator().getMultiplicationResult(10, 10);
        Assert.assertEquals(100, result);
    }

    @Test
    public void shouldDivideTwoNumbers() {
        int result = new Calculator().getDivisionResult(30, 10);
        Assert.assertEquals(3, result);
    }

}
