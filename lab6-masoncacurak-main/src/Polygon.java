
public abstract class Polygon extends Shape{

	private double perimeter;
	
	protected Polygon(double... sides) throws IllegalArgumentException {
		if (sides == null) {
			throw new IllegalArgumentException("null sides");
		}
		if (sides.length < 3) {
			throw new IllegalArgumentException("Invalid number of sides: " + sides.length);
		}
		for (double side : sides) {
			if (side <= 0) {
				perimeter = 0;
				throw new IllegalArgumentException("Nonpositive side: " + side);
			}
			perimeter += side;
		}
		for (double side : sides) {
			double otherSidesLength = perimeter - side;
			if (side >= otherSidesLength) {
				throw new IllegalArgumentException("Polygon inequality violated: " + side + " >= " + otherSidesLength);
			}
		}
	}
	
	public double getPerimeter() {
		return perimeter;
	}
	
	@Override
	public double getArea() {
		return 0;
	}
}
