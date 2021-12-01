package javabase.ch13;

public class ThreadEx3 {

	public static void main(String[] args) throws Exception {

		ThreadEx3_1 t1 = new ThreadEx3_1();
		t1.run(); //run() 호출>main쓰레드 안에서 run()이 호출됨(main쓰레드 종료되지않음)
	}
}

class ThreadEx3_1 extends Thread {

	public void run() {
		throwException();
	}
	
	public void throwException() {
		try {
			throw new Exception();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}