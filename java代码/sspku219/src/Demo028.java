public class Demo028 {
    public static void main(String[] args) throws Exception {
        String str = "mldnqa@163.net";
        String regex = "[a-zA-Z_][a-zA-Z_0-9\\.]*@[a-zA-Z_0-9\\.]+\\.(com|cn|net)";
        if (str.matches(regex)) { // 符合于验证要求
            System.out.println("True，Email输入合法。");
        } else {
            System.out.println("False，Email输入非法！");
        }
    }
}

