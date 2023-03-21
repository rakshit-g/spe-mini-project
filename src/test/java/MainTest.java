import org.example.Main;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class MainTest {
    Main obj = new Main();
    @Test
    public void factorialTruePositive(){
        assertEquals("calculating factorial",120,obj.factorial(5), 0.001);
        assertEquals("calculating factorial",24,obj.factorial(4), 0.001);
        assertEquals("power for Correct Output", 5, obj.power(5, 1),0.001);
        assertEquals("power for Correct Output", 16, obj.power(4, 2), 0.001);
        assertEquals("natural log for 1Correct Output", 1.6094379124341003, obj.log(5), 0.001);
        assertEquals("natural log for Correct Output", 1.3862943611198906, obj.log(4),0.001);
        assertEquals("square root for Correct Output", 5, obj.SquareRoot(25),0.001);
        assertEquals("square root for Correct Output", 4, obj.SquareRoot(16),0.001);
    }

}
