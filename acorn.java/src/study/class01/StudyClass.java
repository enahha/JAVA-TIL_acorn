package study.class01;

public class StudyClass {
// 속성 또는 필드 영역  :  변수 선언하는 영역, 객체화(인스턴스화) 시켜서 사용함. //
	private String sEntryNumber;
	private String sName;
	private String sAddress;   // private을 붙이면 외부에서 클래스를 콜해서 사용할 때도 보이지 않음. (데이터 은닉)

// 함수(메소드) 영역  :  대부분 public을 붙여 사용. //
	// 생성자 영역
		// 기본(defult) ⭕️ 생성자는 자바에서 자동적으로 만들어 주기때문에 생략할 수 있다.
	public StudyClass() 
	{
		
	}
	
	// getter/ setter 메소드 영역
//	public String getEntryNumber() {  // get이기 때문에 안에 들어가는 인자가 없다. 하지만 get은 return 값이 있어야 한다.
//		return sEntryNumber;
//	}
//	public void setEntryNumber(String sEntryNumber) {  // set이기때문에 return 해주는 값이 없으므로 void 선언을 해준다.
//		this.sEntryNumber = sEntryNumber; // ((동일한 이름을 가지고 있어 워닝이 뜬거임. ))함수의 인자로 들어온 변수와 필드에 있는 변수를 구분해 주어야 함. this라는 클래스를 써 구분을 해준다.
//	}
	// 아래는 이클립스 내부의 소스에 getter/ setter 만들기를 활용해 만든것임.
	public String getsEntryNumber() {
		return sEntryNumber;
	}

	public void setsEntryNumber(String sEntryNumber) {
		this.sEntryNumber = sEntryNumber;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsAddress() {
		return sAddress;
	}

	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}

	
	// 오버라이딩 메소드 영역
	
	
	
	// 사용자 정의 메소드 영역
		// 정적 메소드(class 메소드)((static이 붙은거))
	
		// 동적 메소드(인스턴스(객체) 메소드)
}
