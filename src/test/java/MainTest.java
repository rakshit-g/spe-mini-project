import org.example.Main;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class MainTest {
    Main obj = new Main();
    @Test
    public void factorialTruePositive(){
        assertEquals("calculating factorial",120,obj.factorial(5));
        assertEquals("calculating factorial",24,obj.factorial(4));
    }

}
