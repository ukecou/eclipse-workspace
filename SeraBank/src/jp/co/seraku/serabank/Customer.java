package jp.co.seraku.serabank;

public class Customer {
	
	private int code;
	private String name;
	protected int amount;
	protected int loan;
	
	public Customer (int code, String name) {
		this.code = code;
		this.name = name;
		
	}
	
	public void plus(int value) {
		if(amount * 100 > value ) {
			amount += value * 1.12;
			System.out.println("kasituke:" + amount + "en:desu");
		}else {
			System.out.println("kasemasen");
		}
	}
}