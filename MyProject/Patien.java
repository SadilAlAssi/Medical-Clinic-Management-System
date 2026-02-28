package MyProject;

import java.time.LocalDate;
import java.util.*;

public class Patien {
	private String name;
	private LocalDate dateOfBirth;
	private String gender;
	private String city;
	private String occupation;
	private boolean hasInsurance;
	private ArrayList<Visit> visits;// To make the Association between them

	/*
	 * This is a contructer using fileds
	 */
	public Patien(String name, String dateOfBirth, String gender, String city, String occupation, String hasInsurance) {
		this.name = name;
		this.dateOfBirth = LocalDate.parse(dateOfBirth);// To change the value from String to LocalDate
		this.setGender(gender);
		this.city = city;
		this.occupation = occupation;
		this.setHasInsurance(hasInsurance);
		this.visits = new ArrayList<Visit>();
	}

	/*
	 * return the value of name because the filed is private
	 */
	public String getName() {
		return name;
	}

	/*
	 * set a value in name because the filed is private
	 */
	public void setName(String name) {
		this.name = name;
	}

	/*
	 * return the value of dateOfBirth because the filed is private
	 */
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	/*
	 * set a value in dateOfBirth because the filed is private
	 */
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = LocalDate.parse(dateOfBirth);// To change the value from String to LocalDate
	}

	/*
	 * return the value of gender because the filed is private
	 */
	public String getGender() {
		return gender;
	}

	/*
	 * set a value in gender because the filed is private بس هان لو دخل المستخدم
	 * الكلمة او اول حرف ،وبغض النظر عن حالة الحرف رح يوحج الكلمة للجميع
	 */
	public void setGender(String gender) {

		if (gender.equals("MALE") || gender.equals("M")) {
			this.gender = "MALE";
		} else if (gender.equals("FEMALE") || gender.equals("F")) {
			this.gender = "FEMALE";
		}
	}

	/*
	 * return the value of city because the filed is private
	 */
	public String getCity() {
		return city;
	}

	/*
	 * set a value in city because the filed is private
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/*
	 * return the value of occupation because the filed is private
	 */
	public String getOccupation() {
		return occupation;
	}

	/*
	 * set a value in occupation because the filed is private
	 */
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	/*
	 * return the value of hasInsurance because the filed is private
	 */
	public boolean isHasInsurance() {
		return hasInsurance;
	}

	/*
	 * set a value in hasInsurance because the filed is private بس هان لو دخل
	 * المستخدم ااي كلمة منهم رح يتثبت بالاخر true/false
	 */
	public void setHasInsurance(String hasInsurance) {
		if (hasInsurance.equalsIgnoreCase("true") || hasInsurance.equalsIgnoreCase("yes"))
			this.hasInsurance = true;
		else if (hasInsurance.equalsIgnoreCase("false") || hasInsurance.equalsIgnoreCase("no"))
			this.hasInsurance = false;
	}

	/*
	 * return the values of visits because the filed is private
	 */
	public ArrayList<Visit> getVisits() {
		return visits;
	}

	/*
	 * add new visit in ArrayList(visits)
	 */
	public void addVisit(Visit visit) {
		this.visits.add(visit);
	}

	public void patienTnfo() {
		System.out.println("      Patien Information     ");
		System.out.println("Name: " + this.name);
		System.out.println("Date of Birth: " + this.dateOfBirth);
		System.out.println("Gender: " + this.gender);
		System.out.println("City: " + this.city);
		System.out.println("Occupation: " + this.occupation);
		System.out.println("Does Has an Insurance? " + this.hasInsurance);
		System.out.println("Number of visits: " + this.visits.size());
		System.out.println("      The vists for the Patien ");
		if (this.visits.isEmpty())
			System.out.println("Patien " + this.name + " don't have visits");
		else {
			for (int i = 0; i < this.visits.size(); i++) {
				System.out.println("visit " + (i + 1));
				this.visits.get(i).generateReport();
			}
			System.out.println();
		}

	}

}
