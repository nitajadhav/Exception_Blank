package main.java.com.capg.studentproject;

import java.util.Scanner;

public class Admin {

	static Scanner scanner = new Scanner(System.in);
	static StudentScheduler studentScheduler = new StudentScheduler();
	static int studentCounter;

	public static void main(String[] args) {

		while (true) {
			System.out.println("Enter you choice");
			System.out.println("1.Enter student");
			System.out.println("2.show student");
			System.out.println("3.Generate report");
			System.out.println("4.Exit\n");
			int choice = scanner.nextInt();

			switch (choice) {

			case 1:
				addAllStudents();
				break;

			case 2:
				showAllStudents();
				break;

			case 3:
				report();
				break;

			case 4:
				System.exit(0);

			default:
				System.out.println("You entered wrong choice\n");

			}

		}

	}

	private static void report() {
		System.out.println("Enter roll number to get all the enrolled courses: ");
		int rollNumber = scanner.nextInt();
		studentScheduler.generateReport(rollNumber);

	}

	private static void addAllStudents() {
		int rollNumber;
		String name;
		String[] coursenames;

		int courses;

		System.out.println("enter rollnumber: ");
		rollNumber = scanner.nextInt();

		System.out.println("enter name: ");
		name = scanner.next();

		System.out.println("To how many courses student can enroll?: ");

		courses = scanner.nextInt();
		coursenames = new String[courses];

		for (int i = 0; i < courses; i++) {
			System.out.println("Enter course name");
			coursenames[i] = scanner.next();
		}

		System.out.println(studentScheduler.addStudent(rollNumber, name, coursenames));

	}

	private static void showAllStudents() {

		studentScheduler.showStudent();
	}

}
