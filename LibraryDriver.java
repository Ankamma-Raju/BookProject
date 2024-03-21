package org;

import java.util.Scanner;

public class LibraryDriver 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Library l=new Library();
		boolean start=true;
		while(start) {
			System.out.println("Enter the Choice : \n 1.AddBook \n 2.DisplayBook \n 3.SearchBookByID  \n 4.Search book by ID and Title \n 5.Update Book \n 6.Remove Book \n 7.Exit");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1: {
				System.out.println("Enter the BookID");
				int bookId=sc.nextInt();
				System.out.println("Enter the Book Title");
				String bookTitle=sc.next();
				System.out.println("Enter the Book cost");
				int cost=sc.nextInt();
				System.out.println("Enter the Author ");
				String author=sc.next();
				System.out.println("Enter the No. of pages");
				int noOfPages=sc.nextInt();
				l.addBook(new Book(bookId,bookTitle,cost,noOfPages,author));
				}
			break;
			case  2 :
			{
				l.displayBooks();
			}
			break;
			case 3:
			{
				System.out.println("Enter the Book ID");
				int bookId=sc.nextInt();
				l.searchBookById(bookId);
			}
			break;
			case 4:
			{
				System.out.println("Enter the Book ID");
				int bookId=sc.nextInt();
				System.out.println("Enter the Book Title");
				String bookTitle=sc.next();
				l.searchBookByIdandTitle(bookId, bookTitle);
			}
			break;
			case 5:
			{
				System.out.println("Enter the Book ID");
				int bookId=sc.nextInt();
				l.updateBookData(bookId);
			}
			break;
			case 6 :
			{
				System.out.println("Enter the Book ID");
				int bookId=sc.nextInt();
				l.removeBookById(bookId);
			}
			break;
			case 7:
			{
				start=false;
				System.out.println("thank You...");
			}
			break;
			default:
				System.out.println("Enter the Valid Choice...");
			}
		}
	}
}



