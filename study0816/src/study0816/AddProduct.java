package study0816;

import java.util.Scanner;

public class AddProduct {
	// 적정재고 초기화
	// 현재재고 초기화
	// 반복문(10번)
		// 현재재고와 적정재고 확인(현재재고가 적정재고보다 작은 경우 차이만큼 현재재고를 보충)
		// 사용자 주문 시뮬레이션(랜덤을 사용) >> 현재재고 - 사용자 주문량
			// 출력 : 적정재고, 현재재고
			// 입력대기(Tread.sleep(1000))
	// 최종적인 출력 : 적정재고, 현재재고
	
	public static void main(String[] args) {
		// 적정재고 초기화(4종류 상품)
		int iProperStock1 = 10; int iProperStock2 = 10;
		// 현재 재고 초기화(4종류 상품)
		int iCurrentStock1 = 0; int iCurrentStock2 = 0;
		
		Scanner sc = new Scanner(System.in);
		
		// 반복문(10)
		for(int i = 0; i < 10; ++i) {
			// 사용자 주문 처리 함수
			iCurrentStock1 = goodsStockProcess(iCurrentStock1, iProperStock1, sc);
			iCurrentStock2 = goodsStockProcess(iCurrentStock2, iProperStock2, sc);
		}
		// 최종적인 출력: 적정재고, 현재재고
		System.out.println("적정재고:" + iProperStock1 + "현재재고:" + iCurrentStock1);
		System.out.println("적정재고:" + iProperStock2 + "현재재고:" + iCurrentStock2);
		sc.close();
	}

	public void printStock() {
		
	}
	public static int goodsStockProcess(int iCurrentStock, int iProperStock, Scanner sc) {
		// 현재재고와 적정재고 확인
		// 현재재고가 적정재고보다 작은지
		System.out.println("보충전현재재고:" + iCurrentStock);
		if(iCurrentStock < iProperStock) {
			// 적정재고와의 차이만큼 현재 재고를 보충
			// iCurrentStock1 = iCurrentStock1 + (iAdjustedStock1 - iCurrentStock1);
			iCurrentStock += (iProperStock - iCurrentStock);
		}
		System.out.println("보충후현재재고:" + iCurrentStock);
		System.out.print("주문하시겠습니까?>>>(y/n) ");
		String sInputValue = sc.nextLine();
		if(sInputValue.equalsIgnoreCase("y")) {

			// userOrderProcess(iInputValue);
			iCurrentStock = userOrderProcess(iCurrentStock, sc);
			System.out.println("고객주문후 현재 재고:" + iCurrentStock);
		}
		// 사용자 주문 시뮬레이션(랜덤을 사용)
		//int iCustomerOrderQty = (int)(Math.random()*iProperStock);
			// 현재재고 - 사용자주문량
		//iCurrentStock -= iCustomerOrderQty;
		// 출력: 적정재고, 현재재고
		System.out.println("적정재고:" + iProperStock + "현재재고:" + iCurrentStock);	
		
		return iCurrentStock;
	}
	
	 static int userOrderProcess(int iCurrentStock, Scanner sc) {
		System.out.print("주문량을 입력하세요:>>> ");
		int iInputValue = sc.nextInt();
		// 현재재고 - 사용자주문량
		iCurrentStock -= iInputValue;
		
		return iCurrentStock;
	}
}
