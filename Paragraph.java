
public class Paragraph implements Element{
	private String paragraph;
	
	private AlignStrategy align;
	
	public Paragraph(String paragraph){
		this.paragraph = paragraph;
	}
	public String getParagraph() {
		return paragraph;
	}
	public void setParagraph(String paragraph) {
		this.paragraph = paragraph;
	}
	
	@Override
	public void add(Element e) {
		
	}
	@Override
	public void remove(Element e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void getChild(int index) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void print(){
		if(align == null) {
			System.out.println(paragraph);
		}else {
			align.printAlign(paragraph);
		}
	}
	public AlignStrategy getAlign() {
		return align;
	}
	public void setAlignStrategy(AlignStrategy align) {
		this.align = align;
	}
	
}