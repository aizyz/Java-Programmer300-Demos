import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
class Person{
        String name;
        int age;
        public void tell(){
            System.out.println("姓名:"+name+",年龄:"+age);
        }

    public void info() {
    }
}
public class Demo018{
    public static void main(String[] args){
        Person per=new Person();
        per.name="张珊";
        per.age=-19;
        per.tell();
        }
}