package 추상_abstrict;

public class Circle extends Shape {
	
	private double r;
	
	public Circle() {}
	public Circle(String name, double r) {
		super(name);
		this.r = r;
	}

	@Override
	public double area() {
		double dArea = Math.PI * r * r;
		return dArea;
	}

	@Override
	public double perimeter() {
		double dperimeter = Math.PI * r * 2;
		return dperimeter;
	}

}
