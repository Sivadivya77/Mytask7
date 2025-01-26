package guvitask7;

public class Task7q1 {
	 public void divi(int a, int b) {
		 if(b==0) {
			 throw new ArithmeticException();
			 
		 }else
		 {
			 int c=a/b;
			 System.out.println(c);
		 }
	 }

	public static void main(String[] args) {
	          
		Task7q1 objT=new Task7q1();
		try {
		objT.divi(20, 0);
		}
		catch(ArithmeticException e) {
			System.out.println("The Value of b is zero");
		}
		
		
	}

}
/*
output
The value of b is zero
*/