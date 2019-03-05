import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.swing.*;
import java.util.zip.DeflaterOutputStream;

public class BubbleSort {
    public void sortArray(){
        int arr[]={1,12,23,4,24,35,32,67};
        System.out.println("冒泡排前的结果是:");
        for(int i=0;i<arr.length;i++){
            System.out.println(" "+arr[i]);

        }
        for(int i =0;i<arr.length-1;i++){
            for(int j =0;j<arr.length-1-i;j++){
                if (arr[j] > arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("\n冒泡排序后的结果:");
        for(int i=0;i<arr.length;i++){
            System.out.println(" "+arr[i]);
        }
    }
    public static void main(String[] args) {
        BubbleSort p =new BubbleSort();
        p.sortArray();
    }
}
