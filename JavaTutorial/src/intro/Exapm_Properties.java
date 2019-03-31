package intro;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Exapm_Properties {

	public static void main(String[] args) throws IOException {
		String path="C:\\Users\\bharath\\Desktop\\java virtual\\java programs\\JavaTutorial\\src\\test.properties";
		
		Properties prop=new Properties();
		FileInputStream fs=new FileInputStream(path);
		
		
		prop.load(fs);
		System.out.println(prop.getProperty("system"));
	}

}
