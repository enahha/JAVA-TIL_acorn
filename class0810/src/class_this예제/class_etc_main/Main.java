package class_this예제.class_etc_main;

import class_this예제.class_etc.Book;

public class Main {
	public static void main(String[] args) {
		// 인자가 있는 생성자를 사용해 객체를 만들고 인자를 넣어줌
		Book book = new Book(
							"꿀벌의 예언 1", 
							"베르나르베르베", 
							"인류의 미래를 어쩌구");
		
		String str = book.toString();
		System.out.println(str);
		
		Book boook = Book.builder()
			.title("꿀벌의 예언 1")
			.author("베르나르베르베")
			.description("인류의 미래를 어쩌구")
			.build();
		
		// 왜 이런짓을 하는 건가요..?
		System.out.println(boook);
	}
}
