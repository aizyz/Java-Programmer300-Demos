public class TestDemo003 {
        public static void main(String[] args) throws Exception {
            // 一层设置
            Point point = new Point() ;
            point.setX(10.2) ;
            point.setY(20.3) ;
            // 一层取出
            double x = (Double) point.getX() ;
            double y = (Double) point.getY() ;
            System.out.println("X的坐标是：" + x + "，Y的坐标是：" + y);
        }
    }
