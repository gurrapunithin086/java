package Day5;

class Movies {
	void genre() {
		System.out.println("crime and thiller");
	}
}
class Hit extends Movies{
	void action( ) {
		System.out.println("investigation");
	}
}
class Hero extends Hit {
	void name()
	{
		System.out.println("nani");
	}
}
class Heroin extends Movies{
	void look()
	{
		System.out.println("good");
	}
}
public class Demo4 {
	
	public static void main(String[] args) {
		Hero a1=new Hero();
		Heroin m1=new Heroin();
		a1.genre();
		a1.action();
		a1.name();
		m1.look();
	}
	

}