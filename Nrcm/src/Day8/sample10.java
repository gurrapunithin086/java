package Day8;

public class sample10 implements Runnable {
	public void run() {
		System.out.println("hi");
	}
	public static void main(String[] args) {
		sample10 s1=new sample10();
		Thread t2=new Thread(s1);
		System.out.println("hello");
		t2.start();
	}

}
