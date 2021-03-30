
public class Hourly extends Employee{
	
	private double hourlyWage;
	private int hoursPerWeek;
	
	public Hourly(double hourlyWage, int hoursPerWeek) {
		super();
		this.hourlyWage = hourlyWage;
		this.hoursPerWeek = hoursPerWeek;
		
	}

	@Override
	double calcGrossPay(DateRange dateRange) {
		
		int firstDay = dateRange.getFirstDayOfMonth(dateRange.startDate);
		int lastDay = dateRange.getLastDayOfMonth(dateRange.endDate);
		
		int totalDays = lastDay - firstDay;
		double totalWage = hoursPerWeek / 7 * totalDays * hourlyWage;
		return totalWage;
		
	}
	
}
