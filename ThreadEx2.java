package javabase.ch13;

public class ThreadEx2 {

	public static void main(String[] args) throws Exception {

		ThreadEx2_1 t1 = new ThreadEx2_1(); 
		t1.start(); //start() 호출> main쓰레드는 이미 종료되고 new call stack 생성한 후, run() 호출됨
	}
}

class ThreadEx2_1 extends Thread {
	
	// 호출스택의 첫번째 메서드
	public void run() {
		throwException(); //새로 생성한 쓰레드에서 고의로 예외 발생
	}
	
	public void throwException() {
		try {
			throw new Exception();
		} catch (Exception e) {
			e.printStackTrace(); // 예외 발생 당시의 호출스택 출력
		}
	}
}
