
public class Rectangle extends IsoscelesTrapezoid {

	public Rectangle(double width, double height) {
		super(width, width, height);
	}
	
	public double getWidth() {
		return getBase();
	}
	
	public double getHeight() {
		return getLeg();
	}
}
