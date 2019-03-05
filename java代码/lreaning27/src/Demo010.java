import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo010 {

        public static void main(String[] args) throws Exception {
            String str = "1980-09-19 12:12:12.122";
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
            Date date = sdf.parse(str); // 将字符串变为日期
            System.out.println(date);
        }
    }


