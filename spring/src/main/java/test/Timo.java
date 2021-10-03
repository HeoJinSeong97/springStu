package test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("game")
public class Timo implements Cha{

	@Autowired
	private Weapon weapon;
	
	@Override
	public void attack() {
		weapon.attack();
	}

}
