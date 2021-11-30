package javabase.ch11;

import java.util.ArrayList;
import java.util.Enumeration;
import static java.util.Collections.*;
//import java.util.Collections;
import java.util.List;

public class CollectionsEx1 {

	public static void main(String[] args) {

		List list = new ArrayList();
		System.out.println(list);

		// Line 4처럼 import static java.util.Collections.* or import
		// java.util.Collections 하고나서 Collections 클래스로 매번 접근. ex) Collections.addAll()
		addAll(list, 1, 2, 3, 4, 5);
		System.out.println(list);

		rotate(list, 2); // 오른쪽으로 2칸씩이동
		System.out.println(list);

		swap(list, 0, 2); // index 0번째와 2번째 교환
		System.out.println(list);

		shuffle(list);
		System.out.println(list); // 저장된 요소 위치를 임의로 변경

		sort(list, reverseOrder()); // 역순 정렬
		System.out.println(list);

		sort(list);
		System.out.println(list); // 정렬

		int idx = binarySearch(list, 4);
		System.out.println("index of 4 = " + idx); // 요소 4가 저장된 위치(idx)출력

		System.out.println("max= " + max(list));
		System.out.println("min= " + min(list));
		System.out.println("min= " + max(list, reverseOrder())); // list 요소중 max의 역순 = min

		fill(list, 7);
		System.out.println("list :" + list);

		// list와 같은 크기의 새로운 list 인스턴스 생성. 요소는 2로 채우기
		List newList = nCopies(list.size(), 2);
		System.out.println("newList =" + newList);

		// 공통요소가 있는지 없는지(없으면 true)
		System.out.println(disjoint(list, newList));

		// list 요소를 newList의 요소로 대체(copy)한다. -> 바뀌는 것은 list(o), newList(x)
		copy(list, newList);
		System.out.println("newList " + newList);
		System.out.println("list" + list);
		
		replaceAll(list, 2, 1);
		System.out.println("replaceAll list" + list);

		// Enumeration : 컬렉션에 저장된 요소 읽어오는 방법(Iterator와 메소드이름만다르지 기능 같아용) 현재는 Collection 인터페이스에 포함-> List,Set에서 각 컬렉션의 특징에 맞게 작성되어 있다		
		Enumeration e = enumeration(list);
		ArrayList list2 = list(e);
		
		System.out.println("list2"+list2);
	}

}
