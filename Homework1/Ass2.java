
public class Ass2 {

	public static void main(String[] args) {
		
		String employeeName = "Peter Medison";
		double grossSalary = 20000.0;
		
		double stateTaxRate = 0.284;
		double stateTaxes = grossSalary * stateTaxRate;
		stateTaxes = Math.round(stateTaxes);
		
		double personalTax = 0;
		double netSalary = 0;
		
		double grossSalaryAfterStateTaxes = grossSalary - stateTaxes;
		if (grossSalaryAfterStateTaxes > 7000) {
			double taxableIncome = grossSalaryAfterStateTaxes - 7000;
			personalTax = taxableIncome * 0.10;
		}
		
		personalTax = Math.round(personalTax);
		
		netSalary = grossSalary - stateTaxes - personalTax;
		
		System.out.println(" The employee: " + employeeName + " with Gross salary of: " + grossSalary + " MKD. will get NET salary: " + netSalary + " MKD." );
		System.out.println(" State taxes are: " + stateTaxes + " MKD. ");
		System.out.println(" Personal tax is: " + personalTax + " MKD. ");

	}

}
