package classDiagram0815.car_class;

public class Car {
	// 필드
	private String sManufacturer;		// null
	private float fFuel;				// 0.0
	private float fSpeed;				// 0.0
	private int iRegistrationNum;		// 0.0
	private boolean bRunning;		// false (주행여부)
	
	// 생성자 영역
	public Car() {}
	public Car(String sManufacturer, float fFuel) {
		this.sManufacturer = sManufacturer;
		this.fFuel = fFuel;
	}
	
	// 메소드 영역
	// getters/setters
	public String getsManufacturer() {
		return sManufacturer;
	}
	public void setsManufacturer(String sManufacturer) {
		this.sManufacturer = sManufacturer;
	}
	public float getfFuel() {
		return fFuel;
	}
	public void setfFuel(float fFuel) {
		this.fFuel = fFuel;
	}
	public float getfSpeed() {
		return fSpeed;
	}
	public void setfSpeed(float fSpeed) {
		this.fSpeed = fSpeed;
	}
	public int getiRegistrationNum() {
		return iRegistrationNum;
	}
	public void setiRegistrationNum(int iRegistrationNum) {
		this.iRegistrationNum = iRegistrationNum;
	}
	public boolean isbRunning() {
		return bRunning;
	}
	public void setbRunning(boolean bRunning) {
		this.bRunning = bRunning;
	}
	// 동적 메소드
	public void swithchOn() {
		bRunning = true;
	}
	public void swithchOff() {
		bRunning = false;
	}
	public void accerlate() {
		// 속도 변화
		if(!bRunning) return;	// 만약 주행중이 아닐경우 이 메소드를 나가 호출한곳으로 return.
		
		if(fSpeed >= 300) {fSpeed = 300;}
		else fSpeed += 20;
		
		if(fFuel < 1.0f) { _brake(); }
		else fFuel -= 1.0f;
	}
	public void fillFuel(float fFloat) {
		fFuel += fFloat;
	}
	public void _brake() {
		fSpeed = 0f;
	}
	public void displqyCarInfo() {
		System.out.println("Fuel Volume : " + fFuel + "_ Speed : " + fSpeed);
	}

}
