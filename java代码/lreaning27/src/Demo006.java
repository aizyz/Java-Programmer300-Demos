public class Demo006 {
    public static void main(String[] args)throws Exception {
        StringBuffer buf = new StringBuffer();
        buf.append("hello world");
        //System.out.println(buf.reverse());
        System.out.println(buf.replace(6, 12, "MLDN"));
    }
}
