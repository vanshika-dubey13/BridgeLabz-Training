//Creating a class to calculate zara annual bonus

import java.text.DecimalFormat;
public class ZaraBonusSystem {

	static final int employees = 10;

	public static void main(String[] args) {

		// Generating arrays
		double[][] employeeData = generateEmployeeData();
		double[][] updatedData = calculateBonusAndNewSalary(employeeData);
		// Displaying results and totals
		displayReport(employeeData, updatedData);
	}

	// Generating salary and years of service
	public static double[][] generateEmployeeData() {
		// [salary, years of service]
		double[][] data = new double[employees][2]; // [salary, years of service]

		for (int i = 0; i < employees; i++) {
			// 5-digit salary (10000 to 99999)
			data[i][0] = 10000 + Math.random() * 90000;

			// Years of service (0 to 10)
			data[i][1] = (int) (Math.random() * 11);
		}
		return data;
	}

	// Method 2: Calculate bonus and new salary
	public static double[][] calculateBonusAndNewSalary(double[][] data) {
		double[][] updated = new double[employees][2]; // [bonus, new salary]

		for (int i = 0; i < employees; i++) {
			double salary = data[i][0];
			int years = (int) data[i][1];
			double bonusRate;

			if (years > 5) {
				bonusRate = 0.05; // 5% bonus
			} else {
				bonusRate = 0.02; // 2% bonus
			}

			double bonus = salary * bonusRate;
			double newSalary = salary + bonus;

			updated[i][0] = bonus;
			updated[i][1] = newSalary;
		}
		return updated;
	}

	// Method 3: Display table and totals
	public static void displayReport(double[][] oldData, double[][] newData) {

		DecimalFormat df = new DecimalFormat("0.00");

		double totalOldSalary = 0;
		double totalNewSalary = 0;
		double totalBonus = 0;

		System.out.println("ZARA EMPLOYEE BONUS REPORT");
		System.out.printf("%-5s %-12s %-10s %-12s %-12s%n",
				"ID", "Old Salary", "Years", "Bonus", "New Salary");
		System.out.println("---------------------------------------------------------------");

		for (int i = 0; i < employees; i++) {
			double oldSalary = oldData[i][0];
			int years = (int) oldData[i][1];
			double bonus = newData[i][0];
			double newSalary = newData[i][1];

			totalOldSalary += oldSalary;
			totalBonus += bonus;
			totalNewSalary += newSalary;

			System.out.printf("%-5d %-12s %-10d %-12s %-12s%n",
					(i + 1), df.format(oldSalary), years, df.format(bonus), df.format(newSalary));
		}

		System.out.println("TOTAL OLD SALARY  : " + df.format(totalOldSalary));
		System.out.println("TOTAL BONUS PAID : " + df.format(totalBonus));
		System.out.println("TOTAL NEW SALARY : " + df.format(totalNewSalary));
	}
}
