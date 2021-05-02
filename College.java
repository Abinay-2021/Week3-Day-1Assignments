package universityAssignment;



public class College extends University {

	@Override
	public void ug() {
		System.out.println("UG was unimplemented method ");	
	}
public static void main(String[] args) {
		
College info1 = new College();

info1.pg();
info1.ug();


	}
}
