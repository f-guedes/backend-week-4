package week4;

public class StringAndStringBuilder {

	public static void main(String[] args) {
		String firstName = "Sally";
		String lastName = "Smith";
		
		String tripleHi = multiplyString ("Hi", 3);
		System.out.println(tripleHi);
		
		StringBuilder fullName = new StringBuilder("John");
		fullName.append(" Doe");
		System.out.println(fullName.toString());
		
		System.out.println(fullName.charAt(5));
//		System.out.println(fullName.deleteCharAt(2));
//		System.out.println(fullName.delete(1, 3));
		System.out.println(fullName.indexOf("oe"));
		System.out.println(fullName.length());
//		System.out.println(fullName.reverse());
		System.out.println(fullName.replace(5, 8, "Jackson"));

		
	}

	public static String multiplyString(String str, int num) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < num; i++) {
			result.append(str);
		}
		return result.toString();
	}
	
	
}
