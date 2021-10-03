package collection;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		AbstractApplicationContext factory=new GenericXmlApplicationContext("applicationContext.xml");

		CollectionBean cb=(CollectionBean)factory.getBean("cb");
		List<String> data=cb.getDataList();
		for(String v:data) {
			System.out.println(v);
		}

		factory.close();
	}
}
