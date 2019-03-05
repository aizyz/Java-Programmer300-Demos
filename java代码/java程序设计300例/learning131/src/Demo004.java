class Outer{
    private static String Info = "hello world!";
    static class Inner{
        public void print(){
            System.out.println(Info);
        }

    }
}

public class Demo004 {
    public static void main(String[] args) {
        new Outer.Inner().print();
    }
}
