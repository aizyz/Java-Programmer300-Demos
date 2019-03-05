import java.sql.SQLOutput;

public class Demo001{
    public static void main(String[] args) {
        {
            int x = 40;
            System.out.println("普通代码块--->" + x);
        }
        int x = 250;
        System.out.println("代码块之外--->" + x);
    }

}
