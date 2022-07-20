package jp.co.seraku.serabank;

abstract class Employee {
	
	private int code;
	private String name;
	protected int salary;
	
	
	public Employee(int code, String namey, int salary) {
		this.code = code;
		this.name = name;
		this.salary = salary;
	}
	
	public void info() {
		System.out.println("Code" + "Name:" + name );
	
	}
	abstract int getBonus();
	
	
}


