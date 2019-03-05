abstract class  Person{
    private String name;
    private int age;
    public Person(String name,int age){
        this.name =name;
        this.age =age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void say(){
        System.out.println(this.getContent());
    }
    public abstract String getContent();

    static class Student extends Person{
        private float score;
        private String verb;
        public  Student(String name,int age,float score,String verb){
            super(name,age);
            this.score=score;
            this.verb=verb;
        }
        public String getContent(){
            return "姓名:"+super.getName()+",年龄"+super.getAge()+",实习表现"+this.score+"\n"+"2019寄语："+this.verb;
        }
    }
}
public class Demo008 {//抽象类的创建
    public static void main(String[] args) {
        Person per1 = null;
        per1 = new Person.Student("张钰珠", 24, 100,"保重身体,猪事顺利,越努力越幸运！");
            per1.say();

    }
}
