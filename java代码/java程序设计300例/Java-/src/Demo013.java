import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.xml.transform.Source;

public class Demo013 {
    public static void main(String[] args) {
        int min,max;
        int A[] = {24,53,65,13,10,42};
        min = max = A[0];
        System.out.println("数组A的元素包括: ");
        for (int i=0;i<A.length;i++){
            System.out.println(A[i]+" ");
            if(A[i]>max){
                max=A[i];
                if(A[i]<min){
                    min=A[i];
                }

            }
            System.out.println("数组的最大值为:"+max);
            System.out.println("数组的最小值为:"+min);
        }
    }
}
