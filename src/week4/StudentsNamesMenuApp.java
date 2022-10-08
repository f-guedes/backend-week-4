package week4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentsNamesMenuApp {
	static Scanner s = new Scanner(System.in);
	static List<String> students = new ArrayList<String>();
	
	public static void main(String[] args) {		
		int choice = 0;
		
		while (choice != 4) {
			showMenu();
			choice = getUserChoice();
			
			if (choice == 1) {
				printStudentNames();
			} else if (choice == 2) {
				addNewStudent();
			} else if (choice == 3) {
				deleteStudent();
			} else if (choice == 4) {
				System.out.println("Goodbye!");
			} else {
				System.out.println("Please select a valid option.");
			}
			
		}
	}
	
	public static void showMenu() {
		System.out.println("-------------------------------");
		System.out.println("1) Print Student Names");
		System.out.println("2) Add New Student");
		System.out.println("3) Delete Student");
		System.out.println("4) Exit");
		System.out.println("-------------------------------");
	}
	
	public static int getUserChoice() {
		return s.nextInt();
	}
	
	public static void printStudentNames() {
		for (String student : students) {
			System.out.println(student);
		}
	}
	
	public static void addNewStudent() {
		System.out.print("Enter the name of the student to be added: ");
		String name = s.next();
		students.add(name);
		System.out.println(name + " was added to the list.");
	}
	
	public static void deleteStudent() {
		System.out.print("Enter the index # of the student to be removed: ");
		int index = getUserChoice();
		if (index < students.size()) {
		students.remove(index);
		System.out.println(students.get(index) + " has been removed.");
		} else {
			System.out.println("Please make a valid selection.");
		}
	}
	

}
