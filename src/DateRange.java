import java.util.Calendar;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class DateRange {

	final Calendar startDate;
	final Calendar endDate;
	
	DateRange(Calendar startDate, Calendar endDate){
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	boolean isInRange(LocalDateTime date) {
		
		return true;
	}

	
	@Override
	public String toString() {
		return "DateRange [startDate=" + startDate.getTime() + ", endDate=" + endDate.getTime() + "]";
	}

	static int getFirstDayOfMonth(Calendar date) {
		
		return 1;
	}
	static int getLastDayOfMonth(Calendar date) {
		date.add(Calendar.DATE, -1);  //sets end of month day
		return date.getTime().getDate();
	}
	
	
}
