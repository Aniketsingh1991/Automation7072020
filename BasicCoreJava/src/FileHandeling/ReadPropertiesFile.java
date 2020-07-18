package FileHandeling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

	public static void main(String[] args) throws Exception {
		
		Properties obj= new Properties();
		
		FileInputStream file= new FileInputStream("E:\\\\7072020\\\\Automation7072020\\\\BasicCoreJava\\\\src\\\\FileHandeling\\\\TestData.properties");

obj.load(file);
	
System.out.println(obj.get("name"));
System.out.println(obj.get("surname"));
System.out.println(obj.get("city"));
System.out.println(obj.get("location"));

throw new Exception("Testing");
	}

}
