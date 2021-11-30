package javabase.ch13;

public class ThreadEx1 {
	
	/* 쓰레드를 구현하는 2가지 방법 : 
	 * 1) Thread 클래스 상속
	 * 2) Runnable 인터페이스 구현
	 * 보통은 2) 사용이 일반적이다. 왜냐하면 1) 사용하면 다른 클래스를 상속받을 수 없기 떄문! => 2)번을 더 확실히 알아놓자
	 * : 추가적으로 알아보니 Thread 클래스 자체도 Runnable을 구현한 클래스이다! (public class Thread implements Runnable 선언부)
	 * */
	
	/* 클래스의 curly bracket('}')이 잘 닫혀 있지 않으면, 다음과 같은 Error 발생
	Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		No enclosing instance of type ThreadEx1 is accessible. 
	 	Must qualify the allocation with an enclosing instance of type ThreadEx1 (e.g. x.new A() where x is an instance of ThreadEx1)*/
	
	public static void main(String[] args) {

		// 1): Thread의 자손클래스의 인스턴스 생성
		ThreadEx1_1 t1 = new ThreadEx1_1();

		// 2): Runnable 인터페이스를 구현한 클래스의 인스턴스 생성-> Thread의 생성자에서 그 인스턴스를 참조되고 있음
		Runnable r = new ThreadEx1_2();
		Thread t2 = new Thread(r); 

		// 쓰레드 실행. 자신의 차례가 되면 실행됨. 
		t1.start();
		t2.start();
		
		// 쓰레드는 1회용이기 떄문에 start() 1번만 호출할수 있음. t1,t2 다시 start()하고 싶으면 새로운 쓰레드 생성 후에 재호출 가능.
		// t1 = new ThreadEx1_1();
		// t1.start();
		
		// t2 = new ThreadEx1_2();
		// t2.start();
	}
}
	// 1) Thread 클래스를 상속받은 자손클래스
	class ThreadEx1_1 extends Thread {

		// run() body 구현하기
		public void run() {

			for (int i = 0; i < 5; i++) {
				// 쓰레드의 이름 반환
//				Thread 클래스 직접 상속받았을 때는 getName()만으로 간단히 호출 가능
				System.out.println(getName()); 
				
				// 현재 실행중인 쓰레드 반환
				//System.out.println(currentThread());
				
				// 쓰레드 이름 변경
				
			}
		}
	}
	
	// 2) Runnable 인터페이스를 구현한 클래스
	class ThreadEx1_2 implements Runnable {
		
		// run() body 구현하기
		public void run() {
			for (int i = 0; i < 5; i++) {
				// 쓰레드의 이름 반환
//					Runnable 인터페이스 구현하면 Thread의 static메서드를 호출해서 쓰레드에 대한 참조를 얻어 와야 호출 가능하다
				System.out.println(Thread.currentThread().getName());
				
				// 현재 실행중인 쓰레드 반환
				//System.out.println(Thread.currentThread());
				
				// 쓰레드 이름 변경
				
			}
		}
	}
