package main.java.com.capg.studentproject;

public class StudentScheduler {

	Student[] students = new Student[10];
	static int studentCounter;

	String addStudent(int rollnumber, String name, String[] coursenames) {

		for (int i = 0; i < studentCounter; i++) {
			if (rollnumber == students[i].rollNumber)
				return "duplicate Roll Number. Student addition was unsuccessful";
		}

		students[studentCounter] = new Student();
		students[studentCounter].setCoursenames(coursenames);
		students[studentCounter].setName(name);
		students[studentCounter++].setRollNumber(rollnumber);

		return "Student added successfully";
	}

	void showStudent() {
		for (int i = 0; i < studentCounter; i++) {
			System.out.println("Roll Number: " + students[i].rollNumber);
			System.out.println("Name: " + students[i].getName());
			System.out.println("Courses: ");

			displayCourseName(students[i]);
		}
	}

	void generateReport(int rollNumber) {
		for (int i = 0; i < studentCounter; i++) {
			if (rollNumber == (students[i].rollNumber)) {
				System.out.println("Courses enrolled by roll number is: " + rollNumber + " are ");
				displayCourseName(students[i]);
			}
		}
	}
	
	public static void displayCourseName(Student student) {
		
		for (int i = 0; i < student.getCoursenames().length; i++) {
			System.out.println((student.getCoursenames())[i]);
		}
		System.out.println("\n");
	}

}
