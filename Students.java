package students;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("Student id "+id);
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("Student id "+id+" and Student name "+name);
	}
	public void getStudentInfo(String email, int phoneNumber) {
		System.out.println("Student Email address "+email+" and Student contact number "+phoneNumber);
	}
public static void main(String[] args) {
		
	Students info = new Students();

info.getStudentInfo(22);
info.getStudentInfo(23, "Abi");
info.getStudentInfo("Raj@yahoo.com", 99999999);

	}
}
