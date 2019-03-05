public class StringDemo {
    public static void main(String args[]) {
        String str = "hello" ;
        System.out.println(str.isEmpty()) ;	// false
        System.out.println("".isEmpty()) ;	// true
        System.out.println(str.length()) ;
        System.out.println(" Hello ".length()) ;	// 空格也计算
    }
}

