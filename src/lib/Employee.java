package lib;

import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;
import java.util.List;

public class Employee {

	private String employeeId;
	private int yearJoined;
	private int monthJoined;
	private int dayJoined;
	private boolean isForeigner;

	private PersonalInfo personalInfo;
	private SalaryInfo salaryInfo;
	private FamilyInfo familyInfo;
	
	public Employee(String employeeId, int yearJoined, int monthJoined, int dayJoined, boolean isForeigner, PersonalInfo personalInfo) {
		this.employeeId = employeeId;
		this.yearJoined = yearJoined;
		this.monthJoined = monthJoined;
		this.dayJoined = dayJoined;
		this.isForeigner = isForeigner;
		this.PersonalInfo = personalInfo;
	}
	
	public int getAnnualIncomeTax() {
		
		//Menghitung berapa lama pegawai bekerja dalam setahun ini, jika pegawai sudah bekerja dari tahun sebelumnya maka otomatis dianggap 12 bulan.
		LocalDate date = LocalDate.now();
		
		if (date.getYear() == yearJoined) {
			monthWorkingInYear = date.getMonthValue() - monthJoined;
		} else {
			monthWorkingInYear = 12;
		}
		
		return TaxFunction.calculateTax(monthlySalary, otherMonthlyIncome, monthWorkingInYear, annualDeductible, spouseIdNumber.equals(""), childIdNumbers.size());
	}
}
