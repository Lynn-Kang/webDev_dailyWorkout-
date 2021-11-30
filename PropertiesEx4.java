package javabase.ch11;

import java.util.Properties;

public class PropertiesEx4 {

	public static void main(String[] args) {

		Properties sysProp = System.getProperties();
		//Properties sysPropTest = HashMap.getProperties(); 모든 클래스에서 확인할 수 있는 메소드는 아니구나
		
		System.out.println("java.version : " + sysProp.getProperty("java.version")); // java.version의 value를 가져와~~
		System.out.println("user.language : " + sysProp.getProperty("user.language"));
		System.out.println();
		System.out.println("추가적으로 뽑아본 sysProp key들(으흠 이런 정보도 가져올 수 있구나!)");
		System.out.println(sysProp.getProperty("java.vm.vendor"));
		System.out.println(sysProp.getProperty("java.class.path"));
		System.out.println(sysProp.getProperty("sun.jnu.encoding"));
		System.out.println();
		sysProp.list(System.out); // 화면에 출력
	}

}
