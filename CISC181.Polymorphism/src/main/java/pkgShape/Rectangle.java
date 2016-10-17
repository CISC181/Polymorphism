package pkgShape;

public class Rectangle extends Shape {
	
	private int iLength;
	private int iWidth;
	
	
	public Rectangle(int iLength, int iWidth) {
		super();
		this.iLength = iLength;
		this.iWidth = iWidth;
	}
	
	@Override
	public double area()
	{
		return iLength * iWidth;
	}

}
