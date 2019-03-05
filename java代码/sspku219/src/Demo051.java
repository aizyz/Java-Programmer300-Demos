public class Demo051 {
    public static void main(String[] args) throws Exception {
        int data[] = new int[] { 1, 2, 3, 4, 5, 6 };
        int sum = 0;
        for (int x = 0; x < data.length; x++) {
            sum += data[x];
        }
        System.out.println(sum);
    }
}

