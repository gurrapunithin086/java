package Day4;

class fixedAmount {
	public int fixedamount = 10000;
}
abstract class withdrawal {
	abstract void withdraw(int amount);
}
public class Demo1 extends withdrawal {
	fixedAmount f1 = new fixedAmount();
	
	void withdraw(int amount) {
		
		System.out.println("withdrawn: " + amount);
		f1.fixedamount -= amount;
		System.out.println("Available Balance: " + f1.fixedamount);
	}
	public static void main(String[] args) {
		int amount=Integer.parseInt(args[0]);
		Demo1 b=new Demo1();
		b.withdraw(amount);
	}
}
