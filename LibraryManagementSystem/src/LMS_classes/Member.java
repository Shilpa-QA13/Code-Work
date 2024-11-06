package LMS_classes;

import java.util.ArrayList;
import java.util.List;

public class Member extends Person implements Details,BorrowbookDetails{
	public String member_id;
//	public void setMember_id(String member_id) {
//		this.member_id=member_id;
//	}
//	public String getMember_id() {
//		return member_id;
//	}
	public List<Book> borrowed_books=new ArrayList<Book>();
	public Member(String name,String member_id) {
		this.name=name;
		this.member_id=member_id;
	}
	
	public void borrow_book(Book book) {
		if(book.is_Available()) {
			borrowed_books.add(book);
		}else {
			System.out.println(book+" is not available");
		}
	}
	public void return_book(Book book) {
		for(Book returnedBook:borrowed_books) {
			if(returnedBook.equals(book)) {
				borrowed_books.remove(book);
			}
		else {
			System.out.println(book+"is not the valid book to remove");
		}
		
		}
	}
	public List<Book> list_borrowed_books() {
      return borrowed_books;
	}
	@Override
	public String get_details() {
		// TODO Auto-generated method stub
		String memberDetails="Name is "+this.name+" Member id is "+this.member_id;
		return memberDetails;
	}

}
