public class Demo039 {
        public static void main(String args[]) {
            char c = 'A' ;	// 定义一个字符
            int x = c ;	// char --> int
            x += 32 ;	// 变为小写编码
            char temp = (char) x ;	// int --> char
            System.out.println(temp) ;
        }
    }

