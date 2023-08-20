package 추상_abstrict;

public class Main_shape {

	public static void main(String[] args) {
		Shape shape = new Circle("원" , 3);    // 객체가 다른 이유 = 다향성 
		shape.draw();
		
		Shape shape01 = new Rectangle("직사각형" , 3.0, 5.0);
		shape01.draw();
	}
}
