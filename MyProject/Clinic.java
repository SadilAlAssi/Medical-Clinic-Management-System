package MyProject;

import java.util.*;

public class Clinic {
	private String name;
	private String locatoin;
	private String telphone;
	private ArrayList<Visit> visits;// To make the Association between them

	/*
	 * This is a contructer using fileds
	 */
	public Clinic(String name, String locatoin, String telphone) {
		this.name = name;
		this.locatoin = locatoin;
		this.telphone = telphone;
		this.visits = new ArrayList<>();
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
	 * return the value of locatoin because the filed is private
	 */
	public String getLocatoin() {
		return locatoin;
	}

	/*
	 * set a value in locatoin because the filed is private
	 */
	public void setLocatoin(String locatoin) {
		this.locatoin = locatoin;
	}

	/*
	 * return the value of telphone because the filed is private
	 */
	public String getTelphone() {
		return telphone;
	}

	/*
	 * set a value in telphone because the filed is private
	 */
	public void setTelphone(String telphone) {
		this.telphone = telphone;
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
	public void addVisits(Visit visit) {
		this.visits.add(visit);
	}

	/*
	 * method to print Clinic Information
	 */
	public void ClinicTnfo() {
		System.out.println("      Clinic Information     ");
		System.out.println("Name: " + this.name);
		System.out.println("Location: " + this.locatoin);
		System.out.println("Telphone: " + this.telphone);
		System.out.println("Number of visits in total: " + this.visits.size());
		System.out.println();
	}

}
