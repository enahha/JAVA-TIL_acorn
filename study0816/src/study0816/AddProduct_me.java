package study0816;

import java.util.Random;
import java.util.Scanner;

public class AddProduct_me {
	public static void main(String[] args) {
		// 적정재고와 현재재고를 출력하는 프로그램을 만들기. 적정재고보다 현재재고가 적으면 채워지는 함수로
		// int randInt = ra   (현재재고 = randInt)
		
		Scanner sc = new Scanner(System.in);
		Random rm = new Random();
		
		int minStock = 15;
		int stock1 = 0;
		int stock2 = 0;
		int stock3 = 0;
		int stock4 = 0;
		
		stock1= RandomStock(rm);
		stock2= RandomStock(rm);
		stock3= RandomStock(rm);
		stock4= RandomStock(rm);
		
		for(int i=0; i<10; i++) {
			FillStock(stock1, minStock);
			FillStock(stock2, minStock);
			FillStock(stock3, minStock);
			FillStock(stock4, minStock);
		}
	}
	
	public static int RandomStock(Random rm) {
		int stock = rm.nextInt(30);
		return stock;
	}
	
	public static void FillStock(int stock, int minStock) {
		System.out.println("추가 전 현재재고 : " + stock + "  적정재고 : " + minStock);
		// 현재 재고량이 적정 재고량보다 적은 경우
		if (minStock > stock) 
		{
			int lack = minStock - stock;
			stock += lack;
			System.out.println("현재재고 : " + stock + "  적정재고 : " + minStock + " | 추가 주문 수량 : " + lack);
		}
		
		// 현재 재고량이 적정 재고량보다 많은 경우
		if (minStock < stock) 
		{
			int overflow = stock - minStock;
			stock -= overflow;
			System.out.println("현재재고 : " + stock + "  적정재고 : " + minStock + " | 초과수량 : " + overflow);
		}
	}
}
