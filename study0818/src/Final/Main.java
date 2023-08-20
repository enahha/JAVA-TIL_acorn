package Final;

public class Main {
	
	public static void main(String[] args) {
		Child child = new Child();
		child.getChild01();   // 자기자신
		child.getParent01();   //부모꺼 
		child.getParent02();
		
		Child child01 = new Child(20,20,30);
		System.out.println(child01.getChild01());   // 자기자신
		System.out.println(child01.getParent01());   //부모꺼 
		System.out.println(child01.getParent02());
		
		System.out.println(child01.parent01);
	}
}
