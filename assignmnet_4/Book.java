import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Book implements Comparable<Book>{
	private String Title;
	private String ISBN;
	private String Barcode;
	private Integer RackNumber;
	private Integer SlotNumber;

	public Book(String title, String iSBN, String barcode) {
		super();
		Title = title;
		ISBN = iSBN;
		Barcode = barcode;
		RackNumber = Integer.MIN_VALUE;
		SlotNumber = Integer.MIN_VALUE;
	}

	public Integer getRackNumber() {
		return RackNumber;
	}

	public void setRackNumber(Integer rackNumber) {
		RackNumber = rackNumber;
	}

	public Integer getSlotNumber() {
		return SlotNumber;
	}

	public void setSlotNumber(Integer slotNumber) {
		SlotNumber = slotNumber;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getBarcode() {
		return Barcode;
	}

	public void setBarcode(String barcode) {
		Barcode = barcode;
	}

	@Override
	public String toString() {
		return "Book [Title=" + Title + ", ISBN=" + ISBN + ", Barcode=" + Barcode + ", RackNumber=" + RackNumber
				+ ", SlotNumber=" + SlotNumber + "]\n";
	}

	public int compareTo(Book compareBook) {

		String compareTitle = compareBook.getTitle(); 

		if(this.Title.compareTo(compareTitle) == 0) {
			String compareISBN = compareBook.getISBN();
			if(this.ISBN.compareTo(compareISBN) == 0) {
				String compareBarcode = compareBook.getBarcode();
				return this.Barcode.compareTo(compareBarcode);
			}else {
				return this.ISBN.compareTo(compareISBN);
			}
		}else {
			return this.Title.compareTo(compareTitle);
		}
	}

	public static Comparator<Book> BookComparator = new Comparator<Book>() {

		public int compare(Book book1, Book book2) {
			return book1.compareTo(book2);
		}

	};

}
