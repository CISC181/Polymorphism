package pkgInterface;

public class Rectangle extends Shape implements iShape2D {
	
	private int iLength;
	private int iWidth;
	
	
	public Rectangle(int iLength, int iWidth) {
		super();
		this.iLength = iLength;
		this.iWidth = iWidth;
	}
		
	public int getiLength() {
		return iLength;
	}

	public int getiWidth() {
		return iWidth;
	}

	@Override
	public double area()
	{
		return iLength * iWidth;
	}
	
	@Override
	public double perimeter() {
		return (2 * iLength) + (2 * iWidth);
	}
	
	public iShape2D getObject()
	{
		return this;
	}
	
	private static void printTest()
	{
		System.out.println("Print me");
	}

}
