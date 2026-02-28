package MyProject;

public class Immunization extends Visit {
	private String vaccine;
	private int dose;

	/*
	 * This is a contructer using fileds and it;s contains a super contructer
	 */
	public Immunization(String visitDate, String symptems, String diagnosis, Clinic clinic, Patien patien,
			String vaccine, int dose) {
		super(visitDate, symptems, diagnosis, clinic, patien);
		this.vaccine = vaccine;
		this.dose = Math.abs(dose);// to ignore the negative
	}

	/*
	 * return the value of vaccine because the filed is private
	 */
	public String getVaccine() {
		return vaccine;
	}

	/*
	 * set a value in vaccine because the filed is private
	 */
	public void setVaccine(String vaccine) {
		this.vaccine = vaccine;
	}

	/*
	 * return the value of dose because the filed is private
	 */
	public int getDose() {
		return dose;
	}

	/*
	 * set a value in dose because the filed is private
	 */
	public void setDose(int dose) {
		this.dose = Math.abs(dose);// to ignore the negative
	}

	/*
	 * this implements to the method in the interface print visit&Immunization
	 * Information as a report
	 */

	public void generateReport() {
		System.out.println("     Immunization Rrport ");
		System.out.println("Visit Date: " + super.getVisitDate());
		System.out.println("The Symptems: " + super.getSymptems());
		System.out.println("The Diagnosis: " + super.getDiagnosis());

		if (super.getClinic() != null)
			System.out.println("Clinic: " + super.getClinic().getName());

		if (super.getPatien() != null)
			System.out.println("Patien Name: " + super.getPatien().getName());

		System.out.println("Vaccine: " + this.vaccine);
		System.out.println("Dose: " + this.dose);
		System.out.println();
	}

}
