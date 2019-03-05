class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        return instance;
    }

    public void print() {
        System.out.println("hello world!");

    }
}
    public class Singleton2{
public static void main(String[]args){
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        s1.print();
        s2.print();
        }

    }


