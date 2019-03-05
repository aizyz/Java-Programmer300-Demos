import com.sun.org.apache.regexp.internal.RE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
public class Demo016 {
    public static void main(String[] args) throws IOException {
        String m= new String ("");
        int [] a = new int[8];
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入8个数（以一个空格隔开）：");
        m = stdin.readLine();
        Scanner scan = new Scanner(m);
        for (int i = 0;i<a.length;i++){
            a[i]=scan.nextInt();

        }
        Arrays.sort(a);
        System.out.println("8个数的升序排序为：");
        for(int i = 0;i<a.length;i++){
            System.out.print(a[i]+"<");
        }

    }
}
