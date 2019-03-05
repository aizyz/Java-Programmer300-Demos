import java.io.File;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Demo043 {
    public static void main(String[] args) throws Exception {
        File file = new File("H:" + File.separator + "eclipse.zip"); // 文件的路径
        if (file.exists()) { // 文件存在
            System.out.println("文件名称：" + file.getName());
            System.out.println(file.getName()
                    + (file.isDirectory() ? "是一个目录。" : "不是一个目录。"));
            System.out.println(file.getName()
                    + (file.isFile() ? "是一个文件。" : "不是一个文件。"));
            System.out.println(file.getName()
                    + (file.isHidden() ? "是一个隐藏文件。" : "不是一个隐藏文件。"));
            System.out.println("最后一次更改日期："
                    + new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒")
                    .format(new Date(file.lastModified())));
            System.out.println("文件大小："
                    + new BigDecimal(file.length() / (double) 1024 / 1024)
                    .divide(new BigDecimal(1), 2,
                            BigDecimal.ROUND_HALF_UP).doubleValue() + "M。");
        }
    }
}

