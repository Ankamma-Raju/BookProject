package org;

import java.util.ArrayList;
import java.util.ListIterator;

public class Library 
{
	private String location;
	private Book b;
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Book getB() {
		return b;
	}
	public void setB(Book b) {
		this.b = b;
	}
	
	ArrayList <Book> book=new ArrayList <Book> ();
	//AddBook
	public void addBook(Book b) {
		book.add(b);
		System.out.println("Book Added Successfully");
	}
	//DisplayBook
	public void displayBooks()
	{
		if (book.isEmpty()) {
			throw new NoBooksException();
		}else {
			for(Book b:book) {
				b.bookDetails();
			}
		}
	}
	//SearchBookByID
	public void searchBookById(int id)
	{
		boolean isFound=false;
		if(book.isEmpty())
		{
			throw new NoBooksException();
		}
		else {
			for(Book b:book)
			{
				if(b.getBookId()==id) {
					System.out.println("Book Found ..:Details are ");
					b.bookDetails();
					isFound=true;
				}
			}
		}
		if(isFound==false) {
			throw new InvalidBookIdException();
		}
	}
	//Search Book by Id and title
	public void searchBookByIdandTitle(int id,String title)
	{
		boolean isFound=false;
		if(book.isEmpty())
		{
			throw new NoBooksException();
		}
		else
		{
			for(Book b: book)
			{
				if(b.getBookId()==id)
				{
					if(b.getBookTitle().equalsIgnoreCase(title)) {
						System.out.println("Book Found ..:Details are ");
						b.bookDetails();
						isFound=true;
					}
				}
			}
		}
		if(isFound==false)
		{
			throw new InvalidBookIdException();
		}
	}
	//Update BookData based on ID 
	public void updateBookData(int id) {
		boolean isFound=false;
		if(book.isEmpty())
		{
			throw new NoBooksException();
		}
		else
		{
			for(Book b: book)
			{
				if(b.getBookId()==id)
				{
					b.setCost(900);
					System.out.println("Book cost updated");
					isFound=true;
				}
			}
		}
		if(isFound==false) {
			throw new InvalidBookIdException();
		}
	}
	//Remove Book By ID
	public void removeBookById(int id) {
		ListIterator<Book> i=book.listIterator();
		boolean isRemoved=false;
		if(book.isEmpty())
		{
			throw new NoBooksException();
		}
		else
		{
			while(i.hasNext())
			{
				Book b1=i.next();
				if(b.getBookId()==id) {
					i.remove();
					System.out.println("Book removed SuccessFully");
					isRemoved=true;
				}
			}
		}
		if(isRemoved==false)
		{
			throw new InvalidBookIdException();
		}
	}
}


