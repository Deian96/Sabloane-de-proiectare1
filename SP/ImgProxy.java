
public class ImgProxy implements Element {
	public String imgName;
	public Image image;
	@Override
	public void print() {
		// TODO Auto-generated method stub
		if(image==null)
			image=new Image(imgName);
		image.print();
	}
	public ImgProxy(String imgName)
	{
		this.imgName=imgName;
	}
	@Override
	public void add(Element e) {
		// TODO Auto-generated method stub
		
	}

}
