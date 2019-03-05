import java.lang.annotation.Repeatable;

/*public class Demo021 {
    public static void main(String[] args) throws Exception {
        String str;
        str = "ADSXa721bb2ccc3dddd4eeeee5fffffff6ggggggg7";
        String regex = "[a-zA-Z]+" ;// 字母出现1次或多次
        System.out.println(str.replaceAll(regex, ""));
        System.out.println(str.replaceFirst(regex, ""));
    }
}*/
public class Demo021 {
    public static void main(String[] args) throws Exception {
        String str = "sdhjsd3241dsd46";
        String regex = "[a-zA-Z]+";
        System.out.println(str.replaceAll(regex,""));
        System.out.println(str.replaceFirst(regex,""));
    }
}



