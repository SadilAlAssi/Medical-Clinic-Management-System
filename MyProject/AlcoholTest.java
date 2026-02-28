package MyProject;

public class AlcoholTest extends Visit {
	private double bloodAlcoholConcentration;
	private String testResult;

	/*
	 * This is a contructer using fileds and it's contains a super contructer
	 */
	public AlcoholTest(String visitDate, String symptems, String diagnosis, Clinic clinic, Patien patien,
			double bloodAlcoholConcentration) {
		super(visitDate, symptems, diagnosis, clinic, patien);
		this.setBloodAlcoholConcentration(bloodAlcoholConcentration);
	}

	/*
	 * return the value of bloodAlcoholConcentration because the filed is private
	 */
	public double getBloodAlcoholConcentration() {
		return bloodAlcoholConcentration;
	}

	/*
	 * set a values in bloodAlcoholConcentration&testResult because the filed is
	 * private
	 */
	public void setBloodAlcoholConcentration(double bloodAlcoholConcentration) {
		this.bloodAlcoholConcentration = bloodAlcoholConcentration;
		if (bloodAlcoholConcentration > 0.08)// اسناد القيمة لنتيجة الفحص وفق نسبة الكحول بالدم
			this.testResult = "POSITIVE";
		else
			this.testResult = "NEGATIVE";
	}

	/*
	 * return the value of testResult because the filed is private
	 */
	public String getTestResult() {
		return testResult;
	}

	/*
	 * this implements to the method in the interface print visit&Alchohol
	 * Information as a report
	 */
	public void generateReport() {
		System.out.println("     Alchohol Test Rrport ");
		System.out.println("Visit Date: " + super.getVisitDate());
		System.out.println("The Symptems: " + super.getSymptems());
		System.out.println("The Diagnosis: " + super.getDiagnosis());

		if (super.getClinic() != null)
			System.out.println("Clinic: " + super.getClinic().getName());

		if (super.getPatien() != null)
			System.out.println("Patien Name: " + super.getPatien().getName());

		System.out.println("Blood Alcohol Concentration: " + this.bloodAlcoholConcentration);
		System.out.println("Test Result: " + this.testResult);
		System.out.println();
	}

}
