package Laboratorul2;

public class Main {

	public static void main(String[] args) {
		Book noapteBuna = new Book("Noapte buna, copii");
		Author rpGheo = new Author("Radu Pavel Gheo");
		
		noapteBuna.addAuthor(rpGheo);
		noapteBuna.add(new Paragraph("Multumesc..."));
		Section cap1=new Section("Capitolul 1");
		cap1.add(new Paragraph("Aici..."));
		Element cap11=new Section("SubCap1.1");		
		cap11.add(new Section("Sub Sub Cap 1.1.1"));
		cap1.add(cap11);
		noapteBuna.addAuthor(cap1);
		
		noapteBuna.print();
		
}
}
