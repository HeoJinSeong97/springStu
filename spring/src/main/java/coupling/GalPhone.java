package coupling;

import org.springframework.stereotype.Component;

@Component("galphone")
public class GalPhone implements Phone {
	/*
	public void turnOn() {
		
	}
	public void turnOff() {
		
	}
	public void soundUp() {
		
	}
	public void soundDown() {
		
	}
	*/
	private Watch watch;
	public void setWatch(Watch watch) {
		this.watch = watch;
	}
	public GalPhone() {
		System.out.println("������ ������");
	}
	@Override
	public void powerOn() {
		System.out.println("������ ����ON");
	}
	@Override
	public void powerOff() {
		System.out.println("������ ����OFF");
	}
	@Override
	public void volumeUp() {
		System.out.println("������ �Ҹ�++");
	}
	@Override
	public void volumeDown() {
		System.out.println("������ �Ҹ�--");
	}
}
