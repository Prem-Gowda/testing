package exception;

public class ThrowsKeyword1 {
	public void div(int a,int b) throws ArithmeticException {
		
		if(b==0) {
			throw new ArithmeticException();
		}
		else {
		int c = a/b;
		System.out.println("The division of 2 number is:" + c);
		}
	}

		public static void main(String[] args)throws ArithmeticException {
			// TODO Auto-generated method stub
			ThrowsKeyword1 obj = new ThrowsKeyword1();
			obj.div(12, 0);
			System.out.println("Further code execution");
			

		}

}
