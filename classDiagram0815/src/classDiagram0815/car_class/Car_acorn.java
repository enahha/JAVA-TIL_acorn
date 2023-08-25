package classDiagram0815.car_class;

public class Car_acorn {
		// 필드 영역
		private String sManufacturer; // null
		private float fFuel; // 0.0
		private float fSpeed; // 0.0
		private int IRegistrationNum; // 0
		private boolean bRunning; // false 주행여부

		// 생성자 영역
		public Car_acorn() {}

		public Car_acorn(String sManufacturer, float fFuel) {
			this.sManufacturer = sManufacturer;
			this.fFuel = fFuel;
		}

		// 메소드 영역
		// Getters/Setters 영역
		// (동적)메소드 영역
		public void switchOn() { bRunning = true; }
		public void switchOff() { bRunning = false; }

		public float accerlate() {
			if (!bRunning) return 0.f;

			if (fSpeed >= 300) { fSpeed += 300; } else {
				fSpeed += 20; }

			if (fFuel > 0.f) { fFuel -= 1.0;
				if (fFuel < 0) { fFuel = 0.f; _break(); }
			}
			return fFuel;
		}
		public void _break() { fSpeed = 0.f; }
		
		public void fillFuel(float fWantFuelQty) {
			this.fFuel += fWantFuelQty;
		}
		
		public void displayCarInfo() {
			System.out.println("현재연료: " + fFuel);
			System.out.println("현재속도: " + fSpeed);
		}
	}


