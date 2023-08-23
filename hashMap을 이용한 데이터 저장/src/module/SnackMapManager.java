package module;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SnackMapManager {
    private Map<Integer, String> snackMap;
    private int currentKey;
    
    public SnackMapManager() {
        snackMap = new HashMap<>();
        currentKey = 1;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("스낵 종류를 입력하세요. (끝내려면 'exit' 입력)");
            System.out.print("종류: ");
            String skind = scanner.nextLine();

            if (skind.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.println("스낵 이름을 입력하세요.");
            System.out.print("이름: ");
            String sName = scanner.nextLine();

            System.out.println("스낵 맛을 입력하세요.");
            System.out.print("맛: ");
            String sFlavor = scanner.nextLine();

            System.out.println("스낵 개수를 입력하세요.");
            System.out.print("개수: ");
            int sNum = scanner.nextInt();

            System.out.println("스낵 가격을 입력하세요.");
            System.out.print("가격: ");
            int sPrice = scanner.nextInt();
            scanner.nextLine(); // Clear the newline character left in the buffer

            String data = skind + "_" + sName + "_" + sFlavor + "_" + sNum + "_" + sPrice;
            snackMap.put(currentKey, data);
            currentKey++;
            // 해당 입력값 출력
            System.out.println(skind + "(" + sName + " : " + sFlavor + " - "
   				 + sNum + "개 , ₩ " + sPrice);
        }
        // hashmap에 저잗된 내용을 전체 출력
        System.out.println("전체 내용:");
        for (Map.Entry<Integer, String> entry : snackMap.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }

        scanner.close();
    }
}