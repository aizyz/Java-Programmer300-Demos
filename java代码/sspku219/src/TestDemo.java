
import java.util.Arrays;
public class TestDemo {
        public static void main(String[] args) throws Exception {
            Person per[] = new Person[] { new Person("张三", 20),
                    new Person("李四", 19), new Person("王五", 21) };
            Arrays.sort(per) ;	// 排序
            System.out.println(Arrays.toString(per));
        }
    }

