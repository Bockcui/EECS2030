import java.util.Date;

public class SalariedEmployee extends Employee {
	private double salary;

	public SalariedEmployee(String string, Date date, String string2) {
		super(string, date, string2);
		// TODO Auto-generated constructor stub
	}

	public void setSalary(double i) {
		// TODO Auto-generated method stub
		this.salary = i;
	}
	
	public String toString() {
		return String.format("Employee\nName: %s\nDOB: %s\nEmployee Number: %s\nSalary: %s\n", this.Name, this.Date, this.Number, String.format("%.1f", this.salary));
	}
}
