package class_inheritance_객체복사;

public class TestMain {

	public static void main(String[] args) {
		Test1 test1 = new Test1(10,20);
		Test2 test2 = new Test2(30,40);
		
		System.out.println(test1);
		System.out.println(test2);

		System.out.println("a : " +  test1.getA());
		System.out.println("b : " +  test1.getB());
		System.out.println("c : " +  test2.getC());
		System.out.println("d : " +  test2.getD());
	// --------------- 값 (필드) (속성) 복사 ⤵  ---------------️
		test1.setA(test2.getC());   //이게 바꿔주는거임.
		test1.setB(test2.getD());
		
		System.out.println(test1);
		System.out.println(test2);

		System.out.println("a : " +  test1.getA());
		System.out.println("b : " +  test1.getB());
		System.out.println("c : " +  test2.getC());
		System.out.println("d : " +  test2.getD());

	}

}
