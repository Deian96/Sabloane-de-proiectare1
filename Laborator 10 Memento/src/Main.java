
public class Main {
	public static void main(String[] args) throws Exception {			
		Section cap1 = new Section("Capitolul 1");
		cap1.add(new Paragraph("Moto capitol"));
		cap1.add(new Paragraph("Another One"));
		cap1.add(new Paragraph("Another Two"));
		cap1.add(new Paragraph("Another Three"));
		DocumentManager.getInstance().setBook(cap1);
		
		System.out.println("Book Content: ");
		DocumentManager.getInstance().getBook().print();
			
		Command cmd = new DeleteCommand();
		Command.execute();
		System.out.println("Book Content after the first delete: ");
		DocumentManager.getInstance().getBook().print();
		Command.execute();
		System.out.println("Book Content after the second delete: ");
		DocumentManager.getInstance().getBook().print();
		Command undoCommand = new UndoCommand();
		Command.execute();
		System.out.println("Book Content after first undo: ");
		DocumentManager.getInstance().getBook().print();
		
		Command.execute();
		System.out.println("Book Content after second undo: ");
		DocumentManager.getInstance().getBook().print();

			


	}		

		


}
