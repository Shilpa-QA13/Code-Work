package LMS_classes;

import java.util.ArrayList;
import java.util.List;

public class Librarian extends Person implements Details {
	public String employee_id;
	public List<Book> inventoryDetails=new ArrayList<Book>();
	
	public void add_book(Book book) {
		inventoryDetails.add(book);
	}
	public void remove_book(Book book) {
		for(Book removedBook:inventoryDetails) {
			if(removedBook.equals(book)) {
				inventoryDetails.remove(book);
				break;
			}else {
				System.out.println(book +"is not avialble to remove" );
				
				
			}
		}
		
	}
	public List<Book> view_inventory() {
		return inventoryDetails;
	}
	@Override
	public String get_details() {
		String librarianDetails="Librarian name is "+this.name+" Employee id is "+this.employee_id;
		return librarianDetails;
	}
	
	
	

}
