public class Demo001 {
    public static void main(String[] args) {
        boolean flag = true;
        if(flag)
        {
            System.out.println("hello sn!");
        }
        String str = "\'Hello World !!!\'\n\tHello MLDN\\" ;	// 定义字符串
        System.out.println(str) ;
        //double x = 10.2 ;
        //int y = 20 ;
        //String result = "加法计算结果：" + ( x + y ) ;
        //System.out.println(result) ;
        int x = 10 ;
        int y = 20 ;
        int result = ++ x * y -- / y * 10 + ++x * -- y ;
        System.out.println(result) ;



    }
}
