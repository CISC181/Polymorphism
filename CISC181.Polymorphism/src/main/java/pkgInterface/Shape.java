package pkgInterface;

public abstract class Shape implements iShape2D {

	private int iColor;

	public int getiColor() {
		return iColor;
	}
	
	public void setiColor(int iColor) {
		this.iColor = iColor;
	}

	public iShape2D getObject()
	{
		return this;
	}
}
