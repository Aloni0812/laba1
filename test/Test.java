import demo.parallel.Complex;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class Test {
    Complex data = new Complex(2, 1);

    @Test
    public void testTime() {
        Complex time = new Complex(1,1);
        time.times(data);
        Assertions.assertEquals(time.getRe(), 1);
        Assertions.assertEquals(time.getIm(), 3);
    }
}
