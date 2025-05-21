package Day3;

abstract class test3 {
	abstract void add();
}
class array extends test3{
	public void add() {
		System.out.println("hi");
	}
	public static void main(String[] args) {
		array d1 = new array ();
		d1.add();
		
	}
}
