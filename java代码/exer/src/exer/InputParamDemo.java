	package exer;
	
	public class InputParamDemo {
		public static void main(String[] args){
			if(args[0].equals("QA")){
				System.out.println("RUN IN QA ENV.");		
			}
			else if(args[0].equals("PROD")){
				System.out.println("RUN IN PROD ENV.");
			}
			else{
				System.out.println("Error");
			}
		}
	}
