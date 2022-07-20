package lib.aso;

public class Book {
	//オブジェクト
	private String bookName;	//本の名前
	private int isbm;			//ISBM
	private String title;		//題名
	private String auther;		//作者
	private String publisher;	//出版社
	private int year;			//出版年
	

//コンストラクター
	public Book(String bookName, int isbm, String title, String auther, String publisher, int year) {
		this.bookName = bookName;
		this.isbm = isbm;
		this.title = title;
		this.auther = auther;
		this.publisher = publisher;
		this.year = year;
	}

	
//詳細メソッド？
String getbookName() {
	return bookName;	//本の名前のゲッター
}


}