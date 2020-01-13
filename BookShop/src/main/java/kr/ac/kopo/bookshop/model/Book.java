package kr.ac.kopo.bookshop.model;

public class Book {
	int bookid;
	String bookname;
	String publisher;
	int price;

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static String getSearch(String search) {
		try {
			if(search.equals("1"))
				return "bookid";
			else if(search.equals("2"))
				return "bookname";
			else if(search.equals("3"))
				return "publisher";
			else
				return null;	
		}catch (NullPointerException e) {
				return null;
		}
	}

}
