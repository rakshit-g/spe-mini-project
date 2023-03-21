import org.example.Main;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class MainTest {
    Main obj = new Main();
    @Test
    public void factorialTruePositive(){
        assertEquals("calculating factorial",120,obj.factorial(5));
        assertEquals("calculating factorial",24,obj.factorial(4));
        assertEquals("power for Correct Output", 5, obj.power(5, 1));
        assertEquals("power for Correct Output", 16, obj.power(4, 2));
        assertEquals("natural log for Correct Output", 1.6094379124341003, obj.naturalLog(5));
        assertEquals("natural log for Correct Output", 1.3862943611198906, obj.naturalLog(4));
        assertEquals("square root for Correct Output", 5, obj.squareRoot(25));
        assertEquals("square root for Correct Output", 4, obj.squareRoot(16));
    }

}
