import java.io.File;

import static java.io.File.separator;

public class Demo044 {

        public static void main(String[] args) throws Exception {
            File file = new File("H:" + separator + "hellodemo"
                    + separator + "my" + separator + "test"
                    + separator + "demo.txt"); // 文件的路径
            if (!file.getParentFile().exists()) { // 父路径不存在
                file.getParentFile().mkdirs(); // 创建目录
            }
            if (file.exists()) { // 文件存在
                file.delete(); // 删除文件
            } else { // 文件不存在
                file.createNewFile(); // 创建新文件
            }
        }
    }

