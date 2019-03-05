public class Demo006 {
    //在指定位置上插入数据，public StringBuffer insert(int offset, 数据类型 变量)
    public static void main(String[] args) throws Exception {
        StringBuffer buf = new StringBuffer();
        buf.append("World .").insert(0, "Hello ") ;
        System.out.println(buf);
    }
}

