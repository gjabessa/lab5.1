import java.util.ArrayList;
import java.util.List;

public class Comissioned extends Employee{
	double comission;
	double baseSalary;
	
	List<Order> orders;
	
	Comissioned(double comission, double baseSalary){
		this.baseSalary = baseSalary;
		this.comission = comission;
		orders = new ArrayList<Order>();
	}
	@Override
	double calcGrossPay(DateRange dateRange) {
		double totalOrderAmounts = 0;
		for(Order order: orders) {
			totalOrderAmounts += order.orderAmount;
		}
		double totalComissioned = totalOrderAmounts * comission/100;
		
		return totalComissioned + baseSalary;
	}
}
