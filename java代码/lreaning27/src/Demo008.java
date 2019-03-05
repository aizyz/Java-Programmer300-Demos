public class Demo008 {
    public static void main(String[] args) throws Exception {
        long start = System.currentTimeMillis();
        String str = "";
        for (int x = 0; x < 30000; x++) {
            str += x; // 产生垃圾
        }
        long end = System.currentTimeMillis();
        System.out.println(start);
        System.out.println(end);
        System.out.println("花费的时间：" + (end - start));
    }

}
