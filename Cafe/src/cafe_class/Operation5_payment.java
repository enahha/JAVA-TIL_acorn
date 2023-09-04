package cafe_class;
import java.util.Scanner;

public class Operation5_payment implements Operation{
	@Override
	public boolean[] bExecute(Scanner sc) {
		int input = 0; // 주문내역 저장
		boolean goToNext = false; //
		boolean wantToCancel = false; // 리턴 객체
		Orders order = OrderCollection.get_orderData();
		
		boolean[] bOrderMoreAndDummy = new boolean[2];
		bOrderMoreAndDummy[0] =  wantToCancel;
		bOrderMoreAndDummy[1] =  false;

		// 입력 반복문
		while (!goToNext) {
			// 맨트 출력 및 입력값받기
			Mention ment = new Mention();
			System.out.print(ment.getMENT9_PAY_TOOL()); //1.카드,2.현금
			String request = sc.next().toLowerCase();
			// 입력값이 숫자인지 확인
			boolean isNumber = CheckRequest.isNumber(request);
			// 만약 입력값이 숫자가 맞다면
			if (isNumber) {
				int changeStrToNum = Integer.parseInt(request); // 위에 String 으로 받아온 숫자를 int로 변경
				int range = Pay_Tool.values().length; // 메뉴(enum) 범위

				// 입력받은 숫자가 범위에 존재하는지 확인
				if (0 < changeStrToNum && changeStrToNum < range + 1) {
					input = changeStrToNum; // 존재한다면 주문내역저장변수에 할당
					
					String sPay = UnitChange.toString_Pay(changeStrToNum);
					System.out.println(sPay+" 로 결제");
					
					goToNext = true;
				} else {
					System.out.println("번호를 다시 입력바랍니다 (1~2)");
				}
			}
			// 결제 취소 시
			else if (request.equals("c")) {
				System.out.println(ment.getMENT4_CANCEL());

				// y or n 입력 확인
				request = sc.next().trim().toLowerCase();
				boolean isYesOrNo = CheckRequest.isYesOrNo(request);

				if (isYesOrNo && request.equals("y")) {
					System.out.println(ment.getMENT5_ORDER_AGAIN());
					wantToCancel = true;
					break;
				} else {
					System.out.println(ment.getMENT6_YN_ONLY());
				}
			}
		}

		// 요청사항 반영
		order.setTemper(input);

		return bOrderMoreAndDummy; // 주문계속진행시 false, 취소를 원할 시 true로
	}
}
