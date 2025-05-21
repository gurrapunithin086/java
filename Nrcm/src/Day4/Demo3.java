package Day4;
class Demo10{
	 protected void add() {
		System.out.println("hi");
	}
}

public class Demo3 extends Demo10 {
	
	public static void main(String[] args) {
		Demo3 d1=new Demo3();
		d1.add();
	}

}
