package pkgInterface;

public class RectangularPrism extends Rectangle  {

	private int iDepth;
	public RectangularPrism(int iLength, int iWidth, int iDepth) {
		super(iLength, iWidth);
		this.iDepth = iDepth;
	}

	@Override
	public double area()
	{
		return super.getiWidth() * super.getiLength() * this.iDepth;
	}
}
