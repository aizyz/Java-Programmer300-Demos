import com.sun.javafx.image.BytePixelSetter;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Demo004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要转换的字母: ");
        char c =  sc.next().charAt(0);
        if(c >= 'A'&& c <='Z'){
            c += 32;
            System.out.println("这里的大写"+(char)(c-32)+"被转换成了"+c);

    }else if
            (c >='a'&& c<='z'){
        c -= 32;
        System.out.println("这里的小写" + (char) (c + 32) + "被转换成了" + c);
    }else{
        System.out.println("不带这种格式的输入返回重新输入");

        }
    }
}
