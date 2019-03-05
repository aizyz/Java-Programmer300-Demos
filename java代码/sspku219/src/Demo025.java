public class Demo025 {
    public static void main(String[] args) throws Exception {
        String str = "343234FDSF_";
        String regex = "\\w{6,15}";
        if (str.matches(regex)) { // 符合于验证要求
            System.out.println("用户名合法。");
        } else {
            System.out.println("用户名非法！");
        }
    }
}


