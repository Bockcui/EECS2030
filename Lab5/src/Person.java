import java.util.Date;

public class Person {
	protected String Name;
	protected Date Date;
	protected String Number;

	public Person(String name, Date date) {
		this.Name = name;
		this.Date = date;
		// TODO Auto-generated constructor stub
	}

	public Person(String name, Date date, String number) {
		this.Name = name;
		this.Date = date;
		this.Number =number; 
		// TODO Auto-generated constructor stub
	}

	public Date getDob() {
		// TODO Auto-generated method stub
		return this.Date;
	}
	
	public String toString() {
		return String.format("Name: %s\nDOB: %s\n", this.Name, this.Date);
		
	}
	
	


}
