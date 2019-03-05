import java.util.Arrays;
import java.util.Random;

public class TestMergeSort {

    public static void main(String[] args) throws InterruptedException{

        long time1 = System.currentTimeMillis();

        int length = 1000000;
        int[] array = new int[length];

        Random random = new Random();
        for(int i = 0; i < length; i++){
            int x = random.nextInt();
            array[i] = x;
        }

        long time2 = System.currentTimeMillis();
        System.out.println("生成数组时间：" + (time2 - time1) + "毫秒");
       // System.out.println(Arrays.toString(array));

        //归并排序
        MergeSort.sort(array);

        long time3 = System.currentTimeMillis();
        System.out.println("归并排序时间: " + (time3 - time2) + "毫秒");
        //System.out.println(Arrays.toString(array));
    }

}
