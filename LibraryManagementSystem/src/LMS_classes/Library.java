package LMS_classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Library {
	public Map<String,Book> books;
	public Map<String,Member> members;
	List<Member> libraryMemberList =new ArrayList<Member>();
	
	public void register_member(Member member) {
		libraryMemberList.add(member);
	}
	public void issue_book(String member_id, Book book) {
		for(Member member:libraryMemberList) {
			if(member.member_id.equals(member_id) && book.is_Available()) {
				System.out.println("issue a book");
				book.borrow_book(book);
			}else {
				System.out.println("Either member is not registered or book is not avialable");
			}
		}
	}
	public void receive_book(String member_id,Book book) {
		
	}
	public void list_all_books() {
		
	}
	

}
