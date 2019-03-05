class  Outer2{
    public static String info = "HELLO WORLD!~";
    class Inner{
        public void print(){
                System.out.println(info);
        }
    }
}
public class Demo006 {
    public static void main(String[] args) {
        Outer2 out = new Outer2();
        Outer2.Inner in = out.new Inner();
        in.print();
    }
}
