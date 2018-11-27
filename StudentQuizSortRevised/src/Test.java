
//Miles Cumiskey, Hackettstown High School
//Test class for sorting project
//28.3.17

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Test {

	private static FileInputStream inFile;
	private static InputStreamReader inReader;
	private static BufferedReader reader;

	private static List<Student> leftSide = new ArrayList<Student>();
	private static List<Student> rightSide = new ArrayList<Student>();
	//place to store array halves for sorts

	private static List<Student> classroom = new ArrayList<Student>(); // ArrayList
																		// to
																		// store
																		// the
																		// classroom.

	public static void main(String args[]) throws IOException {

		String userInput = " ";
		Scanner reader = new Scanner(System.in);

		System.out.println("Would you like to use quicksort (qs) or mergesort (ms)?");
		// ask for user input
		userInput = reader.nextLine();

		System.out.println(" ");

		initFile();
		getData();

		if (userInput.equalsIgnoreCase("quicksort") || userInput.equalsIgnoreCase("qs")) {

			quicksort(0, classroom.size());
			System.out.print(classroom); // output after sorting.

		} else if (userInput.equalsIgnoreCase("mergesort") || userInput.equalsIgnoreCase("ms")) {

			divide(0, classroom.size() - 1);
			System.out.print(classroom); // output after sorting.

		} else {

			// just in case - safety net

			System.out.println("You did not give a recognizable answer. Bubblesort was used to return a sorted list.");
			System.out.println(" ");
			bubbleSort();
			System.out.print(classroom); // output after sorting.

		}

		inFile.close();

	}

	public static void initFile() throws IOException {
		inFile = new FileInputStream("//Users//miles//Downloads//01CompsciDownloads//truefalse.txt");
		inReader = new InputStreamReader(inFile);
		reader = new BufferedReader(inReader);

	}

	/**
	 * 
	 * @throws IOException
	 */

	public static void getData() throws IOException {
		String line = reader.readLine(); // Seed

		String[] answerkey = new String[10]; // Store the answer key from the
												// first line of the txt file.

		for (int i = 0; i < answerkey.length; i++) { // take that line and place
														// each answer in an
														// array.

			answerkey[i] = line.substring(i, i + 1);
		}

		line = reader.readLine(); // read the following line of the txt file.

		while (line != null) { // Read and create a student for each line.
			String[] answers = new String[10];
			StringTokenizer strTkn = new StringTokenizer(line);
			String id = strTkn.nextToken();
			String answerline = strTkn.nextToken();

			for (int i = 0; i < answers.length; i++) {

				answers[i] = answerline.substring(i, i + 1);

			}

			Student stu = new Student(id, answers);

			stu.grade(answerkey, answers);

			classroom.add(stu);

			line = reader.readLine(); // updating what is being read

		}

	}

	/**
	 * In this method you should sort the classroom in ascending order depending
	 * on the score obtained on the quiz.
	 */

	public static void bubbleSort() {

		int comparisonResult;
		int classSize = classroom.size();
		int i = 0;
		boolean exchangeMade = true;

		while ((i < classSize) && exchangeMade) {
			exchangeMade = false;
			i++;

			for (int j = 0; j < classSize - i; j++) {

				Student firstStudent = classroom.get(j);
				Student secondStudent = classroom.get(j + 1);

				// compare j to j+1
				comparisonResult = firstStudent.compareTo(secondStudent);

				if (comparisonResult == Student.HIGHER) {
					// Student j+1 scored lower
					classroom.set(j, secondStudent);
					classroom.set(j + 1, firstStudent);
					exchangeMade = true;
				}
			}
		}
	}

	/**
	 * The quicksort body
	 * 
	 * @param left
	 *            - the lowest bound
	 * @param right
	 *            - the highest bound
	 */
	private static void quicksort(int left, int right) {

		int pivot = left;
		// the pivot is the leftmost unsorted student

		int storedIndex = pivot + 1;
		// it is compared to the value to the right

		for (int i = storedIndex; i < right; i++) {
			// keep comparing pivot with other elements

			if (classroom.get(i).getScore() < classroom.get(pivot).getScore()) {
				swap(i, storedIndex);
				storedIndex++;
				// if i is less than the pivot, it goes before the pivot and the
				// search
				// for small numbers keeps going
			}
		}
		swap(pivot, storedIndex - 1);
		// pivot goes after the things smaller than it

		if (pivot < storedIndex - 1) {
			quicksort(pivot, storedIndex - 1);
			// if the pivot is less than something, it goes before it

		}
		if (storedIndex < right) {
			quicksort(storedIndex, classroom.size());
		}
	}

	/**
	 * Exchanges the places of two students
	 * 
	 * @param i
	 * @param storedIndex
	 */

	private static void swap(int i, int storedIndex) {
		Collections.swap(classroom, i, storedIndex);
	}

	/**
	 * The mergesort body
	 * 
	 * @param startIndex - current smallest data point
	 * @param endIndex - current largest data point
	 * @param mid - midpoint
	 */

	private static void mergesort(int startIndex, int endIndex, int mid) {

		ArrayList<Student> mergedArray = new ArrayList<Student>();

		int leftPos = startIndex;
		int rightPos = mid + 1;

		while (leftPos <= mid && rightPos <= endIndex) {

			if (classroom.get(leftPos).getScore() <= classroom.get(rightPos).getScore()) {
				// if the left position is smaller, it goes into the new array
				// first
				mergedArray.add(classroom.get(leftPos));
				leftPos++;

			} else {
				// if the right position is smaller, it goes first
				mergedArray.add(classroom.get(rightPos));
				rightPos++;
			}
		}

		// Either of below while loop will execute
		while (leftPos <= mid) {
			mergedArray.add(classroom.get(leftPos));
			leftPos++;
		}

		while (rightPos <= endIndex) {
			mergedArray.add(classroom.get(rightPos));
			rightPos++;
		}

		int i = 0;
		int j = startIndex;

		// Copying the sorted array over top of the classroom + emptying it
		// might be more efficient to clear classroom
		// and set merge.getstudent() to classroom.getstudent() in a while loop

		while (i < mergedArray.size()) {
			classroom.set(j, mergedArray.get(i++));
			j++;
		}
	}

	/**
	 * divides the list into sections of 1
	 * 
	 * @param left - smallest index
	 * @param right - largest index
	 */

	private static void divide(int left, int right) {

		int mid = (left + right) / 2; // find the midpoint

		if ((left < right) && ((right - left) >= 1)) {

			divide(left, mid);
			divide(mid + 1, right);
			// keep making the divisions smaller, starting with two halves

			mergesort(left, right, mid);
			// now merge them
		}
	}
}
