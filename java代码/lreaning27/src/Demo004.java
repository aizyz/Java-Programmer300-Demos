import com.sun.org.apache.xml.internal.resolver.readers.ExtendedXMLCatalogReader;

import java.util.Scanner;

public class Demo004 {
    public static void main(String[] args) {
        System.out.println("请输入整数：");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        try{
            int i = Integer.parseInt(input);
            String result = Integer.toBinaryString(i);
            System.out.println("对应二进制为：");
            System.out.println(result);
        }catch(Exception e){
            System.out.println("请按要求输入: ");
        }
    }

}
