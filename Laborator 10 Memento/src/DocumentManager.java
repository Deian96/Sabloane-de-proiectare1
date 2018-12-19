
public class DocumentManager {

	
		  private static DocumentManager sharedInstance = null;
		  private Book book = null;
		  private Section section;

		  private DocumentManager() {

		  }

		 

		  public void setBook(Book cap1) {
		    this.book = cap1;
		  }

		  public Book getBook() {
		    return book;
		  }
		  public void addCommand(Command cmd) {
			  cmd.DeleteCommand();
			  cmd.UndoCommand();
			  
		  }
		  public Object getLastCommand(Object getLastCommand) {
			return getLastCommand;
		  }

		



		public static DocumentManager getInstance() {
			// TODO Auto-generated method stub
			return null;
		}



		public void setBook(Section section) {
			this.section=section;
			
		}

		

		

		
		
		}


