package javabase.ch11;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesEx1 {

	public static void main(String[] args) {
		// HashMap 구버전인 HashTable 상속받아 구현. (String,String) 형태로 데이터 저장
		// ㄴ 주로 application의 config 관련 속성을 저장하는데 사용.
		// ㄴ 파일로부터 데이터 읽고 씀
		
		Properties prop = new Properties();

		// prop에 키와 값(key, val) 저장
		prop.setProperty("timeout", "30"); //element, property에 해당
		prop.setProperty("language", "kr");
		prop.setProperty("size", "10");
		prop.setProperty("capacity", "10");

		// prop 저장된 요소들 Enumeration 이용하여 출력
		Enumeration e = prop.propertyNames();
		// System.out.println(e); java.util.Hashtable$Enumerator@182decdb
		while (e.hasMoreElements()) {
			String element = (String) e.nextElement();
			System.out.println(element + "=" + prop.getProperty(element));
		}
		
		System.out.println();
		prop.setProperty("size", "20");
		System.out.println("size = " + prop.getProperty("size"));	//바로윗줄만 시행했을 때: size의 prop변하지않음.getProperty까지해야 변함
		System.out.println("capacity = " + prop.getProperty("capacity","20"));	//capacity의 prop가져와, 없으면 20으로 채워줘~ (있어서 10 그대로)
		System.out.println("loadfactor = " + prop.getProperty("loadfactor","0.75"));	//loadfactor element없으므로 default value인 0.75 출력됨
	
		System.out.println(prop);	// {size=20, language=kr, timeout=30, capacity=10} setProperty는 mutable함
		prop.list(System.out);	// prop 저장된 요소들을 화면(System.out)에 출력
//		-- listing properties --
//		size=20
//		language=kr
//		timeout=30
//		capacity=10
	}

}
