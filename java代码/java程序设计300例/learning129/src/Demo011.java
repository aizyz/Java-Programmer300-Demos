public class Demo011 {
    public static void main(String[] args) {
        System.out.println("1.调用fun()方法前");
        fun(10);
        System.out.println("2.调用fun()方法后");

    }

    public static void fun(int x){
        System.out.println("3.进入fun()方法");
        if (x==10) {
            return ;
        }
        System.out.println("4.正常·执行完fun()方法");


    }
}
