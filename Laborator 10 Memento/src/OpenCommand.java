public class OpenCommand implements Command {

	  public void execute() {
	    JSONBuilder jsonBuilder = new JSONBuilder("book.json");
	    jsonBuilder.build();
	    Book book = new Book("carte1");
	    book.add(jsonBuilder.getResult());
	    DocumentManager.getInstance().setBook(book);
	    book.print();
	  }

	@Override
	public void DeleteCommand() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void UndoCommand() {
		// TODO Auto-generated method stub
		
	}
}
