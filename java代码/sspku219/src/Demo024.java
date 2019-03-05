import java.text.SimpleDateFormat;
import java.util.Date;
public class Demo024 {
        public static void main(String[] args) throws Exception {
            String str = "1998-09-18 10:10:10.100" ;
            String regex = "\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}\\.\\d{3}" ;
            if (str.matches(regex)) {	// 符合于验证要求
                Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS")
                        .parse(str);
                System.out.println(date);
            } else {
                System.out.println("字符串不是日期！");
            }
        }
    }


