import java.util.ArrayList;
import java.util.List;

public class Section implements Element{
String title;
List<Element>e=new ArrayList<>();
public Section(String title) {
	this.title = title;
}
public void add(Paragraph paragraph) {
	// TODO Auto-generated method stub
	e.add(paragraph);
}
public void add(Element cap11) {
	// TODO Auto-generated method stub
	e.add(cap11);
}
public void print() {
	System.out.println(title);
	for(Element ele:e)
	{
		ele.print();
	}
}
}
