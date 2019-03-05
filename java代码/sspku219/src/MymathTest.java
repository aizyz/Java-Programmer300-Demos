
import junit.framework.TestCase;
import org.junit.Test;

public class MymathTest {
        @Test
        public void testAdd() {
            TestCase.assertEquals(Mymath.add(10, 20), 30);
        }
        @Test
        public void testSub() {
            TestCase.assertEquals(Mymath.sub(20, 10), 10);
        }
        @Test
        public void testMul() {
            TestCase.assertEquals(Mymath.mul(20, 10), 200);
        }
        @Test
        public void testDiv() {
            TestCase.assertEquals(Mymath.div(20, 10),2 );
        }
    }

