package LMS_classes;

public class Driver {
	public static void main(String[] args) {
		Book b1=new Book("Art Of Living","AB","ISBN001",3);
		Book b2=new Book("Life is beautiful","ABC","ISBN002",8);
		Book b3=new Book("pie","ABCD","ISBN003",6);
		System.out.println(b1.get_details());
		System.out.println(b1.is_Available());
		Member m1=new Member("Shilpa","M1");
		Member m2=new Member("Shwetha","M2");
		System.out.println(m1.get_details());
		b1.borrow_book(b1);
		System.out.println(b1.is_Available());
		b1.borrow_book(b1);
		System.out.println(b1.copies);
		b1.return_book();
		b1.return_book();
		System.out.println(b1.copies);
	
		
	}

}
