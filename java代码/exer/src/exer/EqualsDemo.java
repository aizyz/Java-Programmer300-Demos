package exer;

public class EqualsDemo {
	public static void main(String[] args){
		boolean flag = false;
		int v1 = 10;
		int v2 = 10;
		flag = (v1==v2)?true :false;
		System.out.println(flag);
		Integer i1 = new Integer(v1);
		Integer i2  = new Integer(v2);
		System.out.println(i1.equals(i2));
		System.out.println(i1==i2);
	}

}
