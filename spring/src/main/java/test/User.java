package test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import coupling.Phone;

public class User {

	public static void main(String[] args) {

		AbstractApplicationContext factory=new GenericXmlApplicationContext("applicationContext.xml");
		
		Cha c1=(Cha)factory.getBean("game"); // �����Ǵ� ĳ���Ͱ� Timo�ϼ��ֵ��� �۾����ּ���!~~
		c1.attack(); // ĳ������ ����� ��ü�� ���� �߻�
	
		factory.close();
		
	}

}
