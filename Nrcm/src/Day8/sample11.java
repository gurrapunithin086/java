package Day8;

public class sample11 implements Runnable {
	public void run() {
		System.out.println("hi");
	}
	public static void main(String[] args) {
		sample11 s1=new sample11();
		sample11 s2=new sample11();
		Thread t1=new Thread(s1);
		Thread t2=new Thread(s2);
		System.out.println("hello");
		t2.start();
	}
}

