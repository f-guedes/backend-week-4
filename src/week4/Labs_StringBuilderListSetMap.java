package week4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Labs_StringBuilderListSetMap {
	
	public static void main(String[] args) {
		
	
		//instantiate a new StringBuilder and append the characters 0 through 9 to it separated by dashes
		//make sure no dash appears at the end of the StringBuilder
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 9; i++) {
			sb.append(i + "-");
		} sb.append(9);
		System.out.println(sb.toString());
		
		
		//create a list of Strings and add 5 Strings to it, each with a different length
		List<String> vehicleBrands = Arrays.asList("Honda", "Toyota", "BMW", "Ford", "Chevrolet", "Chrysler", "Corvette", "Cadillac", "Nissan", "Mercedes-Benz");		
		
		//write and test a method that takes a list of strings and returns the shortest string
		System.out.println(findShortestString(vehicleBrands));
		
		//write and test a method that takes a list of strings and returns the list with the first and last element switched
//		System.out.println(swapFirstAndLast(vehicleBrands)); 

		// Alternatively you can create a new List<String> with the first and last swapped and print them out using a loop:
		List<String> swapped = swapFirstAndLast(vehicleBrands);
			for (String str : swapped) {
				System.out.println(str);
			}
		
		//write and test a method that takes a list of strings and returns a string with all the list elements concatenated to each other,
		//separated by a comma
		System.out.println(concatenateAllStrings(vehicleBrands));
		
		
		//write and test a method that takes a list of strings and a string and returns a new list with all strings from the original list
		//containing the second string parameter (i.e. like a search method)
		System.out.println(search(vehicleBrands, "a"));
		
		//write and test a method that takes a list of integers and returns a List<List<Integer>> where the first list in the returned value
		//contains any number from the input list that is divisible by 2, the second list contains values from the input list that are divisible
		//by 3, the third divisible by 5, and the fourth all numbers from the input list not divisible by 2, 3, or 5
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 20, 25, 30);
		
		List<List<Integer>> sortedNumbers = sortDivisibleNumbers(numbers);
		for (List<Integer> list : sortedNumbers) {
			for (Integer number : list) {
				System.out.println(number);
			}
			System.out.println("-- Next list --");
		}
	
		
		
		
		//write and test a method that takes a list of strings and returns a list of integers that contains the length of each string
		
		
		//create a set of strings and add 5 values
		
		
		//write and test a method that takes a set of strings and a character and returns a set of strings consisting of all the strings in the
		//input set that start with the character parameter.
		
		
		//write and test a method that takes a set of strings and returns a list of the same strings
		
		
		
		//write and test a method that takes a set of integers and returns a new set of integers containing only even numbers from the original set
		
		
		
		
		//create a map of string and string and add 3 items to it where the key of each is a word and the value is the definition of the word
		
		
		//write and test a method that takes a Map<String, String> and a string and returns the value for a key in the map that matches the 
		//string parameter (i.e. like a language dictionary lookup)
	
		
		//write and test a method that takes a List<String> and returns a Map<Character, Integer> containing a count of all the strings that start
		//with a given character
		
	
	}
	
	public static List<List<Integer>> sortDivisibleNumbers(List<Integer> list){
		List<List<Integer>> results = new ArrayList<List<Integer>>();
		results.add(new ArrayList<Integer>());
		results.add(new ArrayList<Integer>());
		results.add(new ArrayList<Integer>());
		results.add(new ArrayList<Integer>());
		
		for (Integer number : list) {
			if (number % 2 == 0) {
				results.get(0).add(number);
			} 
			if (number % 3 == 0){
				results.get(1).add(number);
			}
			if (number % 5 == 0) {
				results.get(2).add(number);
			}
			if (number % 2 != 0 && number % 3 != 0 && number % 5 != 0) {
				results.get(3).add(number);
			}
		}
		return results;
	}
	
	
	public static List<String> search (List<String> oldlist, String query) {
		List<String> newList = new ArrayList<String>();
		for (String str : oldlist) {
			if (str.contains(query)) {
				newList.add(str);
			}
		}
		return newList;
	}
	
	public static String concatenateAllStrings (List<String> list) {
		StringBuilder result = new StringBuilder();
			for (String str : list) {
				if (str != list.get(list.size() -1)) {
				result.append(str + ", ");
				} else {
				result.append(str);
				}
			}
		return result.toString();
			
	}
	
	public static List<String> swapFirstAndLast(List<String> list) {
		String temp = list.get(0);
		list.set(0, list.get(list.size() - 1));
		list.set(list.size() - 1, temp);
		return list;
	} 
	
	public static String findShortestString(List<String> list) {
		String shortest = list.get(0);
		for (String string : list) {
			if (string.length() < shortest.length()) {
				shortest = string;
			}
		} 
		return shortest;
		
	}
	
	
}