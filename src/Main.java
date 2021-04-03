import java.util.Calendar;

public class Main {

	public static void main(String[] args) {
		Employee hourly = new Hourly(180,100);
			
		hourly.paychecks.add(hourly.calcCompensation(2,2021));
		hourly.print();
		
		Employee salaried = new Salaried(1000);
		
		salaried.paychecks.add(salaried.calcCompensation(2,2021));
		salaried.print();
		
		Employee comissioned = new Comissioned(3,1000);
		comissioned.paychecks.add(comissioned.calcCompensation(2,2021));
		comissioned.print();
		
	}
	
}
