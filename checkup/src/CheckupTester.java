/** Miles Cumiskey
 *  CSC 220
 *  Program that tests the Checkup class
 */
public class CheckupTester {
	public static void main (String [] args){
		Checkup patient1 = new Checkup(1, 2, 3, 4, 5);
		System.out.println(patient1.toString());
		
		Checkup patient2 = new Checkup(999, 2, 3, 4, 5);
		
		patient2.setPatientNo(2);
		patient2.setDiastolic(120);
		patient2.setSystolic(80);
		patient2.setHDL(100);
		patient2.setLDL(60);
		
		System.out.println(patient2.getPatientNo());
		System.out.println(patient2.getDiastolic());
		System.out.println(patient2.getSystolic());
		System.out.println(patient2.getHDL());
		System.out.println(patient2.getLDL());


	}
}
