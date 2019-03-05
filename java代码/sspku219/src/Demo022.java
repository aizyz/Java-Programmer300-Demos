public class Demo022 {
    public static void main(String[] args) throws Exception {
        String str = "aaab" ;
        String regex = "a+b" ;
        System.out.println(str.matches(regex));
    }
}

