
public class Circle extends Ellipse {

	public Circle(double radius) {
		super(radius, radius);
	}
	
	public double getRadius() {
		double circumference = getPerimeter();
		return circumference / (2 * Math.PI);
	}
}
