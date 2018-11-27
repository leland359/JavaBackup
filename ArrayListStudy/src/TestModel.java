
public class TestModel {
	public static void main (String[] args){

	      // Create and display empty model
	      TestScoresModel model = new TestScoresModel();
	      System.out.println(model);

	      // Display size, current position, and current student
	      System.out.println(model.size());
	      System.out.println(model.currentPosition());
	      System.out.println(model.currentStudent());
	      System.out.println(" "); //space for clarity

	      // Add and display 3 students
	      for (int i = 1; i <= 3; i++){
	         Student s = new Student("S" + i);
	         model.add(s);
	      }
	      System.out.println("Test model.");

	      System.out.println(model);
	      
	      System.out.println("Test order methods.");

	      // Move to first student and display it
	      System.out.println(model.first());
	      
	      // Move to next and previous and display them
	      System.out.println(model.next());
	      System.out.println(model.previous());

	      // Move to last and next and display them
	      System.out.println(model.last());
	      System.out.println(model.next());

	      // Display size, current position, and current student
	      System.out.println(model.size());
	      System.out.println(model.currentPosition());
	      System.out.println(model.currentStudent());
	      
	      System.out.println(" ");
	      System.out.println("Replace current student and display the model");
	      // Replace current student and display the model
	      Student newStudent = new Student("Miles"); //it's me!
	      for (int i = 1; i < 4; i++){
	    	  newStudent.setScore(i, 100); //i am very hopefull
	      	}
	      model.replace(newStudent);
	      System.out.println(model);

	      // Add more students and display results
	      for (int i = 4; i <= 10; i++){
	         Student s = new Student("S" + i);
	         model.add(s);
	      }
	      System.out.println("Print model after adding new Students");
	      System.out.println(model);

	   }
	}
