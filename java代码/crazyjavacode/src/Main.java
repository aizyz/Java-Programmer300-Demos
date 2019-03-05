interface MyInterface{

    void lMethod(String str);
}
public class Main {

    public static void test(MyInterface myInterface){
        myInterface.lMethod("Hello World!");//设置参数内容
    }

    public static void main(String[] args) {
        //首先在()中定义此表达式里面需要接收变量s，后面的单行语句中就可以使用该变量了
        test((s)->System.out.println(s));
    }
}
