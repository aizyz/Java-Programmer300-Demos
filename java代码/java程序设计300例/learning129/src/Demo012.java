import java.sql.SQLOutput;

public class Demo012 {
    public static void main(String[] args) {
        System.out.println(sum(100));
        System.out.println(sum2(100));
    }



    public static int sum(int num) {
        if (num == 1) {
            return 1;

        } else {
            return num + sum(num - 1);

        }
    }

    public static int sum2(int i) {
        int sum2 = 0;
        for (int num2 = 0; num2 < 101; num2++)
            sum2 += num2;
        return sum2;

    }



}


