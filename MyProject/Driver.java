/*
 * Sadil Al-Assi
 * 1240822
 * Lab8
 */
package MyProject;

import java.util.*;

public class Driver {
	private static Scanner input = new Scanner(System.in);
	private static ArrayList<Patien> patiens = new ArrayList<>();// عشان اوصلها وين ما بدي بدون ما ابعثها عشان هيك مش
																	// جوا الmain method
	private static ArrayList<Clinic> clinics = new ArrayList<Clinic>();

	public static void main(String[] args) {
		boolean x = true;
		/*
		 * إعادة تشغيل الخيارات حتى احتيارخروج
		 */
		while (x) {
			menu();
			int option = input.nextInt();
			input.nextLine();// عشان المدخلات الي بعد الخيار نصوص لاضمن يقرءهن بشكل صحيح
			switch (option) {
			case 1:
				newBloodTestVisit();
				break;
			case 2:
				newAlcoholTestVisit();
				break;
			case 3:
				newIncidentVisit();
				break;
			case 4:
				newImmunizationVisit();
				break;
			case 5:
				printPatienVisitInfo();
				break;
			case 6:
				System.out.println("Exiting System...");
				x = false;
				break;
			default:
				System.out.println("Enter option number from(1-6):");
			}

		}
		input.close();
	}

	/*
	 * بتطبع الخيارات بس
	 */
	private static void menu() {
		System.out.println("   Medical Clinic Management System");
		System.out.println("1.New Boold Test Visit");
		System.out.println("2.New Alcohol Test Visit");
		System.out.println("3.New Incident Visit");
		System.out.println("4.New Immunization visit");
		System.out.println("5.Print Patien Visit Information");
		System.out.println("6.Exit");
		System.out.println("Enter your option: ");

	}

	/*
	 * بتبجث عن المريض حسب الاسم مش موجود بتخلق اله كائن وبتضيفه على المصفوفة
	 * الديناماكية
	 */
	private static Patien patienFound() {
		System.out.println("Enter Patien Name: ");
		String name = input.nextLine();
		/*
		 * البحث عن المريض بناءً على الاسم المدخل وبترجعه
		 */
		for (Patien patien : patiens) {
			if (patien.getName().equalsIgnoreCase(name)) {
				return patien;
			}
		}

		/*
		 * اذا طلع مش موجود بتم خلق كاءن اله وبتضيفه على المصفوفة الديناميكية وبترجعه
		 */
		System.out.println("This Patien isn't founded in the system.Add new Patien ");
		System.out.println("Date of Birth(yyyy-MM-dd): ");
		String dateOfBirth = input.nextLine();
		System.out.println("Gender(MALE/FEMALE): ");
		String gender = input.nextLine();
		System.out.println("The City: ");
		String city = input.nextLine();
		System.out.println("The Occupation: ");
		String occupation = input.nextLine();
		System.out.println("Has Insurance(YES/NO): ");
		String hasInsurance = input.nextLine();

		Patien patien = new Patien(name, dateOfBirth, gender, city, occupation, hasInsurance);
		patiens.add(patien);
		return patien;
	}

	/*
	 * بتبجث عن العيادة حسب الاسم مش موجود بتخلق اله كائن وبتضيفه على المصفوفة
	 * الديناماكية
	 */
	private static Clinic clinicFound() {
		System.out.println("Enter Clinic Name: ");
		String name = input.nextLine();

		/*
		 * البحث عن العيادة بناءً على الاسم المدخل وبترجعه
		 */
		for (Clinic clinic : clinics) {
			if (clinic.getName().equalsIgnoreCase(name)) {
				return clinic;
			}
		}

		/*
		 * اذا طلع مش موجود بتم خلق كاءن اله وبتضيفه على المصفوفة الديناميكية وبترجعه
		 */
		System.out.println("This Clinic isn't in the system,Add new Clinic ");
		System.out.println("Location: ");
		String location = input.nextLine();
		System.out.println("Telphone: ");
		String telphone = input.nextLine();

		Clinic clinic = new Clinic(name, location, telphone);
		clinics.add(clinic);
		return clinic;
	}

	/*
	 * انشاء كائن من نوع BloodTest لذي يرث من Visit وطباعة تقريره
	 */
	private static void newBloodTestVisit() {
		System.out.println();
		System.out.println("New Blood Test Visit");
		Patien patien = patienFound();
		Clinic clinic = clinicFound();
		System.out.println("Visit Date(yyyy-MM-dd): ");
		String visitDate = input.nextLine();
		System.out.println("The Symptems: ");
		String symptems = input.nextLine();
		System.out.println("The Diagnosis: ");
		String diagnosis = input.nextLine();
		System.out.println("RBC(M/µL): ");
		double RBC = input.nextDouble();
		System.out.println("WBC(K/µL): ");
		double WBC = input.nextDouble();
		System.out.println("PLT(K/µL): ");
		double PLT = input.nextDouble();

		BloodTest bt = new BloodTest(visitDate, symptems, diagnosis, clinic, patien, RBC, WBC, PLT);
		patien.addVisit(bt);// اضافة الزيارة الجديدة لزيارات المريض
		clinic.addVisits(bt);// اضافة الزيارة الجديدة لزيارات العيادة

		System.out.println("Blood Test addes");
		System.out.println();
		bt.generateReport();
	}

	/*
	 * انشاء كائن من نوع AlcoholTest لذي يرث من Visit وطباعة تقريره
	 */
	private static void newAlcoholTestVisit() {
		System.out.println();
		System.out.println("New Alcohol Test Visit");
		Patien patien = patienFound();
		Clinic clinic = clinicFound();
		System.out.println("Visit Date(yyyy-MM-dd): ");
		String visitDate = input.nextLine();
		System.out.println("The Symptems: ");
		String symptems = input.nextLine();
		System.out.println("The Diagnosis: ");
		String diagnosis = input.nextLine();
		System.out.println("Blood Alcohol Concentration(%): ");
		double bloodAlcoholConcentration = input.nextDouble();

		AlcoholTest at = new AlcoholTest(visitDate, symptems, diagnosis, clinic, patien, bloodAlcoholConcentration);
		patien.addVisit(at);// اضافة الزيارة الجديدة لزيارات المريض
		clinic.addVisits(at);// اضافة الزيارة الجديدة لزيارات العيادة

		System.out.println("Alcohol Test addes");
		System.out.println();
		at.generateReport();
	}

	/*
	 * انشاء كائن من نوع Incident لذي يرث من Visit وطباعة تقريره
	 */
	private static void newIncidentVisit() {
		System.out.println();
		System.out.println("New Incident Visit");
		Patien patien = patienFound();
		Clinic clinic = clinicFound();
		System.out.println("Visit Date(yyyy-MM-dd): ");
		String visitDate = input.nextLine();
		System.out.println("The Symptems: ");
		String symptems = input.nextLine();
		System.out.println("The Diagnosis: ");
		String diagnosis = input.nextLine();
		System.out.println("The Severity(LOW/MEDIUM/HIGH): ");
		String severity = input.nextLine();
		System.out.println("Body Part: ");
		String bodyPart = input.nextLine();

		Incident incident = new Incident(visitDate, symptems, diagnosis, clinic, patien, severity, bodyPart);
		patien.addVisit(incident);// اضافة الزيارة الجديدة لزيارات المريض
		clinic.addVisits(incident);// اضافة الزيارة الجديدة لزيارات العيادة

		System.out.println("Incident addes");
		System.out.println();
		incident.generateReport();
	}

	/*
	 * انشاء كائن من نوع Immunization لذي يرث من Visit وطباعة تقريره
	 */
	private static void newImmunizationVisit() {
		System.out.println();
		System.out.println("New Immunization Visit");
		Patien patien = patienFound();
		Clinic clinic = clinicFound();
		System.out.println("Visit Date(yyyy-MM-dd): ");
		String visitDate = input.nextLine();
		System.out.println("The Symptems: ");
		String symptems = input.nextLine();
		System.out.println("The Diagnosis: ");
		String diagnosis = input.nextLine();
		System.out.println("The Vaccine: ");
		String vaccine = input.nextLine();
		System.out.println("dose: ");
		int dose = input.nextInt();

		Immunization immunization = new Immunization(visitDate, symptems, diagnosis, clinic, patien, vaccine, dose);
		patien.addVisit(immunization);// اضافة الزيارة الجديدة لزيارات المريض
		clinic.addVisits(immunization);// اضافة الزيارة الجديدة لزيارات العيادة

		System.out.println("Immunization addes");
		System.out.println();
		immunization.generateReport();
	}

	/*
	 * طباعة معلومات المريض بناءً على الاسم
	 */
	private static void printPatienVisitInfo() {
		System.out.println();
		System.out.println("Enter Patien Name:");
		String name = input.nextLine();
		boolean x = true;

		for (Patien patien : patiens) {
			if (patien.getName().equalsIgnoreCase(name)) {
				patien.patienTnfo();
				x = false;
				break;
			}
		}

		if (x) {
			System.out.println("Ther's no Patien name " + name);
		}

	}

}
