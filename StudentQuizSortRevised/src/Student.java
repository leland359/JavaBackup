//Miles Cumiskey, Hackettstown High School
//Student class for sorting project
//28.3.17

import java.util.*;


public class Student implements Comparable <Student> {
	
	public final static int HIGHER = 1;
	public final static int LOWER = -1;
	
	private String id;
	private String [] quizresult=new String[10]; 
	private int score;
	private String letterGrade;
	
	public Student() {
		//the simplest student constructor
		id=" ";
		for (int i =0; i<quizresult.length; i++){
		      quizresult[i]="";		
		}
		score = 0;
		letterGrade = " ";
	}
	
	
	public Student(String a, String[] answers){
		//student constructor with an id 'a' and the corresponding answers
		id = a;
		
		for(int i=0; i<answers.length; i++){
			
			quizresult[i]=answers[i];
			
		}
		
		score = 0;
		letterGrade = " ";

	}
	
	//access methods
	public String [] getAnwers(){		
		return quizresult;	
	}
	
	public int getScore(){
		return score;
	}
	
	public String getId(){	
		return id;	
	}
	public String getLetterGrade() {
		return letterGrade;
	}
	
	/** 
	 * Grades the student by comparing them to the correct answers 
	 * @param answerkey the first line of the text file
	 * @param studentanswer individual answers
	 */
	public void grade(String [] answerkey, String[] studentanswer){	
		
		int count=0;		
				for(int i = 0; i < answerkey.length; i++){					
					if(answerkey[i].equals(studentanswer[i])){						
						count = count+10;		
						//adds ten points for every correct answer
					}			
				}
		
				score = count;	
				convertToLetterGrade(); //converts number to a letter
	}
	
	/**
	 * Converts the student's score into a grade
	 */
	private void convertToLetterGrade() {
		if (score == 100){
			letterGrade = "A";
		} else if (score == 90){
			letterGrade = "B";
		} else if (score >= 70){
			letterGrade = "C";
		} else if (score >= 50){
			letterGrade = "D";
		} else {
			letterGrade = "F";
		}
	}

	public String toString(){
		
		String a = "Student id: " + id + " " +  Arrays.toString(quizresult) + " Score:  " +  score + " Grade: " +letterGrade  +"\n";
		
		return a;
		
		}

	
	/**
	 * Compares two Students. For the purpose of this exercise, it only compares 
	 * the numerical grade.
	 * @param other - the student to compare with this one
	 */
	@Override
	public int compareTo(Student other) {
		if (! (other instanceof Student)){
			throw new IllegalArgumentException("You must compare two students.");
			
		} else if (this.getScore() > other.getScore()){
			//this student scored higher
			return HIGHER;
			
		} else if (this.getScore() < other.getScore()){
			//this student scored lower
			return LOWER;
			
		} else {
			return 0;
		}
	}

}
	
	


