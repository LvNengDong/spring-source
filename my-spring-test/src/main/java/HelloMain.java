import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @Author lnd
 * @Description
 * @Date 2022/7/28 1:03
 */
public class HelloMain {
	public static void main(String[] args) {
		String xmlPath = "";
		FileSystemXmlApplicationContext applicationContext = new FileSystemXmlApplicationContext(xmlPath);

		System.out.println("HH");
	}
}
