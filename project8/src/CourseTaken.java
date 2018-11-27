/** Miles Cumiskey
 *  CSC 220
 *  April 27, 2018
 *  Represents a course at a school
 */
public class CourseTaken {
	private String courseName;
	private int grade;
	
	public CourseTaken(){
		this.courseName = " ";
		this.grade = 0;
	}
	
	public CourseTaken(String courseName, int grade){
		this.courseName = courseName;
		this.grade = grade;
	}
	
	public int getGrade() {
		return this.grade;
	}
	
	public String toString () {
		return courseName +"  :  " +this.grade +"\n";
	}

}
