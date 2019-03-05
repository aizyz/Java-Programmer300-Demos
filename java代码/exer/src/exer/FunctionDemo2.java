package exer;

import javax.print.attribute.standard.RequestingUserName;

class Person{
	void changeCompany(String name){
		name="IBM";
		
	}
	
	
	
}
public class FunctionDemo2 {
	public static void main(String[] args){
		String name = "HP";
		Person person = new Person();
		person.changeCompany(name);
		System.out.println(name);
	}
}
