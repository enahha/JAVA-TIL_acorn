package classDiagram0815.main;

import java.util.Scanner;

import classDiagram0815.car_class.Car_acorn;

public class CarMain_acorn {
		
		public static void main(String[] args) {
			Car_acorn car = new Car_acorn("Hyndai", 20.5f);		
			Scanner sc = new Scanner(System.in);
			float fWantFuelQty = 0.f;
			
			System.out.println("차량 시뮬레이션을 시작합니다.");
			// 시동 켜기
			car.switchOn();
			while(true) {
				// 가속페달 밟기
				 float fRet = car.accerlate();
				// 차량 정보 출력
				car.displayCarInfo();
				if(fRet == 0.f) {
					System.out.println("현재 연료가 0입니다.");
					System.out.println("선택 방법: 1이상(연료채움) "
							+ "또는 0(연료채우지 않음");
					System.out.print("채울 연료량:>>>");
					fWantFuelQty = sc.nextFloat();
					if(fWantFuelQty > 0.f) {
						car.fillFuel(fWantFuelQty);
					} else break;
				}
				
				try { Thread.sleep(500); 		
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			// 시동 끄기
			car.switchOff();			
			sc.close();
			System.out.println("차량 시뮬레이션을 종료합니다.");
		}
	}
