import java.math.BigInteger;
public class Demo015 {
    public static void main(String[] args) throws Exception {
        BigInteger bigA = new BigInteger("234809234801");
        BigInteger bigB = new BigInteger("8939834789");
        System.out.println("加法结果：" + bigA.add(bigB));
        System.out.println("减法结果：" + bigA.subtract(bigB));
        System.out.println("乘法结果：" + bigA.multiply(bigB));
        System.out.println("除法结果：" + bigA.divide(bigB));
        BigInteger result[] = bigA.divideAndRemainder(bigB);
        System.out.println("商：" + result[0] + "，余数：" + result[1]);
        System.out.println("---------------");

    }
}


