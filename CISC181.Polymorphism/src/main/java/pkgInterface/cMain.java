package pkgInterface;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class cMain {

	public static void main(String[] args) {

		InvokePrivateMethod();

		CreateInterface();
		/*
		 * CreateShapes(); CreateShape1(); CreateShape2();
		 */
	}

	private static void InvokePrivateMethod() {
		Rectangle Rec = new Rectangle(6, 6);
		try {
			Method m = Rec.getClass().getDeclaredMethod("printTest", null);
			m.setAccessible(true);
			m.invoke(null, null);

		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void CreateInterface() {

		// iShape2D iT = new Triangle(6, 6, 6);
		Rectangle iT = new Rectangle(6, 6);

		System.out.println("********************************************");
		System.out.println("Methods Declared in iT");

		ListMethod(iT.getClass().getDeclaredMethods());

		System.out.println("********************************************");
		System.out.println("********************************************");
		System.out.println("********************************************");
		System.out.println(" All Methods in iT");

		ListMethod(iT.getClass().getMethods());
	}

	private static void ListMethod(Method[] mx) {
		for (Method m : mx) {
			System.out.println("Method: " + m.getName());

			System.out.println("\t Declaring Class : " + m.getDeclaringClass());
			System.out.println("\t Return Type : " + m.getReturnType());

			System.out.println("\t IsStatic: " + Modifier.isStatic(m.getModifiers()));
			System.out.println("\t IsStatic: " + Modifier.isAbstract(m.getModifiers()));
			System.out.println("\t isFinal: " + Modifier.isFinal(m.getModifiers()));
			System.out.println("\t isInterface: " + Modifier.isInterface(m.getModifiers()));
			System.out.println("\t isPrivate: " + Modifier.isPrivate(m.getModifiers()));
			System.out.println("\t isProtected: " + Modifier.isProtected(m.getModifiers()));
			System.out.println("\t isPublic: " + Modifier.isPublic(m.getModifiers()));
			System.out.println("\t isStrict: " + Modifier.isStrict(m.getModifiers()));
			System.out.println("\t isSynchronized: " + Modifier.isSynchronized(m.getModifiers()));
			System.out.println("\t isTransient: " + Modifier.isTransient(m.getModifiers()));
			System.out.println("\t isVolatile: " + Modifier.isVolatile(m.getModifiers()));

			System.out.println("\t Input Parameters: ");
			if (m.getParameterTypes().length == 0) {
				System.out.println("\t \t NONE");
			}

			else {
				for (Class<?> pt : m.getParameterTypes()) {
					System.out.println("\t \t" + pt.getName());
				}
			}
		}

	}

	private static void CreateShapes() {
		ArrayList<Shape> Shapes = new ArrayList<Shape>();
		Shapes.add(new Triangle(3, 4, 5));
		Shapes.add(new Rectangle(10, 20));
		Shapes.add(new RectangularPrism(10, 20, 30) {
			@Override
			public double area() {
				return 0;
			}
		});

		for (Shape s : Shapes) {
			System.out.println("Type of Shape: " + s.getClass().toString());
			System.out.println("Area         : " + s.area());
			System.out.println("Perimeter    : " + s.perimeter());
		}

	}

	private static void CreateShape1() {
		Shape s = new Rectangle(20, 10) {
			@Override
			public double area() {
				return 4;
			}
		};
		System.out.println(s.area());
	}

	private static void CreateShape2() {
		Shape s = new Rectangle(10, 10);
		iShape2D s2 = s.getObject();

		System.out.println("Area of s2 " + s2.area());

	}
}
