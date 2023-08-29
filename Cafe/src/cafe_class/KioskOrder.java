package cafe_class;

import java.util.Scanner;

public class KioskOrder {
	
	boolean wantToCancel = false;	// 주문 취소 여부
	boolean orderMore = true;		//추가주문 여부
	boolean orderCheck = true;		//주문확인 결과
	boolean[] bOperationlist = new boolean[2];
	
	public KioskOrder() {
		start();
	}
	
	// 주문을 받고, 주문확인 후 결재하는 메서드 호출
	private void start() {
		wantToCancel= false;
        orderMore = true;
        orderCheck = true;
        int count = 0;

        //추가주문 여부
        while (orderMore) {
          	wantToCancel        = false;
        	boolean[] boolArr   = receiveOrder(); 	// 주문을 받은는 메소드 호출
            orderMore           = boolArr[0];

            //주문개수 증가
            if(!boolArr[1]){
                count++;
                System.out.println(">>>>>>>>>결제창");
            }
        }
        
/*
 * 주문 결재 후 확인 메서드추가 구역
 * 
 * 추가 주문을 하면 오류가 남
 * ==> 결재부분에서 list로 받아 주문내역과 금액을 출력해주어야 함.
 * 
 */


    }
	
	// Operation인터페이스객체를 호출하여 주문받기
	private boolean[] receiveOrder() {
		Scanner sc = new Scanner(System.in);
		
		boolean[] booleans = new boolean[2]; 	// 추가주문여부와 취소여부를 저장할 boolean array
		
		while(!wantToCancel) {
			printMenu();
			Operation oper = null;		//	null로 초기화
			
			// To go or Store
            oper = new Operation0_where();
            bOperationlist = oper.bExecute(sc);
            wantToCancel = bOperationlist[0];
            if(wantToCancel) { reset(); break; }
            
            // 음료 종류
            oper = new Operation1_menu();
            bOperationlist = oper.bExecute(sc);
            wantToCancel = bOperationlist[0];
            if(wantToCancel) { reset(); break; }
            
            //음료 온도
            	/*  위에서 반환된 bOperationlist를 사용하기 위해
            	 *  Operation2_temper생성자를 만들어 bOperationlist[1]이 isJuice를 사용함.
            	 */ 
            oper = new Operation2_temper(bOperationlist);			
            bOperationlist = oper.bExecute(sc);
            wantToCancel = bOperationlist[0];
            if(wantToCancel) { reset(); break; }
            
            // 추가 주문
            oper = new Operation3_oderMore();
            bOperationlist = oper.bExecute(sc);
            orderMore = bOperationlist[0];
            // 추가주문을 하지 않는다면 주문확인으로 넘어감
            if(!orderMore) {			
            	oper = new Operation4_oderCheck();
            	bOperationlist = oper.bExecute(sc);
            	bOperationlist[0] = orderCheck;
            	break;
            }
		}
		
        booleans[0] = orderMore;
        booleans[1] = wantToCancel;
        return booleans;
	}
	
    //주문취소시 List를 null로 만듬
    private void reset(){
        System.out.println("reset 호출");
        OrderCollection col = OrderCollection.getInstance();
        col.reset_orderInfo();
    }
    
    
	//메뉴 출력
	private void printMenu() {
		Menu_kor[] menukor = Menu_kor.values();
		Menu_price price = new Menu_price();
		int[] priceArr	= price.getBeveragePrice();
		
		System.out.println("----------------------");
		System.out.println("메뉴");
		for(int i = 0; i<Menu_kor.values().length; i++) {
			System.out.printf(" %d. %s\t%d원\n", i+1, menukor[i], priceArr[i]);
		}
		System.out.println("———————————");
	}
}
