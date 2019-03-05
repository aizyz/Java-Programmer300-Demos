import java.io.File;
public class Demo045 {
    public static void main(String[] args) throws Exception {
        File file = new File("H:" + File.separator + "javademo"); // 文件的路径
        if (file.exists()) { // 文件目录存在
            File result[] = file.listFiles(); // 列出目录中的全部内容
            for (int x = 0; x < result.length; x++) {
                System.out.println(result[x]);
            }
        }
    }
}

