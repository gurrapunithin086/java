package Day8;

class sample12 extends Thread {
	public void run() {
			System.out.println("hi");
	}
}
class sample1 implements Runnable {
	public void run() {
		System.out.println("good morning");
	}
}
class sample2 {
	
	public static void main(String[] args) {
		sample1 s1=new sample1();
		sample2 s2=new sample2();
		s1.start();
		Thread t3=new Thread(s1);
		t3.start();
	}
}