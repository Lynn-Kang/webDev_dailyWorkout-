package javabase.ch11;

import java.util.Arrays;

public class ArraysEx {

	public static void main(String[] args) {

		int[] arr = { 0, 1, 2, 3, 4 };
		int[][] arr2D = { { 11, 12, 13 }, { 21, 22, 23 } };

		System.out.println("arr= " + Arrays.toString(arr)); // 1차원배열의 요소를 문자열로
		System.out.println("arr2D= " + Arrays.deepToString(arr2D)); // 다차원배열의 요소를 문자열로 deepXXX (toString으로 하면 참조하는 주소값들이
																	// 출력됨)

		int[] arr2 = Arrays.copyOf(arr, arr.length); // arr배열을 arr 크기만큼(전체) 복사할거야
		int[] arr3 = Arrays.copyOf(arr, 3); // 크기 3만큼 복사
		int[] arr4 = Arrays.copyOf(arr, 7); // 크기 7만큼 복사(제시된 배열크기보다 큰 것도 가능:빈자리는 0)
		int[] arr5 = Arrays.copyOfRange(arr, 2, 4); // idx 2~4까지 복사
		int[] arr6 = Arrays.copyOfRange(arr, 0, 7); // 배열의 부분 복사도 배열크기보다 큰 것 가능:빈자리는 also 0

		System.out.println("arr2 : " + Arrays.toString(arr2));
		System.out.println("arr3 : " + Arrays.toString(arr3));
		System.out.println("arr4 : " + Arrays.toString(arr4));
		System.out.println("arr5 : " + Arrays.toString(arr5));
		System.out.println("arr6 : " + Arrays.toString(arr6));

		int[] arr7 = new int[5]; // 크기 5인 arr7 인스턴스 생성
		Arrays.fill(arr7, 9); // arr7을 숫자 9로 채울거야
		System.out.println("arr7 =" + Arrays.toString(arr7));

		Arrays.setAll(arr7, i -> (int) (Math.random() * 6) + 1); // arr7을 파라미터가 int인 0~6까지 랜덤한 숫자선택+1 더한 수로 채울거야
		System.out.println("arr7 =" + Arrays.toString(arr7)); // ★중요! fill과 setAll을 해도 기존 데이터가 덮어씌워지지는 않음

			for (int i : arr7) {	// arr7 크기만큼 반복
				char[] graph = new char[i];		// arr7 크기만큼의 문자 배열인 graph 인스턴스생성
				Arrays.fill(graph, '*'); // 배열 원소는 *로 찍을거야
				System.out.println(new String(graph)+i);	//만들어낸 배열 원소를 찍어내는 String 인스턴스 생성후 *의 개수를 숫자로 옆에 찍어줄거야
			}
		
		String[][] str2D = new String[][] {{"aaa","bbb"},{"AAA","BBB"}}; //aaa,bbb와 AAA,BBB를 각각 원소로 하는 다차원배열
		String[][] str2D2 = new String[][] {{"aaa","bbb"},{"AAA","BBB"}};
		
		System.out.println(Arrays.equals(str2D, str2D2)); 
		System.out.println(Arrays.deepEquals(str2D, str2D2));	// 다차원배열 비교는 deepXXXX
		
		char[] chArr = {'A','D','C','B','E'};
		
		System.out.println("chArr= " + Arrays.toString(chArr));
		System.out.println("index of B = " + Arrays.binarySearch(chArr, 'B'));	//sorting 하기전 잘.못.된. 결과가 ㅠㅠ
		System.out.println("After Sorting===");
		Arrays.sort(chArr); //정렬
		System.out.println("chArr= " + Arrays.toString(chArr));
		System.out.println("index of B = " + Arrays.binarySearch(chArr, 'B'));	//sorting 한뒤에 B의 인덱스를 찾을 땐 왼쪽부터!
		
	}
}