package pkgShape;

public class cMain {

	public static void main(String[] args) {

		Shape s1 = new Rectangle(10, 20);
		Shape s2 = new Triangle(4, 5, 6);

		System.out.println(s1.area());

		System.out.println(s2.area());

		System.out.println("S1 is instance of Shape " + (s1 instanceof Shape));
		System.out.println("S1 is instance of Rectangle " + (s1 instanceof Rectangle));
		System.out.println("S1 is instance of Triangle " + (s1 instanceof Triangle));
		
		System.out.println("s2 is instance of Shape " + (s2 instanceof Shape));
		System.out.println("s2 is instance of Rectangle " + (s2 instanceof Rectangle));
		System.out.println("s2 is instance of Triangle " + (s2 instanceof Triangle));
		
		
		Triangle t2 = (Triangle) s2;
		
		System.out.println("t2 is instance of Shape " + (t2 instanceof Shape));

		System.out.println("t2 is instance of Triangle " + (t2 instanceof Triangle));
		
		Shape s3 = (Shape)t2;
		
		System.out.println("s3 is instance of Shape " + (s3 instanceof Shape));

		System.out.println("s3 is instance of Triangle " + (s3 instanceof Triangle));

		
		Shape s10 = new Triangle(new Triangle(4,5,6));
		System.out.println(s10.area());
	}

}
