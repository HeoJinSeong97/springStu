package coupling;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class PhoneUser {

	public static void main(String[] args) {
		
		AbstractApplicationContext factory=new GenericXmlApplicationContext("applicationContext.xml");
		// XmlWebApplicationContext << Spring
		
		Phone phone=(Phone)factory.getBean("phone");
		phone.powerOn();
		phone.volumeUp();
		phone.volumeDown();
		/*
		System.out.println("==========");
		
		Phone phone2=(Phone)factory.getBean("galphone");
		phone2.powerOn();
		phone2.volumeUp();
		phone2.volumeDown();
		*/
		factory.close();
		
		/*
		BeanFactory bf=new BeanFactory();
		Phone phone=(Phone)bf.getBean(args[0]);
		// 필요한 객체를 말만하면,
		// 객체를 생성하는 주체는 BeanFactory이다.
		phone.powerOn();
		phone.volumeUp();
		*/
	}

}
