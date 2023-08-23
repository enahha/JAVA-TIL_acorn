package classDiagram.snackClassDiagram;

import java.util.Scanner;

public class SnackMenu {		// 출력을 담당
	
	private Scanner sc;
	private SnackController snackcontroller;
	private Snack snnnack;
	
	public void Menu() {
		snackcontroller = new SnackController();
		sc = new Scanner(System.in);
		

		System.out.println("스낵류를 입력하세요.>>");
		System.out.println("종류 : ");
		String skind = sc.nextLine();
		System.out.println("이름 : ");
		String sName = sc.nextLine();
		System.out.println("맛 : ");
		String sFlavor = sc.nextLine();
		System.out.println("개수 : ");
		int sNum = sc.nextInt();
		System.out.println("가격 : ");
		int sPrice = sc.nextInt();
		
		snnnack = snackcontroller.saveData(skind, sName, sFlavor, sNum, sPrice);
		// snackcontroller.saveData의 리턴값이 snack이니까. 
		
		System.out.println(snnnack.getKind() + "(" + snnnack.getName() + " : " + snnnack.getFlavor() + " - "
				 + snnnack.getNumOf() + "개 , ₩ " + snnnack.getPrice());
		
		System.out.println("=====================");
//		for(int x: map.keySet()) {
//			for(int z=1; z<map.get(x).size(); z++) 
//				System.out.print(map.get(x).get(z));
//				System.out.println();
//			}
		
//		for (Map.Entry<String, ArrayList<Integer, ArrayList<Snack>> entry : multiValueMap.entrySet()) {
//            String key = entry.getKey();
//            List<String> values = entry.getValue();
//            System.out.print(key + ": ");
//            for (String value : values) {
//                System.out.print(value + ", ");
//            }
//            System.out.println();
//        }
		}
	}
