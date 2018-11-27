/** Miles Cumiskey
 *  CSC 220
 *  April 27, 2018
 *  Tests the Student and Teacher Classes
 */

public class StudentTester {
	public static void main (String [] args) {
		Student s = new Student ("Miles", "311 Allen Hall");
		System.out.println(s.toString());
		
		System.out.println();

		s.addCourseGrade("Conceptions of the Cosmos", 91);
		s.addCourseGrade("Intro to Digital Media", 100);
		s.addCourseGrade("Intro to Interactive Computing", 100);
		s.addCourseGrade("Intro to Sociology", 97);
		s.addCourseGrade("Fund. Of Engineering", 86);
		s.addCourseGrade("Computer Problem Solving", 100);
		
		s.printGrades();
		
		System.out.println("Average Grade: " +s.getAverageGrade());
		System.out.println();

		Teacher t = new Teacher ("Josh Fishburn", "AIMM 270");
		System.out.println(t.toString());
		t.setCourse1("Intro to Digital Media");
		t.setCourse2("Delightful Little Games");
		System.out.println();
		System.out.println(t.getCourse1());
		System.out.println();
		System.out.println(t.getCourse2());
	}
}
