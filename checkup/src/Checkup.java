/** Miles Cumiskey
 *  CSC 220
 *  Program that holds a variety of information about a patient, with methods
 *  to access and modify the information
 */
public class Checkup {
	public int patientNumber;
	public int systolicBloodPres;
	public int diastolicBloodPres;
	public int ldlCholesterol, hdlCholesterol;


	public Checkup(int patientNumber, int systolicBloodPres, int diastolicBloodPres, int ldlCholesterol, int hdlCholesterol) {
		this.patientNumber = patientNumber;
		this.systolicBloodPres = systolicBloodPres;
		this.diastolicBloodPres = diastolicBloodPres;
		this.ldlCholesterol = ldlCholesterol;
		this.hdlCholesterol = hdlCholesterol;
	}
	
	public int getPatientNo() {
		return patientNumber;
	}

	public void setPatientNo(int patNo) {
		patNo = patientNumber;
	}

	public int getSystolic() {
		return systolicBloodPres;
	}

	public void setSystolic(int sysPres) {
		sysPres = systolicBloodPres;
	}

	public int getDiastolic() {
		return diastolicBloodPres;
	}

	public void setDiastolic(int disPres) {
		disPres = diastolicBloodPres;
	}

	public int getLDL() {
		return ldlCholesterol;
	}

	public void setLDL(int ldl) {
		ldl = ldlCholesterol;
	}

	public int getHDL() {
		return ldlCholesterol;
	}

	public void setHDL(int hdl) {
		hdl = hdlCholesterol;
	}
	
	public double computeRatio(){
		double ratio;
		ratio = this.ldlCholesterol / this.hdlCholesterol; 
		return ratio;
	}
	
	public String toString() {
		return "Patient No: " + this.getPatientNo() + "\n  Systolic Blood Pressure: " + this.getSystolic() 
				+ "\n  Diastolic Blood Pressure: " + this.getDiastolic() + "\n  LDL Cholesterol: " 
				+ this.getLDL() + "\n  HDL Cholesterol: " + this.getHDL() + "\n Cholesterol Ratio: "
				+ computeRatio() 
				+ "\nHDL is known as “good cholesterol” and that a ratio of 3.5 or lower is considered optimum.";
	}
}
