import java.util.Scanner;

public class Demo008 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("请输入登录用户名：");
        String username = scan.nextLine();
        System.out.println("请输入登录密码");
        String password = scan.nextLine();
        if(!username.equals("admin")) {
            System.out.println("用户名非法！");
        }else if(!password.equals("123456")){
            System.out.println("登录密码错误！");
        }else
        {
            System.out.println("恭喜你通过验证！！！");
        }

    }
}
