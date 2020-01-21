package Testing;

import org.junit.Assert;
import org.junit.Test;


public class calcTest {

    @Test
    public void sumTest ()
    {
      Calc test;
        test = new Calc();
        int s = test.Sum(1,2);
        Assert.assertEquals(3, s);

        int d = test.Dec(8, 5);
        Assert.assertEquals(3, d);

        int m = test.Mult(8, 5);
        Assert.assertEquals(40, m);

        float q = test.Quot(10, 4);
        Assert.assertEquals(2.5, q, 1);
    }
}
