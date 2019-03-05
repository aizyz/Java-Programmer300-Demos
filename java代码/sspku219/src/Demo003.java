public class Demo003 {
    //利用StringBuffer类的append()方法
    public static void main(String[] args) throws Exception {
        String str = "Hello World." ;
        StringBuffer buf = new StringBuffer();
        buf.append(str) ;
        System.out.println(buf);
    }
}

