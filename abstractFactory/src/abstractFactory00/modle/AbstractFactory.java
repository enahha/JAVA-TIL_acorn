package abstractFactory00.modle;

public abstract class AbstractFactory {

    // 필드
	// 생성자 영역 ==>> 추상클래스는 생성자를 생성할 수 없으므로 이 영역은 팔요하지 않음
	// 메소드 영역
  
    public abstract Shape getShape(String type);  // 추상메소드, shapeFactory와 roundedFactory를 하나로 묶기 위해 사용함.

}