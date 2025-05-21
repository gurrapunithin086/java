package Day5;

class Fruits {
	void benifits() {
		System.out.println("healthy");
	}
}
class Apple extends Fruits{
	void color( ) {
		System.out.println("red");
	}
}
class Mango extends Fruits {
	void price()
	{
		System.out.println("10 kg");
	}
}
class Banana extends Fruits {
	void taste()
	{
		System.out.println("sweet");
	}
}
public class Demo3 {
	
	public static void main(String[] args) {
		Apple a1=new Apple();
		Mango m1=new Mango();
		Banana b1=new Banana();
		a1.benifits();
		a1.color();
		b1.taste();
		m1.price();
	}
	

}