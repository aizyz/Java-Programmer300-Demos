import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.xml.transform.Source;

public class Demo003 {
    public static void main(String[] args) {
        int int_max= Integer.MAX_VALUE;
        int int_min = Integer.MIN_VALUE;
        System.out.println("Integer的最小值为:"+int_min);
        System.out.println("Integer的最大数为:"+int_max);
        float float_max = Float.MAX_VALUE;
        float float_min = Float.MIN_VALUE;
        System.out.println("Float的最大值为:"+float_max);
        System.out.println("Float的最小值为:"+float_min);
        double double_max = Double.MAX_VALUE;
        double double_min = Double.MIN_VALUE;
        System.out.println("Double的最大值为:"+double_max);
        System.out.println("Double的最小值为:"+double_min);

    }
}
