import java.util.Date;

public class Student extends Person {

	public Student(String string, Date date, String string2) {
		super(string, date, string2);
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		return String.format("Student\nName: %s\nDOB: %s\nStudent Number: %s\n", this.Name, this.Date, this.Number);
	}
}
