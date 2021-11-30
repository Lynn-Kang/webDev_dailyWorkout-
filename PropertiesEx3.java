package javabase.ch11;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesEx3 {

	public static void main(String[] args) {

		Properties prop = new Properties();
		
		prop.setProperty("timeout", "30");	//element와 properties 키와 값 저장
		prop.setProperty("language", "한글");
		prop.setProperty("size", "10");
		prop.setProperty("capacity", "10");
		
		try {
			prop.store(new FileOutputStream("output.txt"), "Properties Example of txt"); //해당 txt파일로 저장
			prop.storeToXML(new FileOutputStream("output.xml"), "Properties Example of XML"); //해당 xml파일로 저장
			System.out.println("txt파일 및 xml파일로 출력완료");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
