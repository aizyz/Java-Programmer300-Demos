public class Demo002 {
    //直接利用StringBuffer类的构造方法，public StringBuffer(String str)
        public static void main(String[] args) throws Exception {
            String str = "Hello World ." ;
            StringBuffer buf = new StringBuffer(str);
            System.out.println(buf);
        }
    }

