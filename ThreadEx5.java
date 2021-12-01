package javabase.ch13;

// 여러 개의 쓰레드가 2가지 작업을 번갈아가며 수행하는 것 구현(multi core가 concurrent 한다 : 병행)
public class ThreadEx5 {
	
	static long startTime = 0;

	public static void main(String[] args) {

		ThreadEx5_1 th1 = new ThreadEx5_1();
		th1.start();
		
		startTime = System.currentTimeMillis(); 
		
		for(int i=0; i<300; i++) {
			System.out.printf("%s", new String("-"));
		}
		System.out.print("소요시간1:"+(System.currentTimeMillis()-ThreadEx5.startTime));	
	
		System.out.println();
	}
}

class ThreadEx5_1 extends Thread {
	
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.printf("%s", new String("|"));
		}
		System.out.print("소요시간2:"+(System.currentTimeMillis()-ThreadEx5.startTime));	
	}
}
/*
 * 
 
------------------------------------|||||||||||||||||||||||||||||||||||||||||||||||||
|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
||||||||||||----------------------------------|||||||||||||||||||||||||||||||||||||||
||||||||||||||||||||||||||||||-------------------------------------------------------
------------------------------------------------------------------------소요시간2:70----
-------------------------------------------------------------------------------------
--------------소요시간1:76  
 * */
