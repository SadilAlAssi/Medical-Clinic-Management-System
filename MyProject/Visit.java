package MyProject;

import java.time.LocalDate;

public abstract class Visit implements Reportable {
	private LocalDate visitDate;
	private String symptems;
	private String diagnosis;
	private Clinic clinic;
	private Patien patien;

	/*
	 * This is a contructer using fileds
	 */
	public Visit(String visitDate, String symptems, String diagnosis, Clinic clinic, Patien patien) {
		this.visitDate = LocalDate.parse(visitDate);// To change the value from String to LocalDate
		this.symptems = symptems;
		this.diagnosis = diagnosis;
		this.clinic = clinic;
		this.patien = patien;
	}

	/*
	 * return the value of visitDate because the filed is private
	 */
	public LocalDate getVisitDate() {
		return visitDate;
	}

	/*
	 * set a value in visitDate because the filed is private
	 */
	public void setVisitDate(String visitDate) {
		this.visitDate = LocalDate.parse(visitDate);// To change the value from String to LocalDate
	}

	/*
	 * return the value of symptems because the filed is private
	 */
	public String getSymptems() {
		return symptems;
	}

	/*
	 * set a value in symptems because the filed is private
	 */
	public void setSymptems(String symptems) {
		this.symptems = symptems;
	}

	/*
	 * return the value of diagnosis because the filed is private
	 */
	public String getDiagnosis() {
		return diagnosis;
	}

	/*
	 * set a value in diagnosis because the filed is private
	 */
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	/*
	 * return the value of clinic because the filed is private
	 */
	public Clinic getClinic() {
		return clinic;
	}

	/*
	 * set a value in clinic because the filed is private
	 */
	public void setClinic(Clinic clinic) {
		this.clinic = clinic;
	}

	/*
	 * return the value of patien because the filed is private
	 */
	public Patien getPatien() {
		return patien;
	}

	/*
	 * set a value in patien because the filed is private
	 */
	public void setPatien(Patien patien) {
		this.patien = patien;
	}

}
