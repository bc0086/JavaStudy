package BitCoding;

public class Basic_031Problem {

	public static void main(String[] args) {

		int a = 1;
		
		System.out.println(a++); // 1
		System.out.println(a+(++a)); // 5
		System.out.println(a++ + ++a * a); // 28
	}
}
