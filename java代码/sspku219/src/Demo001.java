public class Demo001 {
    //使用StringBuffer操作，StringBuffer的内容可以改变
        public static void main(String[] args) throws Exception {
            StringBuffer buf = new StringBuffer();
            buf.append("Hello ").append("World."); // 连接内容
            System.out.println(buf);
            fun(buf);
            System.out.println(buf);
        }
        public static void fun(StringBuffer temp) {
            temp.append("\n").append("Hello MLDN");
        }
    }

