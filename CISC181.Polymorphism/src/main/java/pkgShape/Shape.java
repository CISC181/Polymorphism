package pkgShape;

public abstract class Shape {

	private int iColor;
	public abstract double area();
	private int getiColor() {
		return iColor;
	}
	private void setiColor(int iColor) {
		this.iColor = iColor;
	}

	
}
