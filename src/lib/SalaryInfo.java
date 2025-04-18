package lib;

public class SalaryInfo {
  private int monthlySalary;
	private int otherMonthlyIncome;
	private int annualDeductible;
	private int monthWorkingInYear;

  private Employee employee;
	
  public SalaryInfo(int monthlySalary, int otherMonthlyIncome, int annualDeductible, int monthWorkingInYear) {
    this.monthlySalary = monthlySalary;
    this.otherMonthlyIncome = otherMonthlyIncome;
    this.annualDeductible = annualDeductible;
    this.monthWorkingInYear = monthWorkingInYear; 
  }

  /**
	 * Fungsi untuk menentukan gaji bulanan pegawai berdasarkan grade kepegawaiannya (grade 1: 3.000.000 per bulan, grade 2: 5.000.000 per bulan, grade 3: 7.000.000 per bulan)
	 * Jika pegawai adalah warga negara asing gaji bulanan diperbesar sebanyak 50%
	 */

  public int getBaseSalary(int grade) { 
    return switch (grade) {
      case 1 -> 3000000;
      case 2 -> 5000000;
      case 3 -> 7000000;
    };
  }
	
	public void setMonthlySalary(int grade) {
    int baseSalary = getBaseSalary(grade);
    
		if(!employee.isForeigner) {
      baseSalary *= 1.5;
    }

    monthlySalary = baseSalary;
	}

  public int getMonthlySalary() { return monthlySalary; }
  public int getOtherMonthlyIncome() { return otherMonthlyIncome; }
  public int getAnnualDeductible() { return annualDeductible; }
  public int getMonthWorkingInYear() { return monthWorkingInYear; }

  public void setOtherMonthlyIncome(int otherMonthlyIncome) { this.otherMonthlyIncome = otherMonthlyIncome; }
  public void setAnnualDeductible(int annualDeductible) { this.annualDeductible = annualDeductible; }
  public void setMonthWorkingInYear(int monthWorkingInYear) { this.monthWorkingInYear = monthWorkingInYear; }
}