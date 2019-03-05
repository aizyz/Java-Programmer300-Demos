class Person6{
private String name;
private int age;
public Person6(){
    System.out.println("hai,我是无参构造方法！");

}
public Person6(String name,int age){
        this();
        this.name=name;
        this.age=age;
        }
public String getInfo(){
        return"姓名："+name+",年龄"+age;
        }
}


public class Demo025 {
    public static void main(String[] args) {
        Person6 per = new Person6("振拔",19);
        System.out.println(per.getInfo());
    }
}
