import java.util.Date;

public class HourlyEmployee extends Employee {
	private double Rate;

	public HourlyEmployee(String string, Date date, String string2) {
		super(string, date, string2);
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		return String.format("Employee\nName: %s\nDOB: %s\nEmployee Number: %s\nHourly rate: %s\n", this.Name, this.Date, this.Number, String.format("%.1f", this.Rate));
	}
}
