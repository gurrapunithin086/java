package Day5;
class Test1 {
	void add( ) {
		System.out.println("hi");
	}
}

public class Demo5 extends Test1 {
	void add() {
		System.out.println("hello");
	}
	public static void main(String[] args) {
		Demo5 d1=new Demo5();
		d1.add();
	}
 
}
