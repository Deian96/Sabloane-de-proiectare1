import java.util.ArrayList;
import java.util.List;

public class Book {
String titlu;
List<Author> a;
List<Element>e=new ArrayList<>();
public Book(String titlu) {
	this.a=new ArrayList<>();
	this.titlu = titlu;
}
public void addAuthor(Author a1)
{
a.add(a1);
}
public void print() {
	System.out.println(titlu);
	System.out.println("Authors: ");
	for(Author auth:a)
	{
		auth.print();
	}
	for(Element ele:e)
	{
		ele.print();
	}
	
}
public void add(Paragraph paragraph) {
	// TODO Auto-generated method stub
	e.add(paragraph);
}
public void add(Section cap1) {
	// TODO Auto-generated method stub
	e.add(cap1);
}
}
