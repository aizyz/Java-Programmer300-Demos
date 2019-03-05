import org.omg.CORBA.PERSIST_STORE;

class Person8{
    String name;
    int age;
    static String city = "纽约";
    public Person8(String name,int age){
        this.name=name;
        this.age=age;

    }
    public void info(){
        System.out.println("姓名："+this.name+",年龄："+this.age+",城市"+city);
    }

}

public class Demo026 {
    public static void main(String[] args) {
        Person8 p1 = new Person8("张翰",23);
        Person8 p2 = new Person8("马力",22);
        Person8 p3 = new Person8("金科",19);
        p1.info();
        p2.info();
        p3.info();
        p2.city="遂宁";
        p1.info();
        p2.info();
        p3.info();

    }

}
