public class Demo032 {
        public static void main(String args[]) {
            printInfo(3) ;	// 主方法之中直接调用
            printInfo(5) ;	// 主方法之中直接调用
            printInfo(9) ;	// 主方法之中直接调用
        }
        public static void printInfo(int line) {	// 方法名称
            for (int x = 0 ; x < line ; x ++) {	// 循环次数，控制行
                for (int y = 0 ; y < line - x ; y ++) {
                    System.out.print(" ") ;
                }
                for (int y = 0 ; y <= x ; y ++) {
                    System.out.print("* ") ;
                }
                System.out.println() ;
            }
        }
    }

