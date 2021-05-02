package bankInfo;

public class AxisBank extends BankInfo {

	public void deposit() {
		
		System.out.println("deposit above 2000");
	}
	
	public static void main(String[] args) {
		
		AxisBank info = new AxisBank();

info.deposit();
info.saving();
info.fixed();

	}
}
