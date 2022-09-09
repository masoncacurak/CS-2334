import java.text.DecimalFormat;

public class Triangle {
		
	private double sideA;
	private double sideB;
	private double sideC;
		
	public static final String POLYGONSHAPE = "Triangle";
	public static final double DEFAULT_SIDE = 1.0;
	
	final DecimalFormat df = new DecimalFormat("0.00");
		
	public Triangle() {
		sideA = DEFAULT_SIDE;
		sideB = DEFAULT_SIDE;
		sideC = DEFAULT_SIDE;
	}
	//Good
	public Triangle(double inputA, double inputB, double inputC) {	
		if (!isTriangle(inputA, inputB, inputC)) {
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
		if (tri != null) {
			if(tri.getSideA() + tri.getSideB() > tri.getSideC()) {
			this.sideA = tri.getSideA();
			this.sideB = tri.getSideB();
			this.sideC = tri.getSideC();
		}
		else 
		{
			this.sideA = DEFAULT_SIDE;
			this.sideB = DEFAULT_SIDE;
			this.sideC = DEFAULT_SIDE;
			}
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
	
	public boolean setSideA(double sideA) {
		if (isTriangle(sideA, this.sideB, this.sideC)) {
			this.sideA = sideA;
			return true;
		}
		return false;
	}
	
	public boolean setSideB(double sideB) {
		if (isTriangle(sideB, this.sideA, this.sideC)) {
			this.sideB = sideB;
			return true;
		}
		return false;
	}
	
	public boolean setSideC(double sideC) {
		if (isTriangle(sideC, this.sideA, this.sideB)) {
			this.sideC = sideC;
			return true;
		}
		return false;
	}
	
	public boolean setSides(double[] sides) {
		if (isTriangle(sides)) {
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
		double sqrtA = Math.pow(a,  2);
		double sqrtB = Math.pow(b,  2);
		double sqrtC = Math.pow(c,  2);
		
		double answer = Math.acos((sqrtA + sqrtB - sqrtC) / (2 * a * b));
		answer = (answer * 180) / Math.PI;
		return answer;
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
		String s = "(%.4f, %.4f, %.4f)";
		return POLYGONSHAPE + String.format(s, getSideA(), getSideB(), getSideC());
	}
}
	

