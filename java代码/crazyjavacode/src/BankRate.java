import java.sql.SQLOutput;
import java.util.Scanner;

public class BankRate {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);//键入
            System.out.println("欢迎客户，请输入本金：____（元）");
        double investmentAmount = input.nextDouble();//输入本金
            System.out.println("存入本金："+investmentAmount) ;
            System.out.println("请选择年利率：");//输入利率
        double  monthlyInterestRate = input.nextDouble();
            System.out.println("本次您选择的活期月利率为："+monthlyInterestRate) ;
            double a =  (1 + monthlyInterestRate);
            double b = Math.pow(a, 12);
            double futureInvestment = investmentAmount*b;
            System.out.println("连本带利收益为:" + futureInvestment);
        }1
    }

