public class Demo008 {
   // 使用System类的currentTimeMillis()方法来统计一个操作所花费的时间
       public static void main(String[] args) throws Exception {
           long start = System.currentTimeMillis();
           String str = "";
           for (int x = 0; x < 30000; x++) {
               str += x; // 产生垃圾
           }
           long end = System.currentTimeMillis();
           System.out.println("花费的时间：" + (end - start));
       }
   }
