package coupling;

public class BeanFactory {
	// ´À½¼ÇÑ °áÇÕ»óÅÂ¸¦ ¸¸µé¾îÁÜ
	// °´Ã¼»ı¼ºÀÌ Ä¸½¶È­
	public Object getBean(String beanName) {
		if(beanName.equals("i")) {
			return new IPhone();
		}
		else if(beanName.equals("gal")) {
			return new GalPhone();
		}
		return null;
	}
}
