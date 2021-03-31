
public class PayCheck {

	final double grossPay;
	final double fica;
	final double state;
	final double local;
	final double medicare;
	final double socialSecurity;
	final DateRange payPeriod;
	Employee employee;
	
	public PayCheck(double grossPay, double fica, double state, double local, double medicare, double socialSecurity,
			DateRange payPeriod, Employee emp) {
		super();
		this.grossPay = grossPay;
		this.fica = fica;
		this.state = state;
		this.local = local;
		this.medicare = medicare;
		this.socialSecurity = socialSecurity;
		this.payPeriod = payPeriod;
		this.employee = emp;
	}

	void print() {
		System.out.println(this);
	}
	
	@Override
	public String toString() {
		return "PayCheck [grossPay=$" + grossPay + ", fica=$" + fica + ", state=$" + state + ", local=$" + local
				+ ", medicare=$" + medicare + ", socialSecurity=$" + socialSecurity + ", payPeriod=" + payPeriod + "]";
	}

	void getNetPay() {
		
	}
	
	
	
		
	
}
