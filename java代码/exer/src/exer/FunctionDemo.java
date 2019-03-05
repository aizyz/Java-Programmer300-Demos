package exer;
//这个类提供评了求累加和的calSum的方法
public class FunctionDemo {
	static int calSum(int num ){
		int result = 0;
		int startNum = 0;
		//通过while循环计算累加和
		while (startNum++ <num){
			result = result + startNum;		
		}
		return result;
		
	}
	public static void main(String[] args) {
		/**
		 * 调用calSum方法，通过计算传入参数计算1到100的累加和
		 * 用result接收计算结果
		 * 
		 * 
		 */
		 
		int result = calSum(100);
		System.out.println(result);
	}
}//打印结果