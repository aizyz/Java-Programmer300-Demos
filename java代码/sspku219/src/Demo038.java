public class Demo038 {
    public static void main(String args[]) {
            System.out.println(add(100));
        }
        public static int add(int num) {
            if (num == 1) {    // 结束条件
                return 1;    // 不再向后继续加了
            }
            return num + add(num - 1);    // 修改参数内容
        }
        // 第1次调用：return 100 + add(99)；
        // 第2次调用：return 100 + 99 + add(98)；
        // 倒数第2次调用：return 100 + 99 + ... + 3 + add(2) ;
        // 最后一次调用：return 100 + 99 + ... + 3 + 2 + 1 ;

    }
