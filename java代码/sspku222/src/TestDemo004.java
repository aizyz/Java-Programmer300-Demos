public class TestDemo004 {
        public static void main(String[] args) throws Exception {
            // 一层设置
            Demo002 <String> point = new  Demo002<>() ;
            point.setX("东经100度") ;
            point.setY("北纬20度") ;
            // 一层取出
            String x = point.getX() ;
            String y = point.getY() ;
            System.out.println("X的坐标是：" + x + "，Y的坐标是：" + y);
        }
    }

