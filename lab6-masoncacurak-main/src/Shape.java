
public abstract class Shape implements Comparable<Shape> {

	private int id;
	private static int nextID = 0;
	
	protected Shape() {
		this.id = nextID;
		nextID++;
	}
			
	public int getID() {
		return this.id;
	}
	
	public abstract double getPerimeter();
	
	public abstract double getArea();
	
	public int compareTo(Shape other) {				
		String thisType = getClass().getName();
		String otherType = other.getClass().getName();
		if (thisType.compareTo(otherType) < 0) {
			return -1;
		}
		else if (thisType.compareTo(otherType) > 0) {
			return 1;
		}
		else {
			if (getPerimeter() < other.getPerimeter()) {
				return -1;
			}
			else if (getPerimeter() > other.getPerimeter()) {
				return 1;
			}
			else {
				return Double.compare(getArea(), other.getArea());
			}
		}
	}
	
	@Override
	public String toString() {
		return "<"
				+ getClass().getName()
				+ ", ID: " + id
				+ ", PERIMETER: " + String.format("%.1f", getPerimeter())
				+ ", AREA: " + String.format("%.1f", getArea())
				+ ">";
	}
}