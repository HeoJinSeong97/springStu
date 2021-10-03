package test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import coupling.Phone;

public class User {

	public static void main(String[] args) {

		AbstractApplicationContext factory=new GenericXmlApplicationContext("applicationContext.xml");
		
		Cha c1=(Cha)factory.getBean("game"); // 제공되는 캐릭터가 Timo일수있도록 작업해주세요!~~
		c1.attack(); // 캐릭터의 무기는 교체가 자주 발생
	
		factory.close();
		
	}

}
