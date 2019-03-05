public class Demo007 {
    public static void main(String[] args) {
        if (args.length!=2){
            System.out.println("输入的参数不正确，系统退出！");
            System.out.println("格式：java LoginDemo01  用户 密码");
            System.exit(1);
        }

        String name = args[0];
        String password = args[1];
        if(name.equals("WUYU")&&password.equals("1234")){
            System.out.println("欢迎"+name+"大驾光临！！");

        }else{
            System.out.println("用户名或密码错误，你个垃圾！");
        }
    }

}
