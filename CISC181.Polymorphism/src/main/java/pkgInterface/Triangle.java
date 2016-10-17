package pkgInterface;

public class Triangle extends Shape {


	private int iSide1;
	private int iSide2; 
	private int iSide3;
	
	public Triangle(Triangle t1)
	{
		this.iSide1 = t1.iSide1;
		this.iSide2 = t1.iSide2;
		this.iSide3 = t1.iSide3;
	}
	
	public Triangle(int iSide1, int iSide2, int iSide3) {
		super();
		this.iSide1 = iSide1;
		this.iSide2 = iSide2;
		this.iSide3 = iSide3;
	}

	@Override
	public double area(){
		double s = (iSide1 + iSide2 + iSide3)/2;
		double area = Math.sqrt(s*(s-iSide1)*(s-iSide2)*(s-iSide3));
		return area;
	}

	@Override
	public double perimeter() {
		return iSide1 + iSide2 + iSide3;
	}
	
	
}
