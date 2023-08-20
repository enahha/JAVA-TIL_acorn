package 추상_abstrict;

public class Rectangle extends Shape {

	private double width;
	private double hight;
	
	public Rectangle() {}
	public Rectangle(String name, double width, double hight) {
		super(name);
		this.width = width;
		this.hight = hight;
	}
	
	@Override
	public double area() {
		double dArea = width * hight;
		return dArea;
	}

	@Override
	public double perimeter() {
		double dPerimeter = (width + hight) * 2;
		return dPerimeter;
	}

}
