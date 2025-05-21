package Day7;
import java.util.*;
public class sample4 {
	public static void main(String[] args) throws ArithmeticException {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a,b values:");
		try {
			int a= sc.nextInt();
			int b= sc.nextInt();
			int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException|InputMismatchException e) {
			System.out.println(e.getMessage());
		}
	}
	

}
