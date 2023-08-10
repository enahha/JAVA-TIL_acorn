package class_this예제.class_etc;

public class Book {
	// 필드(속성) 추가 - 데이터 은닉을 위해 프라이빗으로
	private String title;
	private String author;
	private String description;
	
	// 기본 생성자를 통해 필드를 초기화
	public Book() {}
	// 인자가 있는 생성자 (name과 age를 매개변수로 받는 생성자)
	public Book(String title, String author, String description) 
	{
		this.title = title;
		this.author = author;
		this.description = description;
	}
	
	// getter, setter 메소드 영역
		// 생성자에서 값을 넣어주는 역할 , 생성자가 public이기 때문데 생성자가 객체를 생성할 수 있음. 그렇기 때문에 getter,setter가 따로 필요없음.- 생략가능
	
	// 메소드
		//동적메소드 - 오버라이드 메소드
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("book(title=%s, author=%s, description=%s)", this.title, this.author, this.description);
	}
	
	// // 내부클래스 // //
//	public class  BookBuilder{
//		// 필드영역
//		private String title; private String author; private String description;
//		// 생성자
//		public BookBuilder() {}
//		// 메소드 영역
//		public BookBuilder title(String title) {
//			this.title = title;
//			return this;  // 리턴받는 값으로 다른 메서드를 호출 할 수 있다.
//		}
//		public BookBuilder author(String author) {
//			this.author = author;
//			return this;  // 리턴받는 값으로 다른 메서드를 호출 할 수 있다.
//		}
//		public BookBuilder description(String description) {
//			this.description = description;
//			return this;  // 리턴받는 값으로 다른 메서드를 호출 할 수 있다.
//		}
//		public Book build() {
//			return new Book(this.title, this.author, this.description);
//		}
//		public static BookBulider  builder() {     // 여기서 오류⛔️ 난다. 해당 메소드는 static 영역에 있지만 이 메소드가 해당되어있는 클래스는 heqp영역에 있기 때문에 아직 실행이 되지 않아 생성되지 않는 클래스이기 떄문이다.
//			return new BookBulider();				// 해결방법, BookBuilder라는 클래스를 static 영역으로 보내준다.
//		}

	public static class BookBuilder{
		// 필드영역
		private String title; private String author; private String description;
		// 생성자
		public BookBuilder() {}
		// 메소드 영역
		public BookBuilder title(String title) {   // ✅이걸 하는 이유 : 동적메소드에서 객체를 생성하려면 new로 해야하는데 this를 사용하면 이런한 귀찮은 과정없이 생성이 가능하다는것을 보여주기 위해서.
			this.title = title;										// 이걸 사용할 때에는 객체가 생성되기 전단계이니까 this로 함,,
			return this;  // 리턴받는 값으로 다른 메서드를 호출 할 수 있다.
		}
		public BookBuilder author(String author) {
			this.author = author;
			return this;  // 리턴받는 값으로 다른 메서드를 호출 할 수 있다.
		}
		public BookBuilder description(String description) {
			this.description = description;
			return this;  // 리턴받는 값으로 다른 메서드를 호출 할 수 있다.
		}
		public Book build() {
			return new Book(this.title, this.author, this.description);
		}
	}
	
	public static BookBuilder builder() {
		return new BookBuilder();
	}

}
