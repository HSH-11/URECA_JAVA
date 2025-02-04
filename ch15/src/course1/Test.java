package course1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Board> list = new ArrayList<>();
		
//		list.add(new Board("제목1","내용1","작성자1"));
//		list.add(new Board("제목2","내용2","작성자2"));
//		list.add(new Board("제목3","내용3","작성자3"));
//		list.add(new Board("제목4","내용4","작성자4"));
//		
//		System.out.println(list);// 순서 유지
//		System.out.println(list.size());
//		System.out.println(list.get(2));
//		
//		//중복 허용
//		Board board = new Board("제목5","내용5","작성자5");
//		list.add(board);
//		System.out.println(list.size());
//		list.add(board);
//		System.out.println(list.size());
//		System.out.println(list);
//		
//		//삭제 (index,객체)
//		list.remove(1); // 제목 2 항목 삭제
//		System.out.println(list);
//		
//		list.remove(new Board("제목3","내용3","작성자3"));
//		System.out.println(list); //삭제 X <-equals()재정의 X
//		
//		list.remove(board); //board 참조 값(주소값으로)으로 찾기 때문에 object의 equals() ==> == 비교
//		System.out.println(list);
//		
//		//만약 필드값 등 전달되는 객체의 내용으로 삭제하고 싶으면 equals(),hashcode()를 오버라이딩 해야함
//		//재정의 후에 "제목 3" 삭제 됨
		
		list.add(new Board("제목1","내용1","작성자1"));
		list.add(new Board("제목2","내용2","작성자2"));
		list.add(new Board("제목3","내용3","작성자3"));
		list.add(new Board("제목4","내용4","작성자4"));
		list.add(new Board("제목4","내용4","작성자4"));
		
		//index
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		//for each
		for (Board board : list) {
			System.out.println(board);
		}
		//iterator
		Iterator<Board> itr =  list.iterator();
		while(itr.hasNext()) {
			Board board = itr.next();
			System.out.println(board);
		}
		// Board 객체 중 new Board("제목4","내용4","작성자4")와 동일한 객체
		System.out.println();
		//인덱스 기반 삭제 - 오동작 가능성(지양) -> 뒤에서 부터 삭제
		Board board = new Board("제목4","내용4","작성자4");
//		for (int i = 0; i < list.size(); i++) {
//			if(list.get(i).equals(board)) list.remove(i);
//		}
//		System.out.println(list);
		
		//iterator
		Iterator<Board> itr2 = list.iterator();
		while(itr2.hasNext()) {
			Board board2 = itr2.next();
			if(board2.equals(board)) itr2.remove();
		}
		System.out.println(list);
	}

}
