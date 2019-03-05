import javax.swing.*;

public class Demo009 {
    public static void main(String[] args) {
        String s1 = "wuyuaizyz";
        char[] c = s1.toCharArray();
        for(int i = 0;i<c.length;i++){
            System.out.print(c[i]);
        }
        System.out.println(c);
        String s2= new String(c);
        System.out.println(s2);
    }
}
