package exer;

public class StringDemo {
	public static void main(String[] args){
			String a = "abc";
			String b = "abc";
			System.out.println(a==b);
			System.out.println("-----------");
			System.out.println(a.equals(b));
			System.out.println("-----------");
			Integer i1 = 10;
			Integer i2 = 10;
			System.out.println(i1==i2);
			System.out.println("-----------");
			String b1 = new String("abc");
			System.out.println(a==b1);
			System.out.println("-----------");
			String b2 = new String("abc");
			System.out.println(b1==b2);
			System.out.println("-----------");
			
	}
	

}
