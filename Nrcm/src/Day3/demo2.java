package Day3;

public class demo2 {
	public static void main(String args[]) {
		String s1="queen";
		String s2="queen";
		String s3=new String("queen");
		String s4=new String("queen");
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		System.out.println(s3.equals(s4));
		System.out.println(s3==s4);
		System.out.println(s2.equals(s4));
		System.out.println(s1);
}
}