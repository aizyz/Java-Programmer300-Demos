public class Demo052 {
    public static void main(String[] args) throws Exception {
        int data[] = new int[] { 1, 2, 3, 4, 5, 6 };
        int sum = 0;
        //for (int x =0;x<data.length+1;x++) { // 自动循环，将每一个元素赋给x
          for (int x :data){
            sum += x;
        }
        System.out.println(sum);
    }
}

