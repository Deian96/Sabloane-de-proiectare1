import java.util.concurrent.TimeUnit;

public class Image implements Element {
String name;

public Image(String name) {
	this.name = name;
	try {
		TimeUnit.SECONDS.sleep(5);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public void print() {
	System.out.println(name);
}
public void add(Element e)
{
	
}
}
