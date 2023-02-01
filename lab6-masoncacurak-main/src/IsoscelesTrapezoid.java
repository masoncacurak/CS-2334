
public class IsoscelesTrapezoid extends Polygon {

	private double top;
	private double base;
	private double leg;
	private double area;
	private double triangleBase;
	private double height;
	
	public IsoscelesTrapezoid(double top, double base, double leg) {
		super(top, base, leg, leg);
		this.top = top;
		this.base = base;
		this.leg = leg;
	}
	
	public double getTop() {
		return top;
	}
	
	public double getBase() {
		return base;
	}
	
	public double getLeg() {
		return leg;
	}
	
	@Override
	public double getArea() {
		double a = getTop();
		double b = getBase();
		double side = getLeg();
		double height = Math.sqrt((side * side) - (((b - a) / 2) * ((b - a) / 2)));
		double area = (((a + b) / 2) * height);
		return area;
	}
	
	public Rectangle getCenterRectangle() {
		if (base > top) {
			return new Rectangle(top, height);
		}
		return new Rectangle(base, height);
	}
}
