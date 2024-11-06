package LMS_classes;

public class Book implements Details,BorrowbookDetails {
	public String title;
	public String author;
	private String ISBN;
	public int copies;
	public Book(String title,String author,String ISBN,int copies) {
		this.title=title;
		this.author=author;
		this.ISBN=ISBN;
		this.copies=copies;
	}
	
	public void setISBN(String ISBN)
	{
		this.ISBN=ISBN;
	}
	public String getISBN() {
		return this.ISBN;
	}
	public String get_details() {
		String bookDetails="Author is "+this.author+" Title is "+this.title+" ISBN is "+this.ISBN;
		return bookDetails;
	}
    public boolean is_Available() {
    	if(copies>=1) {
    		return true;
    	}else {
    		return false;
    	}
    }
   
    public void return_book() {
    	copies=copies+1;
    }

	@Override
	public void borrow_book(Book book) {
		if(book.is_Available()) {
    		copies=copies-1;
    	}else {
    		System.out.println("The book is not available");
    	}
		
	}
}
