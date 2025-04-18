package lib;

public class TaxFunction {
	private static final int BASE_EXCLUSION = 54000000;
	private static final int MARRIAGE_EXCLUSION = 4500000;
	private static final int CHILD_EXCLUSION = 1500000;
	private static final int MAX_WORKED = 12;
	private static final int MAX_CHILDREN = 3;

	
	/**
	 * Fungsi untuk menghitung jumlah pajak penghasilan pegawai yang harus dibayarkan setahun.
	 * 
	 * Pajak dihitung sebagai 5% dari penghasilan bersih tahunan (gaji dan pemasukan bulanan lainnya dikalikan jumlah bulan bekerja dikurangi pemotongan) dikurangi penghasilan tidak kena pajak.
	 * 
	 * Jika pegawai belum menikah dan belum punya anak maka penghasilan tidak kena pajaknya adalah Rp 54.000.000.
	 * Jika pegawai sudah menikah maka penghasilan tidak kena pajaknya ditambah sebesar Rp 4.500.000.
	 * Jika pegawai sudah memiliki anak maka penghasilan tidak kena pajaknya ditambah sebesar Rp 4.500.000 per anak sampai anak ketiga.
	 * 
	 */
	
	
	public static int calculateTax(int monthlySalary, int otherMonthlyIncome, int numberOfMonthWorking, int deductible, boolean isMarried, int numberOfChildren) {
		
		int tax = 0;
		
		if (numberOfMonthWorking > MAX_WORKED) {
			System.err.println("More than 12 month working per year");
		}
		
		if (numberOfChildren > MAX_CHILDREN) {
			numberOfChildren = 3;
		}

		int yearlyIncome = (monthlySalary + otherMonthlyIncome) * numberOfMonthWorking;
		
		if (isMarried) {
			tax = (int) Math.round(0.05 * (((yearlyIncome - (BASE_EXCLUSION + MARRIAGE_EXCLUSION + (numberOfChildren * CHILD_EXCLUSION))))));
		}else {
			tax = (int) Math.round(0.05 * (((yearlyIncome - BASE_EXCLUSION));
		}
		
		if (tax < 0) {
			return 0;
		}else {
			return tax;
		}
	}
	
}
