import com.sun.org.apache.xpath.internal.operations.Plus;

import javax.xml.ws.soap.Addressing;

public class Demo009 {
    public static void main(String[] args) {
        int one = PlusOne(1,3);
        float two = PlusTwo(1.5f,1.4f);
        System.out.println("plusOne的结果是"+one);
        System.out.println("plusTwo的结果是"+two);

    }

    private static float PlusTwo(float v, float v1) {
        return(v+v1);
    }

    private static int PlusOne(int i, int i1) {
        return(i+i1);

    }
}

