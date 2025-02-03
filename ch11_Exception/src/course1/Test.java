package course1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test {
	public static void main(String[] args) {
//		m();
//		m2();
//		m3(); //try-catch-finally로 예외 직접 처리
//		m4();
		try {
			m4();
		} catch (FileNotFoundException e) {
			System.out.println("직접 처리");
		}finally {
			System.out.println("예외가 발생하더라도 실행됨");
		}
	}
	// Exception in thread "main" java.lang.StackOverflowError
	static void m() {
		m();
	}
//	Exception in thread "main" java.lang.NullPointerException
//	Compile Error X
	static void m2() {
		String str = null;
		System.out.println(str.length());
	}
	//Unhandled exception type FileNotFoundException
	//throws FileNotFoundException로 만들어진 메소드를 호출할 때 만약 파일이 없으면
	// 대응책에 따라 대응하며 대응책이 없으면 문법 오류 발생
	//Checked Exception
	static void m3() {
		//Try-catch-finally를 이용해 직접 처리
		try{
			FileInputStream fis = new FileInputStream("readme.md");
		}catch (FileNotFoundException e){
			System.out.println("직접 처리");
		}finally {
			System.out.println("예외가 발생하더라도 실행됨");
		}
	}

	//대응책
	static void m4() throws FileNotFoundException {
		System.out.println("m4()");
	}
	
}
