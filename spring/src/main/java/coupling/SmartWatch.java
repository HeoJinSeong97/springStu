package coupling;

public class SmartWatch implements Watch{
	public SmartWatch() {
		System.out.println("����Ʈ��ġ ������");
	}
	public void volumeUp() {
		System.out.println("����Ʈ��ġ �Ҹ�++");
	}
	public void volumeDown() {
		System.out.println("����Ʈ��ġ �Ҹ�--");
	}
}
