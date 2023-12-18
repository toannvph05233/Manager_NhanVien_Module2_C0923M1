import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoTest {
    Demo demo = new Demo();

    @Test
    void sum2vs3() {
        int result = 5;
        Assert.assertEquals(result,demo.sum(2,3));
    }

    @Test
    void sum0vsMaxInt() {
        int result = Integer.MAX_VALUE + 1;
        System.out.println(result);
        Assert.assertEquals(result,demo.sum(Integer.MAX_VALUE,1));
    }
}