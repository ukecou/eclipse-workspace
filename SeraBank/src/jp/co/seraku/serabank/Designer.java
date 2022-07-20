package jp.co.seraku.serabank;

public class Designer  extends Employee{
	
	public Designer (int code, String name) {
		super(code,name, 4000);
	}
	
	public int getBonus() {
		return (int) (salary *1.4);
}
}