package study0817;

import java.util.Scanner;

public class ordergoodsMain {

	public static void main(String[] args) {
		OrderGoods og = new OrderGoods();
		
		Scanner sc = new Scanner(System.in);
		
		int iProperStock1 = og.getiProperStock1();
		int iProperStock2 = og.getiProperStock2();
		int iCurrentStock1 = og.getiCurrentStock1();
		int iCurrentStock2 = og.getiCurrentStock2();
		
		for(int i = 0; i < 2; ++i) {
			iCurrentStock1 = og.goodsStockProcess(iCurrentStock1, iProperStock1, sc);
			og.setiCurrentStock1(iCurrentStock1);
			iCurrentStock2 = og.goodsStockProcess(iCurrentStock2, iProperStock2, sc);
			og.setiCurrentStock2(iCurrentStock2);
		}
		
		System.out.println("====================================");
		og.printStock(iProperStock1, iCurrentStock1, iProperStock2, iCurrentStock2);
		
		sc.close();

	}

}
