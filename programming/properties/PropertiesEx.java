import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesExample {
	public static void main(String[] args) throws Exception {
		Properties properties  = new Properties();
		String path = PropertiesExample.class.getResource("db.properties").getPath();
		path = URLDecoder.decode(path, "utf-8");  //path의 경로위치를 utf-8로 다시 복원
		properties.load(new FileReader(path));    //파일 경로에 있는 properties 파일을 FileReader()메소드로 읽어들이기
		
		String A = properties.getProperty("A");
		String B = properties.getProperty("B");
		String c = properties.getProperty("C");
		 
		
		System.out.println("A : " + A);
		System.out.println("B : " + B);
		System.out.println("C : " + C);
	}
}
