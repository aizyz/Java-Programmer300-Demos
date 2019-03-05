

public class JavaTest {
    public static void main(String args[]) {
        String str = "192.168.1.1" ;
        String result []= str.split("\\.") ;
        for (int x = 0 ; x < result.length ; x ++) {
            System.out.println(result[x]) ;
        }
    }
}
