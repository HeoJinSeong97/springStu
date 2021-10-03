package coupling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("phone")
public class IPhone implements Phone {
	@Autowired
	private Watch watch;
	private String user;
	public IPhone() {
		System.out.println("아이폰 생성됨");
	}
	
	public void setWatch(Watch watch) {
		this.watch = watch;
		System.out.println("아이폰-setWatch() 호출됨");
	}

	public void setUser(String user) {
		this.user = user;
		System.out.println("아이폰-setUser() 호출됨");
	}

	/*
	public IPhone(Watch watch) {
		System.out.println("아이폰 생성됨2");
		this.watch=watch;
	}
	public IPhone(Watch watch,String user) {
		System.out.println("아이폰 생성됨3");
		this.watch=watch;
		this.user=user;
	}
	*/
	public void initPhone() {
		System.out.println("아이폰-멤버변수가 있다면, 초기화");
	}
	public void powerOn() {
		System.out.println("아이폰 전원ON "+this.user+"님");
	}
	public void powerOff() {
		System.out.println("아이폰 전원OFF");
	}
	public void volumeUp() {
		//watch=new SmartWatch();
		watch.volumeUp();
		//System.out.println("아이폰 소리++");
	}
	public void volumeDown() {
		//watch=new SmartWatch();
		watch.volumeDown();
		//System.out.println("아이폰 소리--");
	}
}
