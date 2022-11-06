package week4;

import java.util.*;

public class OpenClass_IndexOfCharacterOnAlphabet {

	static void findLetter(List alphabet, char userLetter) {
		System.out.println(alphabet.indexOf(userLetter));
		
		
		
		// Write your code above this line 
	}

    // DO NOT CHANGE THE CODE BELOW THIS LINE
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char userLetter = in.next().charAt(0);
		
		List<Character> alphabet = new ArrayList<>();
		for (int i = 97; i < (97+26); i++) {
		    alphabet.add((char) i);
		}
		
		findLetter(alphabet, userLetter);
	}
}