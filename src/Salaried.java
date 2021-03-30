
public class Salaried extends Employee{
	double salary;

	Salaried(double salary){
		this.salary = salary;
	}
	@Override
	double calcGrossPay(DateRange dateRange) {
			
		return salary;
	}
}
