
public class Main {

	public static void main(String[] args) {
	    long startTime=System.currentTimeMillis();
	    Section cap1=new Section ("Playboy");
	    cap1.add(new ImgProxy("Pamela Anderson"));
	    Section cap2=new Section("Auto Show");
	    cap2.add(new ImgProxy("My dream BMW"));
	    cap2.add(new ImgProxy("My car is a Trabi"));
	    cap1.print();
	    long endTime=System.currentTimeMillis();
	    System.out.println(endTime-startTime);
	    
	    
	}

}
