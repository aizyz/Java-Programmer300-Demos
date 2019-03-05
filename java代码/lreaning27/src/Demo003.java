import java.util.Scanner;

public class Demo003 {
    public static void main(String[] args) {
        System.out.println("请输入整数:");
        Scanner sc=new Scanner(System.in);
        String input = sc.nextLine();//读取输入字符
        try{
            int i = Integer.parseInt(input);//string转int
            String result = Integer.toBinaryString(i);//十进制转二进制
            System.out.println("对应二进制数为：");
            System.out.println(result);
        }catch (Exception e) {//对非法输入做出处理
            System.err.println("请按照要求输入~");
        }

    }
}

