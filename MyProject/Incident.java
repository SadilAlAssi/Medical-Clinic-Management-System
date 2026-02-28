package MyProject;

public class Incident extends Visit {
	private String Severity;
	private String bodyPart;

	/*
	 * This is a contructer using fileds and it's contains a super contructer
	 */
	public Incident(String visitDate, String symptems, String diagnosis, Clinic clinic, Patien patien, String severity,
			String bodyPart) {
		super(visitDate, symptems, diagnosis, clinic, patien);
		this.setSeverity(severity);
		this.bodyPart = bodyPart;
	}

	/*
	 * return the value of Severity because the filed is private
	 */
	public String getSeverity() {
		return Severity;
	}

	/*
	 * set a value in Severity because the filed is private but the world become
	 * upperCase
	 */
	public void setSeverity(String severity) {
		this.Severity = severity.toUpperCase();
	}

	/*
	 * return the value of bodyPart because the filed is private
	 */
	public String getBodyPart() {
		return bodyPart;
	}

	/*
	 * set a value in bodyPart because the filed is private
	 */
	public void setBodyPart(String bodyPart) {
		this.bodyPart = bodyPart;
	}

	/*
	 * this implements to the method in the interface print visit&Incident
	 * Information as a report
	 */
	public void generateReport() {
		System.out.println("      Incident Rrport ");
		System.out.println("Visit Date: " + super.getVisitDate());
		System.out.println("The Symptems: " + super.getSymptems());
		System.out.println("The Diagnosis: " + super.getDiagnosis());

		if (super.getClinic() != null)
			System.out.println("Clinic: " + super.getClinic().getName());

		if (super.getPatien() != null)
			System.out.println("Patien Name: " + super.getPatien().getName());

		System.out.println("Severity: " + this.Severity);
		System.out.println("Body Part: " + this.bodyPart);
		System.out.println();
	}

}
