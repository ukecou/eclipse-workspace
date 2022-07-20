package jp.co.seraku.serabank;

public class Account {

	private int code;
	private int amount;
	private String ownerName;

	
	public Account(int code, String ownerName, int intialValue) {
		this.code = code;
		this.ownerName = ownerName;
		this.amount = intialValue;
	}
	public Account(int code, String ownerName) {
		this(code, ownerName, 0); //上のintialValueを読んで書く量削減
	}

	public void deposit(int value){
		amount += value;
	}

	
	
	
	public void withdraw(int value) {
		if (amount >= value) {
			amount -= value;
		} else {
			System.out.println("koetemasu");
		}

	}

	public void transher(Account destAccount, int value) {
		if (amount >= value) {
			this.withdraw(value);
			destAccount.deposit(value);
		}

	}

	int getAmount() {
		return amount;
	}

	int getcode() {
		return code;
	}

	String getownerName() {
		return ownerName;
	}

}
