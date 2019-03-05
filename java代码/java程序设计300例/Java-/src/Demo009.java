import java.util.Scanner;

public class Demo009 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("请输入你的QQ等级: ");
        int i = scan.nextInt();
        if(i==1){
            System.out.println("你的活跃天数为5天!");

        }else if(i==8)
            System.out.println("你的活跃天数为32天!");
        else if (i==12)
            System.out.println("你的活跃天数为96天!");
        else if (i==16)
            System.out.println("你的活跃天数为192天!");
        else if(i==32)
            System.out.println("你的活跃天数为320天!");


    }
}
