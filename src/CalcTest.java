import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcTest {
    @Test
    public void testSum(){
        Calc calc = new Calc();
        int actual = calc.sum(1, 100);
        Assertions.assertEquals(101, actual);
    }
    @Test
     public void testSub(){
        Calc calc = new Calc();
        int actual = calc.sub(10, 1);
        Assertions.assertEquals(9, actual);
     }
    @Test
    public void testDiv(){
        Calc calc = new Calc();
        int actual = calc.div(10, 2);
        Assertions.assertEquals(5, actual);
    }
    @Test
    public void testMult(){
        Calc calc = new Calc();
        int actual = calc.mult(10, 2);
        Assertions.assertEquals(20, actual);
    }


}
