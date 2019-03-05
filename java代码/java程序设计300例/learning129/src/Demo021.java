class Person4{
    private String name;
    private int age;
    public Person4(String name,int age){
        this.setName(name);
        this.setAge(age);
    }
    public void tell () {
        System.out.println("姓名:" + this.getName() + ",年龄:" + this.getAge());
    }

    public String getName () {
        return name;
    }

    public void setName (String name){
        this.name = name;
    }

    public int getAge () {
        return age;
    }

    public void setAge ( int a){
        if (a >= 0 && a < 110) {
            age = a;
        }
    }
}

public class Demo021 {
    public static void main(String[] args) {
         new Person3("周琪" ,22).tell();
    }
}
