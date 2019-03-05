public class Demo023 {
    public static void main(String[] args) {
        String str1="hello";
        String str2=new String("hello");
        String str3=str2;
        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals(str1));



    }
}
