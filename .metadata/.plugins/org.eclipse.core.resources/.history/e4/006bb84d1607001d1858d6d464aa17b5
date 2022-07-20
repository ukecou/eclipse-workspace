package jp.co.seraku.serabank;

public abstract class Client {

	protected String name;
	protected int code;
	protected Account account;
	
	public Client(int code, String name) {
		this.code =code;
		this.name =name;
	}
	
	public void createAccount(int code, int initialValue) {
		this.account = new Account(code, this.name, initialValue);
	}
	public void createAccount(int code) {
		this.createAccount(code, 0);
	}
	
	public abstract void simulateLoan(int value);
}
