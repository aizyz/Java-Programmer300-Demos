import java.util.Date;
public class Demo009 {
    public static void main(String[] args) throws Exception {
        // Date date = new Date();
       // System.out.println(date); // Tue Dec 18 10:02:28 CST 2012
        //Thu Feb 07 20:29:16 CST 2019
       // long num = date.getTime() ;
       // System.out.println(num);
        Date date = new Date(System.currentTimeMillis());	// long --> Date
        System.out.println(date);


    }
}
