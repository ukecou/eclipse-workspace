package lib.aso;

public class Library {

	public static void main(String[] args) {
		Book test = new Book(null, 0, null, null, null, 0);
		Book testBook = new Book("Test", 0, "te", "tt", "tte", 0);
		System.out.println(testBook.getbookName());

	}

}
