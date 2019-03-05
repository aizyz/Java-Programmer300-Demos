import com.sun.org.apache.xml.internal.resolver.readers.ExtendedXMLCatalogReader;

public class Demo020 {
    public static void main(String[] args) throws Exception {
        String str = "13412249" ;
        if (str.matches("//d+")){
            System.out.println("是由数字所组成！");
        } else {
            System.out.println("不是由数字所组成！");
        }
    }
}

