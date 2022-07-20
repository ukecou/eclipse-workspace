package jp.co.seraku.serabank;

public class Attendant extends Employee {
	
	public Attendant (int code, String name) {
		super(code, name, 3000);
	}
		
		public void doPayment() {
			System.out.println("Do payment");
		}
		
		int getBonus() {
			return (int) (this.salary * 1.2);
		}
}
