public class Demo034 {
    public static void main(String args[]) {
        fun(10) ;
        fun(30) ;
    }
    public static void fun(int num) {
        if (num == 10) {
            return ;	// 结束方法调用
        }
        System.out.println("数值：" + num) ;
    }

}
