package study0817;

import java.util.Scanner;

public class OrderGoods {
		private int iProperStock1; private int iProperStock2;
		private int iCurrentStock1; private int iCurrentStock2;
		// 생성자
		public OrderGoods() {this(10,10);}
		
		public OrderGoods(int iProperStock1, int iProperStock2) {
			this.iProperStock1 = iProperStock1;
			this.iProperStock2 = iProperStock2;
		}
		
		public OrderGoods(int iProperStock1, int iProperStock2, int iCurrentStock1, int iCurrentStock2)
		{
			this.iProperStock1 = iProperStock1;
			this.iCurrentStock1 = iCurrentStock1;
			this.iProperStock2 = iProperStock2;
			this.iCurrentStock2 = iCurrentStock2;
		}
		// getter,setter
		public int getiProperStock1() {
			return iProperStock1;
		}

		public void setiProperStock1(int iProperStock1) {
			this.iProperStock1 = iProperStock1;
		}

		public int getiProperStock2() {
			return iProperStock2;
		}

		public void setiProperStock2(int iProperStock2) {
			this.iProperStock2 = iProperStock2;
		}

		public int getiCurrentStock1() {
			return iCurrentStock1;
		}

		public void setiCurrentStock1(int iCurrentStock1) {
			this.iCurrentStock1 = iCurrentStock1;
		}

		public int getiCurrentStock2() {
			return iCurrentStock2;
		}

		public void setiCurrentStock2(int iCurrentStock2) {
			this.iCurrentStock2 = iCurrentStock2;
		}
		
		public void printStock(int iProperStock1, int iCurrentStock1, 
				int iProperStock2, int iCurrentStock2) {
			System.out.println("적정재고:" + iProperStock1 + "현재재고:" + iCurrentStock1);
			System.out.println("적정재고:" + iProperStock2 + "현재재고:" + iCurrentStock2);		
		}
		
		public int goodsStockProcess(int iCurrentStock, int iProperStock, Scanner sc) {
			if(iCurrentStock < iProperStock) {
				iCurrentStock += (iProperStock - iCurrentStock);
			}
			System.out.print("주문하시겠습니까?>>>(1) ");
			int iInputValue = sc.nextInt();
			if(iInputValue == 1) {
				iCurrentStock = userOrderProcess(iCurrentStock, sc);
			}

			System.out.println("적정재고:" + iProperStock + "현재재고:" + iCurrentStock);	
			
			return iCurrentStock;
		}
		
		private int userOrderProcess(int iCurrentStock, Scanner sc) {
			System.out.print("주문량을 입력하세요:>>> ");
			int iInputValue = sc.nextInt();
			iCurrentStock -= iInputValue;
			
			return iCurrentStock;
		}
}
