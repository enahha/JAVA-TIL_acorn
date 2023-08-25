package classDiagram0815.main;

import java.util.Scanner;

import classDiagram0815.car_class.Car;

public class CarMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Car car = new Car("hundai", 20.5f);
		
		System.out.println(car.getsManufacturer());
		System.out.println(car.getfFuel());
		
		// 차량 구동
		car.swithchOn(); System.out.println("시동이 켜졌습니다. ");
		// 가속페달 밟기
		while(true) {
			System.out.print("[[[accerlate : 1 / brake : 0 ]]]>>>");
			int operation= sc.nextInt();
			if(operation ==1) {
				car.accerlate();	
				car.displqyCarInfo();
				if(car.getfFuel() < 1) {
					System.out.print("(((refuel : 1 / No refuel : 0 ))) >>>");
					int refuel= sc.nextInt();
					if(refuel == 1) {
						System.out.print("((how much would you like to fill...)) >>>");
						float refuelVoulme = sc.nextFloat();
						car.fillFuel(refuelVoulme);
						car.displqyCarInfo();
					}
					else {
						System.out.println("_not enough fuel stop the car. >>>");
						break;
					}
				}
			}
//			continue;		// 해도 안해도 그만. 왜냐면 어차피 조건이 true니까.
		}
		System.out.println("=============================");
		// 차량 중지
		car._brake();
		car.displqyCarInfo();
		
		sc.close();
	}
}
