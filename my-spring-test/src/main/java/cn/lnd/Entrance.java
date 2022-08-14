package cn.lnd;

import cn.lnd.service.WelcomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @Author lnd
 * @Description
 * @Date 2022/8/4 22:35
 */
public class Entrance {
	public static void main(String[] args) {
		//System.out.println("Hello world");
		// 1、获取容器：解析配置文件，生成容器实例
		String xmlPath = "E:\\Source\\spring-source\\spring-framework-5.2.0.RELEASE\\my-spring-test\\src\\main\\resources\\spring\\spring-config.xml";
		ApplicationContext ac = new FileSystemXmlApplicationContext(xmlPath);

		// 2、获取容器中的bean实例
		WelcomeService welcomeService = ac.getBean("welcomeService", WelcomeService.class);
		welcomeService.sayHello("Spring Framework");

	}
}
