import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class QuestionOne {
	
	public static void main(String[] args) {
		
		int N = 12;
		int numRacks = 4; // 12/4 = 3 slots per rack
		
		// Creating book objects from the bill details.
		List<Book> bookList = new ArrayList<>();

		bookList.add(new Book("Title7","ISBN9","Barcode10"));
		bookList.add(new Book("Title8","ISBN10","Barcode11"));
		bookList.add(new Book("Title9","ISBN11","Barcode12"));
		bookList.add(new Book("Title1","ISBN1","Barcode1"));
		bookList.add(new Book("Title2","ISBN2","Barcode2"));
		bookList.add(new Book("Title3","ISBN3","Barcode3"));
		bookList.add(new Book("Title7","ISBN8","Barcode9"));
		bookList.add(new Book("Title4","ISBN4","Barcode4"));
		bookList.add(new Book("Title4","ISBN5","Barcode5"));
		bookList.add(new Book("Title5","ISBN6","Barcode6"));
		bookList.add(new Book("Title6","ISBN7","Barcode7"));
		bookList.add(new Book("Title7","ISBN8","Barcode8"));
		
		
		// Sorting books 
		Collections.sort(bookList);
		
		//Assigning rack and slot number
		int bookCount=0,bookSlot=1, rackNumber=0;
		for(Book b : bookList) {
			if(bookCount > N) {
				System.out.println("Book count exceeds available spot. ");
				break;
			}
			if(bookCount%(N/numRacks)==0) {
				bookSlot = 1;
				rackNumber++;
			}
			b.setRackNumber(rackNumber);
			b.setSlotNumber(bookSlot);
			
			bookSlot++;
			bookCount++;
		}
		
		System.out.println(bookList);
	}

}

