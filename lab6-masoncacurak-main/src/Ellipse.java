
public class Ellipse extends Shape {

	private double a;
	private double b;
	
	public Ellipse(double a, double b) throws IllegalArgumentException {
		if ((a > 0 && b > 0) && a >= b) {
			this.a = a;
			this.b = b;
		}
		if (a <= 0 || b <= 0) {
			throw new IllegalArgumentException("Nonpositive value(s) provided for the constructor");
		}
		else if(a < b) {
			throw new IllegalArgumentException("Semi-major axis length cannot be less than semi-minor axis length");
		}
	}
	
	@Override
	public double getArea() {
		return (Math.PI * a * b);
	}
	
	@Override
	public double getPerimeter() {
		return Math.PI * (a + b);
	}
	
	public double getA() {
		return this.a;
	}
	
	public double getB() {
		return this.b;
	}
}
