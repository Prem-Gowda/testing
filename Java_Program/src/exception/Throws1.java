package exception;

public class Throws1 {
	public void div(int a,int b) {
		if(b==0) {
			throw new ArithmeticException();
		}
		else {
		int c = a/b;
		System.out.println("The division of 2 number is:" + c);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Throws1 obj = new Throws1();
		obj.div(12, 0);

	}

}
