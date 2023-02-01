import java.util.Comparator;

public class ShapeIDComparator implements Comparator<Shape> {

	@Override
	public int compare(Shape s1, Shape s2) {
		int a = s1.getID();
		int b = s2.getID();
		return Integer.compare(a, b);
	}
}
