package MyProject;

public class BloodTest extends Visit {
	private double RBC;
	private double WBC;
	private double PLT;

	/*
	 * This is a contructer using fileds and it's contains a super contructer
	 */
	public BloodTest(String visitDate, String symptems, String diagnosis, Clinic clinic, Patien patien, double RBC,
			double WBC, double PLT) {
		super(visitDate, symptems, diagnosis, clinic, patien);
		this.RBC = Math.abs(RBC);// to ignore the negative
		this.WBC = Math.abs(WBC);// to ignore the negative
		this.PLT = Math.abs(PLT);// to ignore the negative
	}

	/*
	 * return the value of RBC because the filed is private
	 */
	public double getRBC() {
		return RBC;
	}

	/*
	 * set a value in RBC because the filed is private
	 */
	public void setRBC(double RBC) {
		this.RBC = Math.abs(RBC);// to ignore the negative
	}

	/*
	 * return the value of WBC because the filed is private
	 */
	public double getWBC() {
		return WBC;
	}

	/*
	 * set a value in WBC because the filed is private
	 */
	public void setWBC(double WBC) {
		this.WBC = Math.abs(WBC);// to ignore the negative
	}

	/*
	 * return the value of PLT because the filed is private
	 */
	public double getPLT() {
		return PLT;
	}

	/*
	 * set a value in PLT because the filed is private
	 */
	public void setPLT(double PLT) {
		this.PLT = Math.abs(PLT);// to ignore the negative
	}

	/*
	 * this implements to the method in the interface print visit&Blood Test
	 * Information as a report
	 */
	public void generateReport() {
		System.out.println("     Blood Test Rrport ");
		System.out.println("Visit Date: " + super.getVisitDate());
		System.out.println("The Symptems: " + super.getSymptems());
		System.out.println("The Diagnosis: " + super.getDiagnosis());

		if (super.getClinic() != null)
			System.out.println("Clinic: " + super.getClinic().getName());

		if (super.getPatien() != null)
			System.out.println("Patien Name: " + super.getPatien().getName());

		System.out.println("RBC : " + this.RBC + "M/µL");
		System.out.println("WBC : " + this.WBC + "K/µL");
		System.out.println("PLT : " + this.PLT + "K/µL");
		System.out.println();
	}

}
