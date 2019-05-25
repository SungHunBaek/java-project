package day49_inheritance02;

public class BarnesAndNobles {
	public static void main(String[] args) {
		EBook ebook = new EBook();
		ebook.setTitle("Introduction to Java");
		ebook.setAuthor("Savitch");
		ebook.setPages(1016);
		ebook.setPrice(170);
		ebook.setSize(500);
		ebook.setType("Tech Book");
		
		System.out.println(ebook.getTitle());
		System.out.println(ebook.getAuthor());
		ebook.readEBook(10);
		ebook.readEBook(621);
		
		AudioBook aBook = new AudioBook();
		aBook.setTitle("OCA PREP");
		aBook.setAuthor("Jeanne");
		aBook.setNarrator("Marufjon");
		aBook.listen();
		
		PaperBook pb = new PaperBook();
		pb.setAuthor("Malcom Gladwell");
		pb.setTitle("OutLiers");
		pb.setType("Biography");
		pb.setPrice(20);
		pb.setPages(304);
		System.out.println(pb.toString());
	}
}
