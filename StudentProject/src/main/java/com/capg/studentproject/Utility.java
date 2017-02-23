package main.java.com.capg.studentproject;

public class Utility {

	public static void displayCourseName(Student student) {
		System.out.println("Courses: ");
		for (int i = 0; i < student.getCoursenames().length; i++) {
			System.out.println((student.getCoursenames())[i]);
		}
		System.out.println("\n");
	}


}
