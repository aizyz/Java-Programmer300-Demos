public class Demo022 {
    public static void main(String[] args) {
        Student stu = new Student("d1012346002","yuwu",78.5f,87.5f,92f);
        System.out.println(stu.getStuno());
        System.out.println(stu.getSname());
        System.out.println(stu.getMath());
        System.out.println(stu.getComputer());
        System.out.println(stu.getEnglish());
        System.out.println(stu.sum());
        System.out.println(stu.avg());
        System.out.println(stu.max());
        System.out.println(stu.min());
    }

}
class Student{
    private String stuno;
    private String sname;
    private float math;
    private float english;
    private float computer;
    public Student(){}
    public Student(String stuno,String sname,Float math,Float english,Float computer){
        this.setStuno(stuno);
        this.setSname(sname);
        this.setMath(math);
        this.setEnglish(english);
        this.setComputer(computer);

    }

    public String getStuno() {
        return stuno;
    }

    public String getSname() {
        return sname;
    }

    public float getMath() {
        return math;
    }

    public float getEnglish() {
        return english;
    }

    public float getComputer() {
        return computer;
    }

    public void setStuno(String s) {
        stuno = s;
    }

    public void setSname(String n) {
       sname = n;
    }

    public void setMath(float m) {
        math = m;
    }

    public void setEnglish(float e) {
        english = e;
    }

    public void setComputer(float c) {
        computer = c;
    }
    public float sum(){
        return math+english+computer;

    }
    public float avg(){
        return this.sum()/3;
    }
    public float max(){
        float max=math;
        max=max>computer? max:computer;
        max=max>english? max:english;
        return max;
    }
    public float min(){
        float min=math;
        min=min<computer? min:computer;
        min=min<english? min:english;
        return min;
    }
}
