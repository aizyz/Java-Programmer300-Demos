public class StudentDemo {
    public String name;
    private int age;
    private String school;
    public StudentDemo(String name, int age){
        this.setName(name);
        this.setAge(age);
    }
    public  String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
    public String toString(){
        return "学生姓名："+this.name+"学生年龄："+this.age;
    }
}
