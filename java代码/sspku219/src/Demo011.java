import java.text.SimpleDateFormat;
import java.util.Date;
public class Demo011 {
    public static void main(String[] args) throws Exception {
        Date date = new Date(); // 当前日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        System.out.println(date);
        String str = sdf.format(date); // 将日期格式化为字符串
        System.out.println(str);
    }
}

