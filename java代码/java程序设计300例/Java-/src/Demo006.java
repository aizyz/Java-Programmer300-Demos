import java.util.Scanner;

public class Demo006 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个英文字符串作为密码：");
        String passwd = scan.nextLine();
        char[] array = passwd.toCharArray();
        for (int i = 0; i < array.length; i++) {
            array[i] = (char) (array[i] ^ 20000);

        }
        System.out.println("加密的结果如下：");
        System.out.println(new String(array));

        for (int i = 0; i < array.length; i++) {
            array[i] = (char) (array[i] ^ 20000);

        } System.out.println("解密的结果如下：");
        System.out.println(new String(array));
    }
}
