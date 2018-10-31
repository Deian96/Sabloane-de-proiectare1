package Laboratorul2;

import java.util.ArrayList;

public class Book {
	String title;
	ArrayList<Author> authors=new ArrayList<Author>();
	ArrayList<Element>content=new ArrayList<Element>();
	private Book elm;
	private Element elementelm;
	public void print1(){
		System.out.println(title);
		for (int i = 0; i < content.size(); i++) {
			setElementelm(content.get(i));
			elm = null;
			elm.print1();
		}
	}
	
	
	Book(String title){
		this.title=title;
	}
	
	public void addAuthor(Author a) {
		authors.add(a);
	}

	public void createChapter(String Chapter){
	
	}

	public void print(){
		System.out.print("---Title--- ");
		System.out.println(title);
		
		System.out.println("---Authors---");
		for(int auth=0;auth<authors.size();auth++) {
			System.out.println(authors.get(auth).name);
		}
		
	}

	public void add(Paragraph paragraph) {
		// TODO Auto-generated method stub
		
	}

	public void addAuthor(Section cap1) {
		// TODO Auto-generated method stub
		
	}


	public Element getElementelm() {
		return elementelm;
	}


	public void setElementelm(Element elementelm) {
		this.elementelm = elementelm;
	}

}

