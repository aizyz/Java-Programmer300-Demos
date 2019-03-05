public class TestDemo002 {
    public static void main(String[] args) throws Exception {
        // 一层设置
        Point point = new Point() ;
        point.setX(10) ;
        point.setY(20) ;
        // 一层取出
        int x = (Integer) point.getX() ;
        int y = (Integer) point.getY() ;
        System.out.println("X的坐标是：" + x + "，Y的坐标是：" + y);
    }
}

