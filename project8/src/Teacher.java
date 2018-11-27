/** Miles Cumiskey
 *  CSC 220
 *  April 27, 2018
 *  Represents a teacher and the classes they teacher
 */
public class Teacher extends Person {
	private String course1;
	private String course2;
	
	public Teacher (String name, String address ) {
		this.setName(name);
		this.setAddress(address);
	}
	
	public String getCourse1 () {
		return course1;
	}
	
	public String getCourse2() {
		return course2;
	}
	
	public void setCourse1 (String courseName) {
		 course1 = courseName;
	}
	
	public void setCourse2(String courseName) {
		 course2 = courseName;
	}

	public String toString(){
		return super.toString();
	}
}
