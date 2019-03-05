public class Demo029 {
    public static void main(String[] args) throws Exception {
        String str = "134122AS4124214141232" ;
        if (str.matches("\\d+")) {
            System.out.println("是由数字所组成！");
        } else {
            System.out.println("不是由数字所组成！");
        }
    }
}

