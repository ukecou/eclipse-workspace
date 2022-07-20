package dev.aso;

public class CarClass {

	private String carName;
	private int number;
	private double Tank;

	public CarClass(String CarName, int Number) { // コンストラクター
		this.carName = CarName;
		this.number = Number;
	}

	 void oil(int give) {

		if (Tank < 50 && Tank + give < 50) {
			Tank += give;

		} else if (Tank == 50) {
			System.out.println("ガソリンが満タンです");
		} else {
			System.out.println("タンクの許容量を超えています。");
		}

	}

	void distance(double km) {
		if (Tank >= km / 20 && km > 0) {
			Tank -= km / 20;
		} else if (km <= 0) {
			System.out.println("無効な値です");
		} else {
			System.out.println("燃料が足りません");
		}
	}

	String getCarName() {
		return carName;
	}

	int getNumder() {
		return number;
	}

	double getTank() {
		return Tank;
	}

}
