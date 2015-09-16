package com.metacube.jdbc.example;

public class DeleteBookPOJO {
	static int numberOfBooksDeleted=0;
	public static int getNumberOfBooksDeleted() {
		return numberOfBooksDeleted;
	}
	public static void setNumberOfBooksDeleted(int numberOfBooksDeleted) {
		DeleteBookPOJO.numberOfBooksDeleted = numberOfBooksDeleted;
	}
}
