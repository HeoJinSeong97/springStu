package coupling;

public class AppleWatch implements Watch{
	public AppleWatch() {
		System.out.println("局敲况摹 积己凳");
	}
	@Override
	public void volumeUp() {
		System.out.println("局敲况摹 家府++");
	}

	@Override
	public void volumeDown() {
		System.out.println("局敲况摹 家府--");
	}

}
