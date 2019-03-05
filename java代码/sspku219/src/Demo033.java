public class Demo033 {
    public static void main(String[] args) {
        if(isType(3)){
            System.out.println("偶数");
        }else{
            System.out.println("奇数");
        }
    }

    public static boolean isType(int num) {
        return num%2==0;

    }
}
