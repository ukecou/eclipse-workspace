package jp.co.seraku.serabank;

public class Manager extends Employee implements authentical {
	
	private setpassword = "www";
	public Manager (int code, String name) {
		super(code,name, 5000);
	}
	
	public int getBonus() {
		return (int) (salary *1.5);
	
}

	@Override
	public void authentival(String password) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void setPassword(String password) {
		// TODO 自動生成されたメソッド・スタブ
		
	}
}