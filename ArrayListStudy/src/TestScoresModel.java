import java.util.ArrayList;
import java.util.List;

// Case Study 10.1: TestScoresModel class now with ArrayLists

public class TestScoresModel{
	
   private List<Student> students = new ArrayList(); //arraylist for infinite students
   private int indexSelectedStudent;   // Position of current student
   private int studentCount; //keeps counting students
   
   
   public TestScoresModel(){

      // Initialize the data
      indexSelectedStudent = -1;
      studentCount = 0;
   }

   // Mutator methods for adding and replacing students

   public String add(Student s){
	   //Deleted- using arraylist means infinite children
        students.add(s);  //adds
        studentCount++; //more kids!
        indexSelectedStudent = 0; //now there are kids, it selects the first one
        return null;
      
   }

   public String replace(Student s){
      if (indexSelectedStudent == -1)
         return "Must add a student first";
      else{     
    	 students.set(indexSelectedStudent, s); 
    	 //sets the new student to selected index
         return null;
      }
   }

   // Navigation methods

   public Student first(){
      Student s = null;
      if (studentCount == 0)
         indexSelectedStudent = -1;
      else{
    	 indexSelectedStudent = 0; 
         s = students.get(indexSelectedStudent); //get the student at pos 0 ie, first pos
      }
      return s;
   }

    public Student previous(){
      Student s = null;
      if (studentCount == 0){
         indexSelectedStudent = -1;
      } if (indexSelectedStudent <= 0){
    	  s = students.get(0);
      }else{
         s = students.get(indexSelectedStudent - 1); 
         }
      return s;
   }

   public Student next(){
      Student s = null;
      if (studentCount == 0)
         indexSelectedStudent = -1;
      else{
         s = students.get(indexSelectedStudent + 1);
      }
      return s;
   }

   public Student last(){
      Student s = null;
      if (studentCount == 0)
         indexSelectedStudent = -1;
      else{
         s = students.get(studentCount-1);
      }
      return s;
   }

   // Accessors to observe data

   public Student currentStudent(){
      if (indexSelectedStudent == -1)
         return null;
      else
         return students.get(indexSelectedStudent);
   }

   public int size(){
      return studentCount;
   }

   public int currentPosition(){
      return indexSelectedStudent;
   }

   public int getClassAverage(){
      if (studentCount == 0)
         return 0;
      int sum = 0;
      for (int i = 0; i < studentCount; i++)
         sum += ((Student) students).getAverage();
      return sum / studentCount;
   }

   public Student getHighScore(){
      if (studentCount == 0)
         return null;
      else{
         Student s = students.get(0);
         for (int i = 1; i < studentCount; i++) {  
            if (s.getHighScore() < students.get(i).getHighScore()) {
               s = students.get(i);
            }
         }
         return s;
      }
   }

   public String toString(){
      String result = "";
      for (int i = 0; i < studentCount; i++)
         result = result + students.get(i) + "\n";
      return result;
   }
}

