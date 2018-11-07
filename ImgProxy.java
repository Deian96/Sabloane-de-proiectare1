
public class ImgProxy implements Element {

	public String imgName;
	public Image image;

	@Override
	public void add(Element e) {
		// TODO Auto-generated method stub
		
		
	}

	public ImgProxy(String imgName){
		this.imgName = imgName;
	}


	public void print() {

		if(image == null){
			image = new Image(imgName);
		}
	}

	@Override
	public void remove(Element e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getChild(int index) {
		// TODO Auto-generated method stub
		
	}
}
