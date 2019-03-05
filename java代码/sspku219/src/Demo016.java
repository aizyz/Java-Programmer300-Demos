import java.util.Arrays;
public class Demo016 {
    public static void main(String[] args) throws Exception {
    int[] dataA = new int[] { 1, 2, 3 };
    int[] dataB = new int[] { 1, 2, 3 };
		System.out.println(Arrays.equals(dataA, dataB));
		Arrays.fill(dataA,5) ;	// 填充数组
        System.out.println(dataA);
		System.out.println(Arrays.toString(dataA));
}
}


