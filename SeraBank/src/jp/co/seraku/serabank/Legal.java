package jp.co.seraku.serabank;

public class Legal extends Customer{

	public Legal(int code, String name) {
		super(code, name);
		// TODO 自動生成されたコンストラクター・スタブ
	}
		public void abc(int val) {
	if(amount * 200 > val ) {
		loan += val * 1.15;
		System.out.println("kasituke:" + loan + "en:desu");
	}else {
		System.out.println("BBB");
	}
 }
}