
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

abstract class Employee {

	private String empId;
	List<PayCheck> paychecks;
	
	Employee(){
		paychecks = new ArrayList<PayCheck>();
	}
	
	PayCheck calcCompensation(int month, int year) {
		Calendar calendar = Calendar.getInstance();
		calendar.clear();
		calendar.set(Calendar.MONTH, month);
		
		DateRange dateRange = new DateRange(calendar, calendar);
		
		double grossPay = calcGrossPay(dateRange);
		double fica = 0.23 * grossPay;
		double state = 0.05 * grossPay;
		double local = 0.01 * grossPay;
		double medicare = 0.03 * grossPay;
		double socialSecurity = 0.075 * grossPay;
		return new PayCheck(grossPay, fica, state,local,medicare,socialSecurity,dateRange);
		
	}
	
	void print() {
		for(PayCheck paycheck: paychecks) {
			paycheck.print();
		}
	}
	
	abstract double calcGrossPay(DateRange dateRange);

}