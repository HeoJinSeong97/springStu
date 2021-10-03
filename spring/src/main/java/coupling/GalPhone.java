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
		System.out.println("°¶·°½Ã »ý¼ºµÊ");
	}
	@Override
	public void powerOn() {
		System.out.println("°¶·°½Ã Àü¿øON");
	}
	@Override
	public void powerOff() {
		System.out.println("°¶·°½Ã Àü¿øOFF");
	}
	@Override
	public void volumeUp() {
		System.out.println("°¶·°½Ã ¼Ò¸®++");
	}
	@Override
	public void volumeDown() {
		System.out.println("°¶·°½Ã ¼Ò¸®--");
	}
}
