package Day7;

class CheppanuException extends Exception{
	public CheppanuException(String message) {
		super(message);
	}
}

public class sample7 {
	public static void ageCheck(int age) throws CheppanuException {
		
		if(age>18) {
			throw new CheppanuException("nenu chapanu");
		}
		else {
			System.out.println("naa age 18 below");
		}
	}
	public static void main(String[] args) {
		try {
			ageCheck(12);
		}catch(CheppanuException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("happy coding");
		}
	}

}
