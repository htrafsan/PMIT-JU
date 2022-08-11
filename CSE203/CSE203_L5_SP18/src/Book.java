/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author official_rafsan
 *
 */
public class Book {
	public String bookTitle,bookAuthor,bookISBN;
	public int numofCopies;

	/**
	 * 
	 */
	public Book(String bT,String bA,String P,int C) {
		// TODO Auto-generated constructor stub
		this.bookTitle=bT;
		this.bookAuthor=bA;
		this.bookISBN=P;
		this.numofCopies=C;
	}
	public void display() {
		System.out.println(bookTitle+"-"+bookAuthor+"-"+bookISBN+"-"+numofCopies);
	}

	/**
	 * @param args
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	*/

}