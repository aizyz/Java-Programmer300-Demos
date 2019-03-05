public class Demo023 {
    public static void main(String[] args) throws Exception {
        String str = "13" ;
        String regex = "\\d+" ;
        if (str.matches(regex)) {// 符合于验证要求
            int data = Integer.parseInt(str) ;	// 字符串变为int型数据
            System.out.println(data * data);
        } else {
            System.out.println("字符串不是数字所组成！");
        }
    }
}

