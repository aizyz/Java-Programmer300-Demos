public class Demo014 {
    public static void main(String[] args) throws Exception {
        System.out.println(Math.round(15.5)); // 16
        System.out.println(Math.round(15.51)); // 16
        System.out.println(Math.round(15.6)); // 16
        System.out.println(Math.round(15.2356)); // 15
        System.out.println(Math.round(-15.5)); // -15
        System.out.println(Math.round(-15.51)); // -16
        System.out.println(Math.round(-15.6)); // -16
    }
}

