public class TestDemo {
    public static void main(String args[]) {
        Person per = null ;	// 声明对象
        per = new Person() ;	// 实例化对象
        per.name = "张三" ;
        per.age = 30 ;
        per.tell() ;
    }

}
