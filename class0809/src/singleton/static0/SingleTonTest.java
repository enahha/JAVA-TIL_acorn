package singleton.static0;

public class SingleTonTest {   // 이 클래스는 외부에서 객체를 생성new할 수 없다. 
	private static SingleTonTest instance = null;
	
	private String name;
	
	private SingleTonTest() {}     // 기본생성자
	
	private SingleTonTest(String name) {   // 인자가 있는 생성자
		this.name = name;
	}  //  위에거는 객체 생성이 안된다.
	
	public static SingleTonTest getInstance(String name) {  // static 이여야지 객체 생성없이 만들 수 있다.  메모리 자원을 낭비하지 않기위해
		if(instance == null) {
			instance = new SingleTonTest(name);
			System.out.println("처음 생성한 " + name + "객체를 리턴합니다.");
		}
		else System.out.println("이미 생성된 " + name + "객체를 리턴합니다. (이제 객체를 새로이 생성하지 않음.)");
		return instance;
	}
}
