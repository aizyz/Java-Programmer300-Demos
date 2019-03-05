import java.util.Random;

public class Demo013 {
    //产生10个0~100之间的正整数
        public static void main(String[] args) throws Exception {
            Random rand = new Random();
            for (int x = 0; x < 10; x++) {
                System.out.println(rand.nextInt(101));
            }
        }
    }

