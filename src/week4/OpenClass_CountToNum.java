package week4;

import java.util.*;

public class OpenClass_CountToNum {

	static void createList(int endNum) {
		// Write your code in this method
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 1; i <= endNum; i++) {
			list.add(i);
		}
		System.out.println(list);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int endNum = in.nextInt();
		
		createList(endNum);
	}
}