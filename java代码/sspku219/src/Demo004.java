public class Demo004 {
    //将StringBuffer变为String，利用StringBuffer类的toString()方法完成
    public static void main(String[] args) throws Exception {
            StringBuffer buf = new StringBuffer();
            buf.append("Hello World.") ;
            String str = buf.toString() ;
            System.out.println(str);
        }
    }

