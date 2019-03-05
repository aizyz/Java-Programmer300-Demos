public class Demo005 {
    //字符串反转操作，public StringBuffer reverse()
        public static void main(String[] args) throws Exception {
            StringBuffer buf = new StringBuffer();
            buf.append("Hello World.") ;
            //System.out.println(buf.reverse());
            System.out.println(buf.replace(6, 12, "MLDN"));
        }
    }
