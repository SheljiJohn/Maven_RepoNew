package aggregation;

public class Book {

	String book_name;
	String book_id;
	
	Author obj;
	
	Book(String book_name, String book_id, Author obj )
	{
		this.book_name = book_name;
		this.book_id = book_id;
		this.obj = obj;
	}
	
	public void display()
	{
		System.out.println("###########Book Details##########");
		System.out.println("Book Name: " + book_name);
		System.out.println("Book ID: " + book_id);
		System.out.println();
		obj.displayInfo();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Author author = new Author("Shelji John", "Aluva", 683562);
		Book book = new Book("JAVA begins..", "ABC12345", author);
		book.display();
	}

}
