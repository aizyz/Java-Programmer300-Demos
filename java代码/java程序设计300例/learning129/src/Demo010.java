import com.sun.org.apache.xpath.internal.operations.Plus;

public class Demo010 {//方法重载
    public static void main(String[] args) {
        int one = add(10,3,41);
        float two = add(13.1f,52.7f,41.8f);
        int three = add(32,43,5);
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
    }

    private static float add(float v, float v1, float v2) {
        return (v+v1+v2);
    }

    private static int add(int i, int i1, int i2) {
        return (i+i1+i2);
    }
}


