public class Demo037 {
    public static void main(String args[]) {
        System.out.println("两个整型相加：" + add1(10, 20));
        System.out.println("三个整型相加：" + add2(10, 20, 30));
        System.out.println("两个浮点型相加：" + add3(10.2, 20.3));
    }

    public static int add1(int x, int y) {

        return x + y;
    }
    public static int add2(int x,int y,int z) {
        return x + y + z ;
    }
    public static double add3(double x,double y) {
        return x + y ;
    }

}
