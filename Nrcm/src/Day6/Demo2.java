package Day6;

public class Demo2 {
	void show() {
		System.out.println("hi");
	}
	class Test{
		void print() {
			System.out.println("hello");
		}
	}
	public static void main(String[] args) {
		Demo2 s1=new Demo2();
		s1.show();
		Demo2.Test t1=new Demo2().new Test() ; 
		t1.print();		
	}
}
