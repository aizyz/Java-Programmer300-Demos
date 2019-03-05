import java.util.Scanner;
public class Demo048 {
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        String second =sc.nextLine();
        System.out.println("输入秒数为:"+second+"秒");
        int i = Integer.parseInt(second);
        int minute;
        minute = i / 60;
        int resecond = i % 60;
        int hours = i / 3600;
        System.out.println("输入的秒数"+second+"秒"+"相等于"+minute+"分钟"+resecond+"秒");
        System.out.println("输入的秒数"+second+"秒"+"相等于"+hours+"小时");
    }
}
