package Day3;

public class Demo3 {
	public static void main(String[] args) {
		String str = "hellowoeld";
		int vowels = 0, consonants = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowels+=ch;}
			else if (ch >= 'a' && ch <= 'z') 
			{
			}
		System.out.println("vowels:"+vowels+",consonants:"+consonants);	
		}
	}

}
