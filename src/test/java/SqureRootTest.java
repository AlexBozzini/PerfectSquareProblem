
import org.junit.Assert;
import org.junit.Test;

public class SqureRootTest {

    @Test
    public void test1(){
        int input = 1;
        Assert.assertTrue(SquareRoot.checkPerfectSquare(input));
    }

    @Test
    public void test2(){
        int input = 10000;
        Assert.assertTrue(SquareRoot.checkPerfectSquare(input));
    }

    @Test
    public void test3(){
        int input = 625;
        Assert.assertTrue(SquareRoot.checkPerfectSquare(input));
    }

    @Test
    public void test4(){
        int input = 9801;
        Assert.assertTrue(SquareRoot.checkPerfectSquare(input));
    }

    @Test
    public void test5(){
        int input = 16;
        Assert.assertTrue(SquareRoot.checkPerfectSquare(input));
    }

    @Test
    public void test6(){
        int input = 2;
        Assert.assertFalse(SquareRoot.checkPerfectSquare(input));
    }

    @Test
    public void test7(){
        int input = 3;
        Assert.assertFalse(SquareRoot.checkPerfectSquare(input));
    }

    @Test
    public void test8(){
        int input = 7;
        Assert.assertFalse(SquareRoot.checkPerfectSquare(input));
    }

    @Test
    public void test9(){
        int input = 11;
        Assert.assertFalse(SquareRoot.checkPerfectSquare(input));
    }

    @Test
    public void test10(){
        int input = 13;
        Assert.assertFalse(SquareRoot.checkPerfectSquare(input));
    }
}
