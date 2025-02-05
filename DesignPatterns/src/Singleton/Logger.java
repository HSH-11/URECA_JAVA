package Singleton;

import java.time.LocalDateTime;

/**
  1. 클래스 내부에서 자기 자신을 참조하는 정적 변수 생성
  2. 생성자를 private 선언하여 외부에서 객체 생성 차단
  3. 정적 메서드를 통해 단 하나의 인스턴스 반환
 * 
 */
/**싱글톤 패턴의 변형-synchronized 추가
public static synchronized Logger getInstance()
멀티 스레드 환경에서는 instance 여러번 초기화될 위험이 있으므로 이를 방지하기 위해 synchronized 키워드 추가**/
public class Logger {
	
	// 1. 정적 변수로 단 하나의 Logger 인스턴스 저장
	//private static Logger instance = new Logger(); -> eager loading
	private static Logger instance;
	// 2. private 생성자로 외부에서 객체 생성 불가능하도록 설정
	private Logger() {}
	
	// 3. 정적 메서드를 통해 유일한 인스턴스를 반환
	public static Logger getInstance() { 
		if(instance == null) {
			instance = new Logger();
		}
		return instance; //lazy loading
	}
	public void log(String message) {
		LocalDateTime ldt = LocalDateTime.now();
		String date = ldt.getYear() + "/" + ldt.getMonthValue() + "/" + ldt.getDayOfMonth();
		String time = ldt.getHour() + ":" + ldt.getMinute() + ":" + ldt.getSecond();

		System.out.println("[" + date + " " + time + "] " + message);
	}
}
