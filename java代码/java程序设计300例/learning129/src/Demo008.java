import javax.print.attribute.standard.PrinterInfo;
import java.sql.SQLOutput;

public class Demo008 {
    public static void main(String[] args) {
        PrinterInfo();
        PrinterInfo();
        PrinterInfo();
        System.out.println("hello world");

    }
    public static void PrinterInfo(){
        char c[] ={'H','E','L','L','O','W','O','R','L','D','W','Y'};
        for(int x=0;x<c.length;x++) {
            System.out.print(c[x]+"\t");
        }
        System.out.println(" ");
    }

}

