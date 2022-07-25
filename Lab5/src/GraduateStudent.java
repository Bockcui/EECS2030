import java.util.Date;

public class GraduateStudent extends Student{
	private String Supervisor;

	public GraduateStudent(String string, Date date, String string2) {
		super(string, date, string2);
		// TODO Auto-generated constructor stub
	}

	public void setThesisSupervisor(String supervisor) {
		this.Supervisor = supervisor;
		// TODO Auto-generated method stub
		
	}

	public String getThesisSupervisor() {
		// TODO Auto-generated method stub
		return this.Supervisor;
	}
}
