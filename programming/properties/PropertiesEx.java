import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesExample {
	public static void main(String[] args) throws Exception {
		Properties properties  = new Properties();
		String path = PropertiesExample.class.getResource("db.properties").getPath();
		path = URLDecoder.decode(path, "utf-8");  //path의 경로위치를 utf-8로 다시 복원
		properties.load(new FileReader(path));    //파일 경로에 있는 properties 파일을 FileReader()메소드로 읽어들이기
		
		String A = properties.getProperty("A");		//A 변수에 'A'라는 키로 대응되는 값 저장
		String B = properties.getProperty("B");		//B 변수에 'B'라는 키로 대응되는 값 저장
		String c = properties.getProperty("C");		//C 변수에 'C'라는 키로 대응되는 값 저장
		 
		
		System.out.println("A : " + A);		//"A : apple" 출력
		System.out.println("B : " + B);		//"B : banana" 출력
		System.out.println("C : " + C);		//"C : candy" 출력
	}
}
