import java.util.Scanner;

public class Demo007 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long year;
        try{
            year= scan.nextLong();
            if(year %4 ==0&&year%100!=0||year%400==0) {
                System.out.println("公元"+year + "是闰年！");
            }
            else{
                    System.out.println("公元"+year+"不是闰年！");

                }
            }
            catch(Exception e){
                System.out.println("乱求输入，重新再输！");
            }
        }
    }






