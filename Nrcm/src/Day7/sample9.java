package Day7;

public class sample8 extends Thread {
	 
	public static void main(String[] args) {
		sample8 d1=new sample8();
		Thread t1=new Thread();
		t1.start();
		System.out.println(t1.getName());
		System.out.println(t1.getState());
		Thread t2=new Thread(d1);
		t2.start();
		System.out.println(t2.getName());
	}

}
