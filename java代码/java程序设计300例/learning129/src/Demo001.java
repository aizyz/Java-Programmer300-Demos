import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.omg.CORBA.INTERNAL;

import javax.naming.InsufficientResourcesException;

public class Demo001 {
    public static void main(String[] args) {
        int a = 99999999;//数值越界
        System.out.println(a);
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println(min);
        System.out.println(max);//数据类型int的溢出
        System.out.println(max+1);
        System.out.println(max-1);
        System.out.println(max+2);
        System.out.println((long)max+2);

        char ch1 = 98 ;
        char ch2 = 'b';
        System.out.println(ch1 == ch2);
        char ch3 = '\"';
        char ch4 = '\\';
        System.out.println(ch3);
        System.out.println(ch4);
        String str1 = "dsda";
        System.out.println(str1+(int)ch1+ch2+max);
        int a1 = 12;
        int a2 = 23;
        System.out.println("a1+a2=" +a1+a2);//连接
        System.out.println("a1+a2="+(a1+a2));//求和





    }
}
