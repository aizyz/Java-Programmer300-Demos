import java.io.File;
public class Demo042 {
    public static void main(String[] args) throws Exception {
        File file = new File("H:\\demo.txt"); // 文件的路径
            if (file.exists()) { // 文件存在
                File newFile = new File("H:" + File.separator + "世界末日的eclipse.zip");
                file.renameTo(newFile);
            } else { // 文件不存在
                file.createNewFile(); // 创建新文件
            }
        }
    }

