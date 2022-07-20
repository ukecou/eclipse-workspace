package dev.aso;

public class SerakuCar {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		CarClass name = new CarClass("Aqua", 3410);
		
		name.oil(100);
		//System.out.println(Name.Tank);
		name.oil(20);
		System.out.println(name.getTank());
		
		name.distance(0);
		name.distance(10);
		System.out.println(name.getTank());
		System.out.println(name.getNumder());
		System.out.println(name.getCarName());
		
		
		name.distance(-1);
	}

}
