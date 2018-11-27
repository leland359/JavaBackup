/** Miles Cumiskey
 *  CSC 220
 *  April 27, 2018
 *  Represents a student and the classes they take, as well as their grades
 */

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Student extends Person{
	private int numCourses;
	private ArrayList <CourseTaken> courses = new ArrayList <CourseTaken> ();
	
	public Student () {
		this.setName(" ");
		this.setAddress(" ");
		numCourses = 0;
	}
	
	public Student (String name, String address ) {
		this.setName(name);
		this.setAddress(address);
		numCourses = 0;
	}
	
	public void addCourseGrade (String courseName, int grade) {
		CourseTaken newCourse = new CourseTaken(courseName, grade);
		courses.add(newCourse);
		numCourses++;
	}
	
	public void printGrades (){
		for (CourseTaken i : courses) {
			System.out.println(i.toString());
		}
	}
	
	public double getAverageGrade (){
		double avGrade = 0;
		double smallAv;
		
		for (CourseTaken i : courses) {
			avGrade = i.getGrade() + avGrade;
		}
		
		avGrade = avGrade / courses.size();
		
		DecimalFormat df = new DecimalFormat("#.##");
	    smallAv = Double.parseDouble(df.format(avGrade));
		
		return smallAv;
	}

	public String toString(){
		return super.toString();
	}
}
