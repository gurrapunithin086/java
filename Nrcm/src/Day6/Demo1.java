package Day6;

public class Demo1 {
	void show() {
		final int a=23;
		System.out.println(a);
		 a=34;
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		Demo1 d1=new Demo1();
		d1.show();
	}

}
