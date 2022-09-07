import java.text.DecimalFormat;

public class Triangle {
		
	private double sideA;
	private double sideB;
	private double sideC;
		
	public final static String POLYGONSHAPE = "Triangle";
	public final static double DEFAULT_SIDE = 1;
	
	final DecimalFormat df = new DecimalFormat("0.00");
		
	public Triangle() {
		sideA = DEFAULT_SIDE;
		sideB = DEFAULT_SIDE;
		sideC = DEFAULT_SIDE;
	}
	
	public Triangle(double inputA, double inputB, double inputC) {	
		if (!isTriangle(inputA, inputB, inputC)) 
		{
			sideA = DEFAULT_SIDE;
			sideB = DEFAULT_SIDE;
			sideC = DEFAULT_SIDE;
		}
		else
		{
			sideA = inputA;
			sideB = inputB;
			sideC = inputC;
		}
	}
	
	public Triangle(double[] sides) {
		if (!isTriangle(sides) || sides == null || sides.length != 3) {
			sideA = DEFAULT_SIDE;
			sideB = DEFAULT_SIDE;
			sideC = DEFAULT_SIDE;
		}
		else 
		{
			sideA = sides[0];
			sideB = sides[1];
			sideC = sides[2];
		}
	}
	
	public Triangle(Triangle tri) {
		if (tri == null) {
			sideA = DEFAULT_SIDE;
			sideB = DEFAULT_SIDE;
			sideC = DEFAULT_SIDE;
		}
		else 
		{
			this.sideA = tri.sideA;
			this.sideB = tri.sideB;
			this.sideC = tri.sideC;
		}
	}
	
	public double getSideA() {
		return this.sideA;
	}
	
	public double getSideB() {
		return this.sideB;
	}
	
	public double getSideC() {
		return this.sideC;
	}
	
	public double[] getSides() {
		return new double[] {sideA, sideB, sideC};
	}
	
	public boolean setSideA(double a) {
		if (!isTriangle(a, this.sideB, this.sideC)) {
			return false;
		}
		this.sideA = a;
		return true;
	}
	
	public boolean setSideB(double b) {
		if (!isTriangle(b, this.sideA, this.sideC)) {
			return false;
		}
		this.sideB = b;
		return true;
	}
	
	public boolean setSideC(double c) {
		if (!isTriangle(c, this.sideA, this.sideB)) {
			return false;
		}
		this.sideC = c;
		return true;
	}
	
	public boolean setSides(double[] sides) {
		if (sides.length == 3) {
			if (isTriangle(sides[0], sides[1], sides[2])) {
				this.sideA = sides[0];
				this.sideB = sides[1];
				this.sideC = sides[2];
				return true;
			}
			else 
			{
				return false;
			}	
		}
		else 
		{
			return false;
		}
	}
	
	public double getAngleA() {
		return lawOfCosines(sideC, sideB, sideA);
	}
	
	public double getAngleB() {
		return lawOfCosines(sideC, sideA, sideB);
	}
	
	public double getAngleC() {
		return lawOfCosines(sideA, sideB, sideC);
	}
	
	public double[] getAngles() {
		return new double[] {getAngleA(), getAngleB(), getAngleC()};
	}
	
	//Helper method
	public static boolean isTriangle(double a, double b, double c) {

		if (a > 0 && b > 0 && c > 0 && a < b + c && b < c + a && c < a + b)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	//Helper method
	public static double lawOfCosines(double a, double b, double c) {
		return Math.acos((b * b + c * c - a * a) / (2.0 * b * c));
	}

	public static boolean isTriangle(double[] sides) {
		if (sides != null && sides.length == 3) {
			if (isTriangle(sides[0], sides[1], sides[2])) {
				return true;
			}
		}
		return false;
	}
	
	public String toString() {
		return (POLYGONSHAPE + "(" + df.format(sideA) + ", " + df.format(sideB) + ", " + df.format(sideC) + ")");
	}
}
	

